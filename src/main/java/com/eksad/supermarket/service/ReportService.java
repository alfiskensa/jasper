package com.eksad.supermarket.service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.lucene.document.Field.Index;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eksad.supermarket.dao.TransactionDao;
import com.eksad.supermarket.entity.Transaction;
import com.eksad.supermarket.entity.TransactionDetail;
import com.eksad.supermarket.entity.TransactionReport;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class ReportService {
	
	@Autowired
	private TransactionDao transactionDao;
	BigDecimal overall = new BigDecimal("0");
	
	public String generateReport() {
		try {

			List<Object[]> transaction = transactionDao.transactionReport();
			List<TransactionReport> transactionlist = new ArrayList<>();
			
			for(Object[] trs : transaction) {
				TransactionReport tr = new TransactionReport();
				tr.setId((BigInteger) trs[0]);
				tr.setDate((Date) trs[1]);
				tr.setProduct((String) trs[2]);
				tr.setPrice((BigDecimal) trs[3]);
				tr.setQuantity((Integer) trs[4]);
				tr.setTotal((BigDecimal) trs[5]);
				overall = overall.add(tr.getTotal());
				transactionlist.add(tr);
			}
			

			String reportPath = "D:\\eclipse-workspace\\supermarket\\src\\main\\resources";

			// Compile the Jasper report from .jrxml to .japser
			JasperReport jasperReport = JasperCompileManager
					.compileReport(reportPath + "\\transaction_report.jrxml");

			// Get your data source
			JRBeanCollectionDataSource jrBeanCollectionDataSource = new JRBeanCollectionDataSource(transactionlist);

			// Add parameters
			Map<String, Object> parameters = new HashMap<>();

			parameters.put("createdBy", "Alfi Ramdhani");
			parameters.put("overall", overall);

			// Fill the report
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters,
					jrBeanCollectionDataSource);

			// Export the report to a PDF file
			JasperExportManager.exportReportToPdfFile
			(jasperPrint, reportPath + "\\transaction_report.pdf");

			System.out.println("Done");

			return "Report successfully generated @path= " + reportPath;
		} catch (Exception e) {
			e.printStackTrace();
			return "Error--> check the console log";
		}
	}

}

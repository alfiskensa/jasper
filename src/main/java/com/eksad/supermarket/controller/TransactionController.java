package com.eksad.supermarket.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eksad.supermarket.dao.TransactionDao;
import com.eksad.supermarket.entity.Transaction;
import com.eksad.supermarket.service.ReportService;


@RestController
@RequestMapping("/transaction")
public class TransactionController {
	
	@Autowired
	private TransactionDao transactionDao;
	
	@Autowired
	private ReportService reportService;
	
	@GetMapping
	Iterable<Transaction> getAllTransaction(){
		return transactionDao.findAll();
	}
	
	@GetMapping("/{id}")
	Transaction getTransactionById(@PathVariable("id") Long id) {
		return transactionDao.findById(id).get();
	}
	
	@PostMapping
	Transaction saveTransaction(@RequestBody Transaction transaction) {
		return transactionDao.save(transaction);
	}
	
	@GetMapping("/report")
	public String generateReport() {
		return reportService.generateReport();
	}

}

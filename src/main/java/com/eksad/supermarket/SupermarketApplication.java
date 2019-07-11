package com.eksad.supermarket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;

import com.eksad.supermarket.dao.BrandDao;
import com.eksad.supermarket.dao.CashierDao;
import com.eksad.supermarket.dao.CustomerDao;
import com.eksad.supermarket.dao.PersonDao;
import com.eksad.supermarket.dao.ProductDao;
import com.eksad.supermarket.dao.ProductElectronicDao;
import com.eksad.supermarket.dao.ProductGroceryDao;
import com.eksad.supermarket.dao.TransactionDao;
import com.eksad.supermarket.entity.HelloService;
import com.eksad.supermarket.entity.Person;
import com.eksad.supermarket.service.ReportService;

@SpringBootApplication
public class SupermarketApplication 
{
	public static void main(String[] args)
	{
		SpringApplication.run(SupermarketApplication.class, args);
	}
	
//	@Autowired
//	private BrandDao brandDao;
//	
//	@Autowired
//	private ProductDao productDao;
//	
//	@Autowired
//	private PersonDao personDao;
//	
//	@Autowired
//	private HelloService helloService;
//	
//	@Autowired
//	private TransactionDao transactionDao;
//	
//	@Autowired
//	private CashierDao cashierDao;
//	
//	@Autowired
//	private CustomerDao customerDao;
//	
//	@Autowired
//	private ProductGroceryDao productGroceryDao;
//	
//	@Autowired
//	private ProductElectronicDao productElectronicDao;
//
//	@Override
//	@Transactional
//	public void run(ApplicationArguments args) throws Exception
//	{
//		Page<Person> page = personDao
//				.findAll(PageRequest.of(2, 25, Sort.by("name")));
//		
//		System.out.println("total element: " + page.getTotalElements());
//		System.out.println("total page: " + page.getTotalPages());
//		page.forEach(System.out::println);
//		
//		transactionDao.findAll().forEach(System.out::println);
//		
		/*System.out.println(transactionDao.findTotalItemByTransactionId(1L));
		
		List<Object[]> totals = 
				transactionDao.findTotalNominalPerTransaction();
		
		for(Object[] total : totals)
		{
			System.out.println("id: " + total[0]);
			System.out.println("total: " + total[1]);
		}*/
		
		/*System.out.println("Grocery");
		productGroceryDao.findAll().forEach(System.out::println);
		
		System.out.println("Electronic");
		productElectronicDao.findAll().forEach(System.out::println);
		
		System.out.println("Product");
		productDao.findAll().forEach(System.out::println);
		
		System.out.println("Cashier");
		cashierDao.findAll().forEach(System.out::println);
		
		System.out.println("Customer");
		customerDao.findAll().forEach(System.out::println);
		
		System.out.println("Person");
		personDao.findAll().forEach(System.out::println);*/
		
		//brandDao.findAll().forEach(System.out::println);
		
		/*Brand brand1 = new Brand();
		brand1.setName("Brand test #1");
		brand1.setProductType("Test #1");
		brandDao.save(brand1);
		
		String bikinError = null;
		bikinError.split(",");
		
		Brand brand2 = new Brand();
		brand2.setName("Brand test #2");
		brand2.setProductType("Test #2");
		brandDao.save(brand2);*/
		
		/*Brand brand = brandDao.findOneByName("Nestle").stream()
				.findFirst()
				.orElse(new Brand());
		
		if(brand != null)
		{
			brand.setProductType("Food and Drinks");
			brandDao.save(brand);
		}
		
		brandDao.findAll().forEach(System.out::println);*/
		
		/*Transaction transaction = transactionDao.findById(1L).get();
		System.out.println("==DONE GET TRANS==");
		transaction.getDetails().size();
		
		transactionDao.findAll()
				.forEach(System.out::println);*/
		
		/*Person person = new Person();
		person.setName("Jane Fulan");
		
		PersonAddress address = new PersonAddress();
		address.setAddress("Kebun Raya");
		address.setCity("Bogor");
		
		person.setAddress(address);
		address.setPerson(person);
		
		//personDao.save(person);
		
		personDao.findAll()
				.forEach(System.out::println);*/
		
		/*Product product = new Product();
		product.setName("Cimory Susu Coklat");
		product.setPrice(new BigDecimal(15000));
		
		Brand brand = brandDao.findById(1L).get();
		product.setBrand(brand);
		
		productDao.save(product);
		
		productDao.findAll()
				.forEach(System.out::println);*/
//	}
}

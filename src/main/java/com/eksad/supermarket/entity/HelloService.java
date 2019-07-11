package com.eksad.supermarket.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.eksad.supermarket.dao.BrandDao;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class HelloService
{
	@Autowired
	private BrandDao brandDao;
	
	private String greetings;
	
	public String sayHello(String name)
	{
		brandDao.save(null);
		brandDao.findAll().forEach(System.out::println);
		
		return greetings + ", " + name;
	}
}
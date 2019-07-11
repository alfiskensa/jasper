package com.eksad.supermarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eksad.supermarket.dao.BrandDao;
import com.eksad.supermarket.entity.Brand;

@RestController
@RequestMapping("/brand")
public class BrandController
{
	@Autowired
	private BrandDao brandDao;
	
	@GetMapping
	public Iterable<Brand> findAll()
	{
		return brandDao.findAll();
	}
	
	@GetMapping("/{id}")
	public Brand findById(@PathVariable("id") Long id)
	{
		return brandDao.findById(id).orElse(null);
	}
	
	@PostMapping
	public void create(@RequestBody Brand brand)
	{
		brandDao.save(brand);
	}
}
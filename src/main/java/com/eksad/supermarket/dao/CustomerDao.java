package com.eksad.supermarket.dao;

import org.springframework.data.repository.CrudRepository;

import com.eksad.supermarket.entity.Customer;

public interface CustomerDao extends CrudRepository<Customer, Long>
{

}
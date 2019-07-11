package com.eksad.supermarket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Table(name = "brand")
public class Brand extends BaseEntity
{
	@Column(nullable = false)
	private String name;
	
	@Column(name = "product_type")
	private String productType;
}
package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name="PRODUCT_TBL")
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Product {
	
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String quantity;
	private double price;
//	public Integer getId() {
//		// TODO Auto-generated method stub
//		return null;
	}
	
	
	
	
	


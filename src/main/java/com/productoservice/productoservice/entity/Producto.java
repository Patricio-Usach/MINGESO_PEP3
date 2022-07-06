package com.productoservice.productoservice.entity;


import javax.persistence.*;
//import lombok.*;

@Entity
//@Data
//@NoArgsConstructor
//@AllArgsConstructor

public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String mane;
	private int price;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMane() {
		return mane;
	}
	public void setMane(String mane) {
		this.mane = mane;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}

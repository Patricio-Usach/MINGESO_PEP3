package com.productoservice.productoservice.service;

import java.util.List;

//import java.util.Optional;
//import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productoservice.productoservice.entity.*;
import com.productoservice.productoservice.repository.*;

@Service
public class ProductoService {
	
	@Autowired
	private ProductoRepository productoRepository; 

	
	public List<Producto> getAllProducto(){
		return productoRepository.findAll();
	}

	
/*
	public List<Producto> getAll(){
		return productoRepository.findAll();
	}
/*
	public ArrayList<ProductoModels> obtenerProducto(){
		return (ArrayList<ProductoModels>) productoRepository.findAll();
	} 
	
	public ProductoModels guardarProducto(ProductoModels producto) {
		return productoRepository.save(producto);
	}
	
	public Optional<ProductoModels> obtenerPorId(Integer id){
		return productoRepository.findById(id);
	}

	public boolean eliminarProducto(Integer id) {
		try {
			productoRepository.deleteById(id);
			return true;
		}catch(Exception err) {
			return false;
		}
	}
*/
}

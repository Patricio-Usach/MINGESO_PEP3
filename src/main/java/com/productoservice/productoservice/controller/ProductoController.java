package com.productoservice.productoservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productoservice.productoservice.entity.*;
import com.productoservice.productoservice.service.*;

@CrossOrigin
@RestController
@RequestMapping("/producto")
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;

	/*
	@GetMapping("/all")
	public @ResponseBody List<Producto> ListarProductos(){
		return productoService.ListarProducto();
	}
	
*/
	@GetMapping("/all")
	public ResponseEntity<List <Producto>> getAllProducto(){
		List<Producto> productos = productoService.getAllProducto();
		if(productos.isEmpty())
			return ResponseEntity.noContent().build();
		return ResponseEntity.ok(productos);
	}

}
/*
	@GetMapping("/byproducto/{precioCambioId}")
	public ResponseEntity<List <Producto>> getByStudentId(@PathVariable("precioCambioId") int precioCambioId){
		List<Producto> productos = productoService.ByStudentId(precioCambioId);
		return ResponseEntity.ok(productos); 
	}
}


@GetMapping("/getAll")
public List<Producto>getAllProducto(){
	return productoService.getAllProducto();
}
*/

/*
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import models.ProductoModels;
import service.ProductoService;

@Controller
@RequestMapping
public class ProductoController {
	
	@Autowired
	ProductoService productoService;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		ArrayList<ProductoModels>productos=productoService.obtenerProducto();
		model.addAttribute("productos",productos);
		return "index";
	}

}
*/

package com.productoservice.productoservice.repository;

//import java.util.List;

//import java.util.List;

//import models.ProductoModels;
//import org.springframework.data.repository.CrudRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.productoservice.productoservice.entity.*;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
/* public interface ProductoRepository extends CrudRepository<ProductoModels, Integer> { */
	
	//List<Producto> findByStudentId(int precioCambioId);

}

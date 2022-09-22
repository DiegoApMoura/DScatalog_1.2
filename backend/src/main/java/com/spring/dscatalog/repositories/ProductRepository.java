package com.spring.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.dscatalog.entities.Category;
import com.spring.dscatalog.entities.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}

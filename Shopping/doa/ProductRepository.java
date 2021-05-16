package com.cap.Shopping.doa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cap.Shopping.bean.Prodcuct;


public interface ProductRepository extends JpaRepository<Prodcuct, Integer>, CustomProductRepository{

}

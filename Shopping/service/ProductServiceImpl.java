package com.cap.Shopping.service;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.Shopping.bean.Prodcuct;
import com.cap.Shopping.doa.ProductRepository;

import java.util.HashSet;
@SuppressWarnings("unused")
public class ProductServiceImpl implements ProductService{

	
	@Autowired
	ProductRepository repo;

	@Override
	public List<Prodcuct> getAllProductd() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Prodcuct saveProduct(Prodcuct p) {
		// TODO Auto-generated method stub
		repo.save(p);
		return p;
	}

	@Override
	public Prodcuct doUpdate(Prodcuct product, int productId) {
		// TODO Auto-generated method stub
		Prodcuct p = repo.findById(productId).get();
		if(p != null) {
			p.setProductId(product.getProductId());
			p.setProductName(product.getProductName());
			p.setProductCost(product.getProductCost());
			p.setStartRating(product.getStartRating());
			p.setCategory(product.getCategory());
		}
		return repo.save(p);
	}
	
	@Override
	public boolean deleteProductById(int id) {
		// TODO Auto-generated method stub
		boolean isDel = true;
		repo.deleteById(id);
		return isDel;
	}
	
	@Override
	public List<Prodcuct> getAllProductsByCategory(String category) {
		
		return repo.getProductByCategory(category);
	}

	@Override
	public List<Prodcuct> getAllProductsByCategoryAndPrice(String category, int range1, int range2) {
		
		return repo.getProductByCategoryAndPrice(category, range1, range2);
	}

}

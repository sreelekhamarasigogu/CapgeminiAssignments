package com.cap.Shopping.service;

import java.util.List;

import com.cap.Shopping.bean.Prodcuct;

public interface ProductService {
	public List<Prodcuct> getAllProductd();
	public Prodcuct saveProduct(Prodcuct p);
	public Prodcuct doUpdate(Prodcuct product, int productId);
	public boolean deleteProductById(int id);
	public List<Prodcuct> getAllProductsByCategoryAndPrice(String category, int range1, int range2);
	public List<Prodcuct> getAllProductsByCategory(String category);
}

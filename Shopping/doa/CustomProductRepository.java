package com.cap.Shopping.doa;
import java.util.List;
import com.cap.Shopping.bean.Prodcuct;

public interface CustomProductRepository {
	public List<Prodcuct> getProductByCategory(String proudctCategory);
	public List<Prodcuct> getProductByCategoryAndPrice(String proudctCategory,int range1,int range2);
}

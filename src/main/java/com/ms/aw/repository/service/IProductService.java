package com.ms.aw.repository.service;

import java.util.List;

import com.ms.aw.model.entity.Product;

public interface IProductService {
	
	List<Product> GetProductReorderPoint(long  number);
	List<Product> ProductColor(String  color);
}

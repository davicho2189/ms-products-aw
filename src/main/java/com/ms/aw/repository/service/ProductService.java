package com.ms.aw.repository.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.aw.model.entity.Product;
import com.ms.aw.repository.dao.IProductRepository;

@Service
public class ProductService implements IProductService{
	
	@Autowired
	private IProductRepository productRepository;
   
    public  List<Product> GetProductReorderPoint(long  number)
    {
        List<Product> products = productRepository.findAll().stream().filter(p->p.reorderPoint==number).collect(Collectors.toList());     
        return products;
    }
    
   
    public  List<Product> ProductColor(String  color)
    {
    	System.out.println(color);
        List<Product> products = productRepository.findAll();
        List<Product> prod = products.stream()
        		.filter(p->
        					p.color!=null && p.color.equals(p.color))
        		.collect(Collectors.toList());
      
        return prod;
    }
    
}

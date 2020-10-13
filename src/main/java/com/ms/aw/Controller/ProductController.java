package com.ms.aw.Controller;

import com.ms.aw.model.entity.Product;
import com.ms.aw.repository.dao.IProductRepository;
import com.ms.aw.repository.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ProductController {
	
	
	//    @Autowired
	//    private IProductService productService;
    @Autowired
    private IProductRepository productRepository;

    @GetMapping("/productAll")
    public List<Product> GetProduct()
    {
        List<Product> products = productRepository.findAll();
        return products;

    }

    @GetMapping("/productReorderPoint/{number}")
    public  List<Product> GetProductReorderPoint(@PathVariable long  number)
    {
        List<Product> products = productRepository.findAll().stream().filter(p->p.reorderPoint==number).collect(Collectors.toList());     
        return products;
    }
    
    @GetMapping("/productColor/{color}")
    public  List<Product> ProductColor(@PathVariable String  color)
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

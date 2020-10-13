package com.ms.aw.mockito;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ms.aw.model.entity.Product;
import com.ms.aw.repository.dao.IProductRepository;
import com.ms.aw.repository.service.IProductService;

import junit.framework.Assert;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class ProductControllerMockitoTest {

	private List<Product> products;

	@Autowired
	private IProductService productService;

	@Autowired
	private IProductRepository repository;

	  public void setUp() {
		    log.info("===> @BeforeEach setUp");
		    String nulled = null;
		    products =  Arrays.asList(
					new Product("Adjustable Race","AR-5381",nulled,1000,750,0.00,0.00,nulled,0),
					new Product("Bearing Ball","BA-8327",nulled,1000,750,0.00,0.00,nulled,0),
					new Product("BB Ball Bearing","BE-2349",nulled,800,600,0.00,0.00,nulled,1),
					new Product("Headset Ball Bearings","BE-2908",nulled,800,600,0.00,0.00,nulled,0),
					new Product("Blade","BL-2036",nulled,800,600,0.00,0.00,nulled,1),
					new Product("LL Crankarm","CA-5965","Black",500,375,0.00,0.00,"L ",0),
					new Product("ML Crankarm","CA-6738","Black",500,375,0.00,0.00,"M ",0),
					new Product("HL Crankarm","CA-7457","Black",500,375,0.00,0.00,nulled,0),
					new Product("Chainring Bolts","CB-2903","Silver",1000,750,0.00,0.00,nulled,0),
					new Product("Chainring Nut","CN-6137","Silver",1000,750,0.00,0.00,nulled,0),
					new Product("Chainring","CR-7833","Black",1000,750,0.00,0.00,nulled,0),
					new Product("Crown Race","CR-9981",nulled,1000,750,0.00,0.00,nulled,0),
					new Product("Chain Stays","CS-2812",nulled,1000,750,0.00,0.00,nulled,1),
					new Product("Decal 1","DC-8732",nulled,1000,750,0.00,0.00,nulled,0),
					new Product("Decal 2","DC-9824",nulled,1000,750,0.00,0.00,nulled,0),
					new Product("Down Tube","DT-2377",nulled,800,600,0.00,0.00,nulled,1),
					new Product("Mountain End Caps","EC-M092",nulled,1000,750,0.00,0.00,nulled,1),
					new Product("Road End Caps","EC-R098",nulled,1000,750,0.00,0.00,nulled,1),
					new Product("Touring End Caps","EC-T209",nulled,1000,750,0.00,0.00,nulled,1),
					new Product("Fork End","FE-3760",nulled,800,600,0.00,0.00,nulled,1),
					new Product("Freewheel","FH-2981","Silver",500,375,0.00,0.00,nulled,0),
					new Product("Flat Washer 1","FW-1000",nulled,1000,750,0.00,0.00,nulled,0),
					new Product("Flat Washer 6","FW-1200",nulled,1000,750,0.00,0.00,nulled,0),
					new Product("Flat Washer 2","FW-1400",nulled,1000,750,0.00,0.00,nulled,0),
					new Product("Flat Washer 9","FW-3400",nulled,1000,750,0.00,0.00,nulled,0),
					new Product("Flat Washer 4","FW-3800",nulled,1000,750,0.00,0.00,nulled,0),
					new Product("Flat Washer 3","FW-5160",nulled,1000,750,0.00,0.00,nulled,0),
					new Product("Flat Washer 8","FW-5800",nulled,1000,750,0.00,0.00,nulled,0),
					new Product("Flat Washer 5","FW-7160",nulled,1000,750,0.00,0.00,nulled,0),
					new Product("Flat Washer 7","FW-9160",nulled,1000,750,0.00,0.00,nulled,0)
					);
		  }
		  

	  @Test
	  public void GetProductReorderPoint() {
	        List<Product> product = productService.GetProductReorderPoint(375);
	        
	        Assert.assertNotNull(product);
	  }
	  
	  @Test
	  public void ProductColor() {
	        List<Product> product = productService.ProductColor("Black");
	        
	        Assert.assertNotNull(product);
	  }

}

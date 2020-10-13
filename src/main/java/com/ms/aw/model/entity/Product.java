package com.ms.aw.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name="Product",schema = "Production")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProductID")
    public int productID;
    
    @Column(name = "Name" , nullable = false)
    public String productNane; 
    
    
    @Column(name = "ProductNumber" , nullable = false)
    public String productNumber;
    
    @Column(name = "Color" , nullable = false)
    public String color;
    
    @Column(name = "SafetyStockLevel" , nullable = false)
    public int safetyStockLevel;
    
    @Column(name = "ReorderPoint" , nullable = false)
    public int reorderPoint;
    
    @Column(name = "StandardCost" , nullable = false)
    public Double standardCost;
    
    @Column(name = "ListPrice" , nullable = false)
    public Double listPrice;
    
    @Column(name = "Size" , nullable = false)
    public String size;
    
    @Column(name = "SizeUnitMeasureCode" , nullable = false)
    public String sizeUnitMeasureCode;
    
    @Column(name = "WeightUnitMeasureCode" , nullable = false)
    public String weightUnitMeasureCode;
    
    @Column(name = "Weight" , nullable = false)
    public Double weight;    
    
    @Column(name = "DaysToManufacture")
    public int daysToManufacture;
    
    @Column(name = "ProductLine" , nullable = true)
    public String productLine;
    
    @Column(name = "Class" , nullable = true)
    public String ProductClass;
    
    @Column(name = "Style" , nullable = true)
    public String style;
    
    @Column(name = "ProductSubcategoryID" , nullable = true)
    public Integer productSubcategoryID;
    
    @Column(name = "ProductModelID" , nullable = true)
    public Integer productModelID;
    
    @Column(name = "SellStartDate" , nullable = true)
    public Date sellStartDate;
    
    @Column(name = "SellEndDate" , nullable = true)
    public Date sellEndDate;
    
    @Column(name = "DiscontinuedDate" , nullable = false)
    public Date discontinuedDate;
    
    @JsonIgnore
    @Column(name = "rowguid" , nullable = false)
    public UUID rowguid;
    
    @Column(name = "ModifiedDate" , nullable = true)
    public Date modifiedDate;

	public Product(String productNane, String productNumber, String color, int safetyStockLevel, int reorderPoint,
			Double standardCost, Double listPrice,String productClass, int daysToManufacture) {
		super();
		this.productNane = productNane;
		this.productNumber = productNumber;
		this.color = color;
		this.safetyStockLevel = safetyStockLevel;
		this.reorderPoint = reorderPoint;
		this.standardCost = standardCost;
		this.listPrice = listPrice;
		this.ProductClass = productClass;
		this.daysToManufacture = daysToManufacture;
	}

    
	
    
    
}

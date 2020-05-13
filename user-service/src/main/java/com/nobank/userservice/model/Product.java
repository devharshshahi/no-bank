package com.nobank.userservice.model;

import javax.validation.constraints.NotNull;

public class Product {

    private String productId;
    
    private String name;
    
    private String imageUrl;

    private String bill;

    private int quantity;

    public Product(){}

    public Product(String productId, String bill, int quantity,String name, String imageUrl) {
        this.productId = productId;
        this.bill = bill;
        this.quantity = quantity;
        this.name  = name;
        this.imageUrl = imageUrl;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getBill() {
        return bill;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", imageUrl=" + imageUrl + ", bill=" + bill
				+ ", quantity=" + quantity + "]";
	}
    
    
}

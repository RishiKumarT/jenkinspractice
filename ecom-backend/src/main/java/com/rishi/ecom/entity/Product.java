package com.rishi.ecom.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_table")
public class Product {

	@Id
	@Column(name = "product_id")
	private int id;


    @Column(name = "product_name", nullable = false, length = 100)
    private String name;

    @Column(name = "product_description", length = 255)
    private String description;

    @Column(name = "product_price", nullable = false)
    private double price;

    @Column(name = "product_category", nullable = false, length = 50)
    private String category;

    @Column(name = "product_stock", nullable = false)
    private int stock;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", description=" + description +
                ", price=" + price + ", category=" + category + ", stock=" + stock + "]";
    }
}

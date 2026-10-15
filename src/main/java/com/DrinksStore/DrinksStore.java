package com.DrinksStore;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "drinks_store")
public class DrinksStore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="drink_id")
    private Long drinkId;

    @Column(name="drink_name")
    private String drinkName;

    @Column(name="drink_price")
    private BigDecimal drinkPrice;

    @Column(name="drink_description")
    private String drinkDescription;

    @Column(name="image_url")
    private String imageUrl;


    @Column(name="quantity")
    private Integer quantity;

    @Column(name = "category")
    private String category;

    public Long getDrinkId() {
        return drinkId;
    }

    public void setDrinkId(Long drinkId) {
        this.drinkId = drinkId;
    }

    public String getDrinkName(){
        return drinkName;
    }

    public void setDrinkName(String drinkName){
        this.drinkName=drinkName;
    }

    public BigDecimal getDrinkPrice(){
        return drinkPrice;
    }

    public void setDrinkPrice(BigDecimal drinkPrice){
        this.drinkPrice=drinkPrice;
    }

    public String getDrinkDescription(){
        return drinkDescription;
    }

    public void setDrinkDescription(String drinkDescription){
        this.drinkDescription=drinkDescription;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

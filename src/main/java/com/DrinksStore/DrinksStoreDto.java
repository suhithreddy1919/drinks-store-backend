package com.DrinksStore;

import java.math.BigDecimal;

public class DrinksStoreDto {
    private String drinkName;
    private BigDecimal drinkPrice;
    private String drinkDescription;
    private String imageUrl;
    private Integer quantity;
    private String category;

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public BigDecimal getDrinkPrice() {
        return drinkPrice;
    }

    public void setDrinkPrice(BigDecimal drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    public String getDrinkDescription() {
        return drinkDescription;
    }

    public void setDrinkDescription(String drinkDescription) {
        this.drinkDescription = drinkDescription;
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

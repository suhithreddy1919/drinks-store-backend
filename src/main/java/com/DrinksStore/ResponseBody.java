package com.DrinksStore;

public class ResponseBody {
    String message;
    Long drinkId;

    public ResponseBody(String message, Long id){
        this.drinkId=id;
        this.message=message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getDrinkId() {
        return drinkId;
    }

    public void setDrinkId(Long drinkId) {
        this.drinkId = drinkId;
    }
}

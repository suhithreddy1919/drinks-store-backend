package com.DrinksStore;

import java.util.List;

public interface DrinksStoreService {
    List<Object> getAllDrinks();
    Object getSelectedDrink(Long id);
    Long addDrinks(DrinksStoreDto drinksStoreDto);
    Long updateDrinks(DrinksStoreDto drinksStoreDto,Long id);
    Long deleteDrink(Long drinkId);
}

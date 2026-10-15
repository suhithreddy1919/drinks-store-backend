package com.DrinksStore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DrinksStoreServiceImpl implements DrinksStoreService{

    @Autowired
    private DrinksStoreDao drinksStoreDao;

    @Override
    @Transactional
    public List<Object> getAllDrinks() {
        return drinksStoreDao.getAllDrinks();
    }

    @Override
    @Transactional
    public Object getSelectedDrink(Long id) {
        return drinksStoreDao.getSelectedDrink(id);
    }

    @Override
    @Transactional
    public Long addDrinks(DrinksStoreDto drinksStoreDto) {

        return drinksStoreDao.addDrinks(drinksStoreDto);
    }

    @Override
    @Transactional
    public Long updateDrinks(DrinksStoreDto drinksStoreDto,Long id) {
        return drinksStoreDao.updateDrinks(drinksStoreDto,id);
    }

    @Override
    @Transactional
    public Long deleteDrink(Long drinkId) {
        return drinksStoreDao.deleteDrink(drinkId);
    }
}

package com.DrinksStore;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DrinksStoreDaoImpl implements DrinksStoreDao{

    private static final Logger log = LoggerFactory.getLogger(DrinksStoreDaoImpl.class);
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Object> getAllDrinks() {
        log.info("getAllDrinks has started");
            List<Object> list =
                    entityManager.createQuery("from DrinksStore").getResultList();

            if (!list.isEmpty()) {
                log.info("getAllDrinks has ended");
                return list;
            }

            return list;


    }

    @Override
    public Object getSelectedDrink(Long id) {
       log.info("method getSelectedDrink has started");
       List<Object> list = entityManager.createQuery("from DrinksStore where drinkId = " + id).getResultList();
       if(list.size()>0 && !list.isEmpty()){
        log.info("method getSelectedDrink has ended");
           return list.get(0);
       }
       return null;
    }

    @Override
    public Long addDrinks(DrinksStoreDto drinksStoreDto) {
        log.info("method addDrinks has started");


        DrinksStore ds = new DrinksStore();
        ds.setDrinkName(drinksStoreDto.getDrinkName());
        ds.setDrinkPrice(drinksStoreDto.getDrinkPrice());
        ds.setDrinkDescription(drinksStoreDto.getDrinkDescription());
        ds.setImageUrl(drinksStoreDto.getImageUrl());
        ds.setQuantity(drinksStoreDto.getQuantity());
        entityManager.persist(ds);
        Long id = ds.getDrinkId();
        log.info("method addDrinks has ended");
        if(id!=null)
            return id;
        else return 0L;
    }

    @Override
    public Long updateDrinks(DrinksStoreDto drinksStoreDto, Long id) {
       log.info("method updateDrinks has started");
        DrinksStore ds = entityManager.find(DrinksStore.class,id);
        if(ds==null){
            throw new RuntimeException("Drink not found for id: " + id);
        }

        ds.setDrinkName(drinksStoreDto.getDrinkName());
        ds.setDrinkPrice(drinksStoreDto.getDrinkPrice());
        ds.setDrinkDescription(drinksStoreDto.getDrinkDescription());
        ds.setImageUrl(drinksStoreDto.getImageUrl());
        ds.setQuantity(drinksStoreDto.getQuantity());
        log.info("method updateDrinks has ended");
        return ds.getDrinkId();
    }

    @Override
    public Long deleteDrink(Long drinkId) {
        log.info("method deleteDrink has started");
        DrinksStore ds = entityManager.find(DrinksStore.class,drinkId);
        if(ds==null){
            throw new RuntimeException("Drink not found for id: " + drinkId);
        }
        entityManager.remove(ds);
        log.info("method deleteDrink has ended");
        return drinkId;
    }
}

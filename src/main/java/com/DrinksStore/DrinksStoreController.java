package com.DrinksStore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/drinks")
@CrossOrigin("http://localhost:5173")
public class DrinksStoreController {
        @Autowired
        private DrinksStoreService drinksStoreService;

//    Gets selected drink details.
    @GetMapping("/{drinkId}")
    public ResponseEntity<?> getSelectedDrink(@PathVariable Long drinkId){
        Object selectedDrink = drinksStoreService.getSelectedDrink(drinkId);
        return ResponseEntity.status(HttpStatus.OK).body(selectedDrink);
    }

//    Gets all drinks
    @GetMapping()
    public ResponseEntity<?> getAllDrinks(){
        List<Object> allDrinks = drinksStoreService.getAllDrinks();
        return ResponseEntity.status(HttpStatus.OK).body(allDrinks);
    }

//   Add drinks
    @PostMapping()
    public ResponseEntity<?> addDrinks(@RequestBody DrinksStoreDto drinksStoreDto){
        Long id = drinksStoreService.addDrinks(drinksStoreDto);
        ResponseBody rb= new ResponseBody("Created successfully",id);
        return ResponseEntity.status(HttpStatus.OK).body(rb);
    }

//  update drink details
    @PutMapping("/{drinkId}")
    public ResponseEntity<?> updateDrink(@RequestBody DrinksStoreDto drinksStoreDto,@PathVariable Long drinkId){
        Long id = drinksStoreService.updateDrinks(drinksStoreDto,drinkId);
        ResponseBody rb= new ResponseBody("Updated successfully",id);
        return ResponseEntity.status(HttpStatus.OK).body(rb);
    }

//  Delete drink
    @DeleteMapping("/{drinkId}")
    public ResponseEntity<?> deleteDrink(@PathVariable Long drinkId){
        Long id = drinksStoreService.deleteDrink(drinkId);
        ResponseBody rb= new ResponseBody("deleted successfully",id);
        return ResponseEntity.status(HttpStatus.OK).body(rb);
    }
}

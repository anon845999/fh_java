package at.fh.coffeeshop.service;

import at.fh.coffeeshop.model.Coffee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoffeeService {
    private List<Coffee> coffeeList = new ArrayList<>();

    public void initilizeCoffees(){
        coffeeList.add(new Coffee("Americano", "Cappuccino", 2.50));
        coffeeList.add(new Coffee("Espresso", "Cappuccino", 3.00));
        coffeeList.add(new Coffee("Melange", "coffee", 3.6));
    }


    public List<Coffee> getAllCoffees() {
        if(coffeeList.isEmpty())
            initilizeCoffees();
        return coffeeList;
    }

    public Coffee addCoffee(Coffee coffee) {
        if(coffee == null)
        {
            System.out.println("Warning: null object tried to be saved");
            return null;
        }
        coffeeList.add(coffee);
        return coffee;
    }
    public boolean deleteCoffee(String name) {

        for(var item : coffeeList){
            if(item.getName().equals(name)){
                coffeeList.remove(item);
                return true;
            }
        }
        return false;
    }

    public Coffee updateCoffee(Coffee coffee) {
        if(coffee == null)
            return null;
        for(var item : coffeeList){
            if(item.getName().equals(coffee.getName())){
                coffeeList.remove(item);
                coffeeList.add(coffee);
                return coffee;
            }
        }
        return null;
    }


}

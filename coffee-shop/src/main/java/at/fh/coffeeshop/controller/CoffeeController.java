package at.fh.coffeeshop.controller;


import at.fh.coffeeshop.model.Coffee;
import at.fh.coffeeshop.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/coffee-services")
public class CoffeeController {

    //Autowired for readability
    private final CoffeeService coffeeService;
    @Autowired
    public CoffeeController(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }
    /*
    GET /retrieve all coffees
     */

    @GetMapping()
    public List<Coffee> getAllCoffees(){
        return coffeeService.getAllCoffees();
    }
    @PostMapping()
    public Coffee addCoffee(@RequestBody Coffee coffee){
        return coffeeService.addCoffee(coffee);
    }
    @DeleteMapping("/{name}")
    public boolean deleteCoffee(@PathVariable String name){
        return coffeeService.deleteCoffee(name);
    }

    @PutMapping()
    public Coffee updateCoffee2(Coffee coffee){
        return coffeeService.updateCoffee(coffee);
    }

}

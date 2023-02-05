package com.example.restaurant.contoller;

import com.example.restaurant.model.Restaurant;
import com.example.restaurant.service.RestaurantApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/restaurant-app")
public class RestaurantApplicationController {
    @Autowired
    private RestaurantApplicationService restaurantService;
    @PostMapping("add-restaurant")
    public void addRestaurant(@RequestBody Restaurant res)
    {
        restaurantService.addRestaurant(res);
    }

    @GetMapping("find-all")
    public List<Restaurant> findAllRestaurant()
    {
        return restaurantService.findAll();
    }

    @GetMapping("find-by-name/name/{name}")
    public Restaurant findByName(@PathVariable String name){
        return restaurantService.findByName(name);
    }

    @PutMapping("/update-restaurant/name/{name}")
    public void updateTodo(@PathVariable String name,@RequestBody Restaurant restaurant){
        restaurantService.updateRestaurant(name,restaurant);
    }
    @DeleteMapping("delete-restaurant/name/{name}")
    public void deleteTodo(@PathVariable String name){
         restaurantService.deleteRestaurant(name);
    }

}

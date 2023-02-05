package com.example.restaurant.service;

import com.example.restaurant.model.Restaurant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class RestaurantApplicationService {

    private static List<Restaurant> restaurantList=new ArrayList<>();

    static {
        restaurantList.add(new Restaurant("ChaiHub","Chattarpur,MP","Grilled Sandwich",20,true,9));
        restaurantList.add(new Restaurant("BurgerKing","Chattarpur,MP","Burger",30,true,8));
    }

    public void addRestaurant(Restaurant restaurant)
    {
        restaurantList.add(restaurant);
    }

    public List<Restaurant> findAll()
    {
        return restaurantList;
    }

    public Restaurant findByName(String name)
    {
        for(Restaurant restaurant:restaurantList){
            if(restaurant.getName().equals(name))
                return restaurant;
        }

        return null;
    }

    public void updateRestaurant(String name,Restaurant restaurant)
    {
        if(findByName(name)!=null)
        {
            Restaurant restaurant1=findByName(name);
            restaurant1.setName(restaurant.getName());
            restaurant1.setAddress(restaurant.getAddress());
            restaurant1.setSpeciality(restaurant.getSpeciality());
            restaurant1.setOpen(restaurant.isOpen());
            restaurant1.setRating(restaurant.getRating());
            restaurant1.setTotalStaff(restaurant.getTotalStaff());
        }
    }

    public void deleteRestaurant(String name)
    {
        for(Restaurant restaurant:restaurantList){
            if(restaurant.getName().equals(name))
                restaurantList.remove(restaurant);
        }
    }

}

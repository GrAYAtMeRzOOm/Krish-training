package com.gray.krish.dp.fmp;

import com.gray.krish.dp.fmp.meals.Meals;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 12-Mar-22
 * Time: 1:47 AM
 * DesignPatterns
 */
public class Application {
    public static void main(String[] args) {
        Meals meal1 = FoodCourt.orderMeal(MealSelector.BREAKFAST);
        System.out.println(meal1);
        Meals meal2 = FoodCourt.orderMeal(MealSelector.LUNCH);
        System.out.println(meal2);
    }
}

package com.gray.krish.dp.fmp;

import com.gray.krish.dp.fmp.meals.BreakFast;
import com.gray.krish.dp.fmp.meals.Dinner;
import com.gray.krish.dp.fmp.meals.Lunch;
import com.gray.krish.dp.fmp.meals.Meals;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 12-Mar-22
 * Time: 1:34 AM
 * DesignPatterns
 */
public class FoodCourt {
    public static Meals orderMeal(MealSelector selectedMeal){
        switch (selectedMeal){
            case BREAKFAST:
                return new BreakFast();
            case LUNCH:
                return new Lunch();
            case DINNER:
                return new Dinner();
            default:
                return null;
        }
    }
}

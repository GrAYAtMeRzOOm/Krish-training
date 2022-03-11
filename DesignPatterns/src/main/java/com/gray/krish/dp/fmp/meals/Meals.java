package com.gray.krish.dp.fmp.meals;

import com.gray.krish.dp.fmp.fooditem.FoodItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 11-Mar-22
 * Time: 11:38 PM
 * FactoryMethodPattern
 */
public abstract class Meals {

    protected List<FoodItem> menuItems = new ArrayList<>();

    public Meals() {
        prepare();
    }

    protected abstract void prepare();

    @Override
    public String toString() {
        return "Meals{" +
                "foodItemList=" + menuItems +
                '}';
    }
}

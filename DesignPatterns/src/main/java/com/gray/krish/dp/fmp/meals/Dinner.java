package com.gray.krish.dp.fmp.meals;

import com.gray.krish.dp.fmp.fooditem.FriedRice;
import com.gray.krish.dp.fmp.fooditem.Tea;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 11-Mar-22
 * Time: 8:36 PM
 * FactoryMethodPattern
 */
public class Dinner extends Meals {
    @Override
    protected void prepare() {
        menuItems.add(new FriedRice());
        menuItems.add(new Tea());
    }
}

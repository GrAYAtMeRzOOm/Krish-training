package com.gray.krish.dp.fmp.meals;

import com.gray.krish.dp.fmp.fooditem.BreadWithButter;
import com.gray.krish.dp.fmp.fooditem.RiceAndCurry;
import com.gray.krish.dp.fmp.fooditem.Tea;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 11-Mar-22
 * Time: 8:35 PM
 * FactoryMethodPattern
 */
public class BreakFast extends Meals {

    @Override
    protected void prepare() {
        menuItems.add(new RiceAndCurry());
        menuItems.add(new BreadWithButter());
        menuItems.add(new Tea());
    }
}

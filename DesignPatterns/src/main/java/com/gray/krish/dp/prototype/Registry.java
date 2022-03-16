package com.gray.krish.dp.prototype;

import com.gray.krish.dp.prototype.Cakes.ButterRibbonCake;
import com.gray.krish.dp.prototype.Cakes.Cake;
import com.gray.krish.dp.prototype.Cakes.CakeType;
import com.gray.krish.dp.prototype.Cakes.GateauCake;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 16-Mar-22
 * Time: 8:46 PM
 * DesignPatterns
 */
public class Registry {

    private Map<CakeType, Cake> cakeMap = new HashMap<>();

    public Registry() {
        initialize();
    }

    public Cake getCake(CakeType type) {
        Cake cake = null;
        try {
            cake = (Cake) cakeMap.get(type).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cake;
    }


    private void initialize() {
        ButterRibbonCake butterRibbonCake = new ButterRibbonCake();
        butterRibbonCake.setCakeColour("Red");
        butterRibbonCake.setCustomWording("Happy Birthday John");
        butterRibbonCake.setRequiredAmount(1);

        GateauCake gateauCake = new GateauCake();
        gateauCake.setCakeFlavour("Coffee");
        gateauCake.setCustomWording("Happy Birthday Alice");
        gateauCake.setRequiredAmount(1);

        cakeMap.put(CakeType.BUTTERRIBBONCAKE, butterRibbonCake);
        cakeMap.put(CakeType.GATEAUCAKE, gateauCake);
    }
}

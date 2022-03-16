package com.gray.krish.dp.prototype.Cakes;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 16-Mar-22
 * Time: 8:51 PM
 * DesignPatterns
 */
public class ButterRibbonCake extends Cake {
    protected String cakeColour;

    public String getCakeColour() {
        return cakeColour;
    }

    public void setCakeColour(String cakeColour) {
        this.cakeColour = cakeColour;
    }

    @Override
    public String toString() {
        return "Butter Ribbon Cake Colour is " + cakeColour+ " Custom wording as "+customWording+" and amount of "+requiredAmount;
    }
}

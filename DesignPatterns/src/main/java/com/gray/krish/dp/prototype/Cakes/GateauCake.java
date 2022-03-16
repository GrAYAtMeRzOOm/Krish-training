package com.gray.krish.dp.prototype.Cakes;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 16-Mar-22
 * Time: 8:52 PM
 * DesignPatterns
 */
public class GateauCake extends Cake {

    protected String cakeFlavour;

    public String getCakeFlavour() {
        return cakeFlavour;
    }

    public void setCakeFlavour(String cakeFlavour) {
        this.cakeFlavour = cakeFlavour;
    }

    @Override
    public String toString() {
        return "Butter Ribbon Cake Flavour is " + cakeFlavour + " Custom wording as "+customWording+" and amount of "+requiredAmount;
    }
}

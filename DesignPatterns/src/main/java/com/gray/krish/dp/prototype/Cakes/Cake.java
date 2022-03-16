package com.gray.krish.dp.prototype.Cakes;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 16-Mar-22
 * Time: 8:15 PM
 * DesignPatterns
 */
public abstract class Cake implements Cloneable {
    protected String customWording;
    protected int requiredAmount;

    public String getCustomWording() {
        return customWording;
    }

    public void setCustomWording(String customWording) {
        this.customWording = customWording;
    }

    public int getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(int requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

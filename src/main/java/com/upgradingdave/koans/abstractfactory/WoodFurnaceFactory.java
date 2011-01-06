package com.upgradingdave.koans.abstractfactory;


public class WoodFurnaceFactory implements HeatingSystemFactory {

    public HeatingSystem makeHeatingSystem() {
        return new WoodFurnace();
    }

}

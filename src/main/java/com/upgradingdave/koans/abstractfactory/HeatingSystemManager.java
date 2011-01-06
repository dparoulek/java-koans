package com.upgradingdave.koans.abstractfactory;


public class HeatingSystemManager {

    private HeatingSystem heatSystem;

    public HeatingSystemManager(HeatingSystemFactory heatSystemFactory) {
        setHeatSystem(heatSystemFactory.makeHeatingSystem());
    }

    public void setHeatSystem(HeatingSystem heatSystem) {
        this.heatSystem = heatSystem;
    }

    public HeatingSystem getHeatSystem() {
        return heatSystem;
    }
}

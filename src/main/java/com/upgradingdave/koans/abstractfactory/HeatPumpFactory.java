package com.upgradingdave.koans.abstractfactory;

public class HeatPumpFactory implements HeatingSystemFactory {

    public HeatingSystem makeHeatingSystem() {
        return new HeatPump();
    }

}

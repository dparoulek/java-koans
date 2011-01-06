package com.upgradingdave.koans.abstractfactory;

import static org.junit.Assert.*;

import org.junit.Test;

public class AbstractFactoryTest {

    @Test
    public void testUsingAbstractFactory() {
        HeatingSystemManager manager = new HeatingSystemManager(
                new WoodFurnaceFactory());
        assertEquals("com.upgradingdave.koans.abstractfactory.WoodFurnace", manager.getHeatSystem().getClass().getName());
        
        manager = new HeatingSystemManager(new HeatPumpFactory());
        assertEquals("com.upgradingdave.koans.abstractfactory.HeatPump", manager.getHeatSystem().getClass().getName());
    }
}

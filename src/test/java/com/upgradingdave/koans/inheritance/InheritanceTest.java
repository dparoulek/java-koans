package com.upgradingdave.koans.inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class InheritanceTest {
    
    @Test
    public void testCar(){
        Acura acura = new Acura();
        //member variables in child classes don't override parent variable of same name
        assertNotSame("acura", acura.getType());
        
        Honda honda = new Honda();
        assertEquals("generic", honda.getType());
    }

}

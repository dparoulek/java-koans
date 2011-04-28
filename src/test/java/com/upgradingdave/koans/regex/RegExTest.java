package com.upgradingdave.koans.regex;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class RegExTest {

    @Test
    public void testProdCodeMatch(){
        String before = "product-code";
        assertTrue(before.matches(RegularExpressions.PROD_CODE_REGEX));
        
        before = "productcode";
        assertFalse(before.matches(RegularExpressions.PROD_CODE_REGEX));
    }
    
    @Test
    public void testFindDashIndex(){
        String before = "product-code";
        assertEquals(7,before.indexOf('-'));
    }
    
    @Test 
    public void testToUpper(){
        String before = "product-code";
        char theChar = before.charAt(8); 
        assertEquals('c', theChar);
        
        assertEquals("product-Code", before.substring(0,8) + Character.toUpperCase(theChar) + before.substring(9));
    }
    
    @Test 
    public void testRemoveDash(){
        String before = "product-code";
        assertEquals("productcode", before.substring(0,7)+before.substring(8));
    }
    
    @Test 
    public void testConvertProductCode(){
        String before = "product-code";
        assertEquals("productCode", RegularExpressions.convertProductCode(before));
    }
    
    @Test
    public void testsSingleGroupMatch(){
        String regex = ".*users/([^/]+)$";
        String testString = "http://upgradingdave.com/users/2376";
        assertEquals("2376", RegularExpressions.matchSingleGroup(regex, testString));
    }

}

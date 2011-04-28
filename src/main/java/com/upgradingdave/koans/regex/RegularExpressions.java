package com.upgradingdave.koans.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

    // http://stackoverflow.com/questions/4570597/java-regular-expression
    protected final static String PROD_CODE_REGEX = ".*-.*";

    public static String convertProductCode(String before) {
        String result = before;
        if (before.matches(PROD_CODE_REGEX)) {
            int dashPos = before.indexOf('-');
            char charAfterDash = before.charAt(dashPos + 1);

            // Change char to uppercase
            result = result.substring(0, dashPos + 1)
                    + Character.toUpperCase(charAfterDash)
                    + result.substring(dashPos + 2);

            // get rid of dash
            result = result.substring(0, dashPos)
                    + result.substring(dashPos + 1);
        }
        return result;
    }
    
    /**
     * Returns the string that matched the first group, or null if no match found
     */
    public static String matchSingleGroup(String regex, String testString){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(testString);
        
        if (matcher.matches()){
            //matcher.group(0) will return entire match
            //individual matches start at index=1
            return matcher.group(1);
        } else {
            return null;
        }
    }
}

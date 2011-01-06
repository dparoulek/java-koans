package com.upgradingdave.koans.regex;

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

}

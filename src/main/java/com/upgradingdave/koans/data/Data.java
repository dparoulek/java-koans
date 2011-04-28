package com.upgradingdave.koans.data;

import com.upgradingdave.koans.builder.WebPage;

public interface Data {

    public static final WebPage[] webpages = {
            new WebPage("Dave", "http://example.com/dave", null, null),
            new WebPage("Matt", "http://example.com/matt", null, null),
            new WebPage("Greg", "http://example.com/greg", null, null),
            new WebPage("Kathy", "http://example.com/kathy", null, null),
            new WebPage("Tim", "http://example.com/tim", null, null),
            new WebPage("Ben", "http://example.com/ben", null, null),
            new WebPage("Zack", "http://example.com/zack", null, null) };
}

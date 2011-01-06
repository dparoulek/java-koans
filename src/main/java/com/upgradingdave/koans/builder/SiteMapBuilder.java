package com.upgradingdave.koans.builder;

import java.net.URL;

public interface SiteMapBuilder {

    public void buildHeader();

    public void buildFooter();

    public void buildPage(URL url);

    public String getSiteMap();
}

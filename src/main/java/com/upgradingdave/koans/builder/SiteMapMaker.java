package com.upgradingdave.koans.builder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import com.upgradingdave.koans.data.Data;

public class SiteMapMaker {

    String siteMap;

    public SiteMapMaker(SiteMapBuilder siteMapBuilder) {
        try {
            siteMapBuilder.buildHeader();
            siteMapBuilder.buildFooter();
            for (int i = 0; i < Data.webpages.length; i++) {
                siteMapBuilder.buildPage(new URL(Data.webpages[i].getUrl()));
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        siteMap = siteMapBuilder.getSiteMap();
    }

    public void saveSiteMapToDisk(File sitemapfile) {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(sitemapfile);
            fileWriter.write(siteMap.toString());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

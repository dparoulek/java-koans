package com.upgradingdave.koans.builder;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class HtmlSiteMapBuilder implements SiteMapBuilder {

    private String header;
    private String footer;
    private List<URL> urls;

    public void buildHeader() {
        header = "<ul class=\"sitemap\">\n";
    }

    public void buildFooter() {
        footer = "</ul>\n";
    }

    public void buildPage(URL url) {
        if (urls == null) {
            urls = new ArrayList<URL>();
        }
        urls.add(url);
    }

    public String getSiteMap() {
        StringBuffer body = new StringBuffer();
        for (URL url : urls) {
            body.append("<url>\n<loc>" + url.toString() + "</loc>\n</url>");
        }
        return header + body + footer;
    }

}

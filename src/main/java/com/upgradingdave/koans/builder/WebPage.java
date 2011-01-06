package com.upgradingdave.koans.builder;

import java.util.List;

public class WebPage {
    
    private String title;
    private String url;
    private WebPage parent;
    private List<WebPage> children;
    
    public WebPage(String title, String url, WebPage parent,
            List<WebPage> children) {
        super();
        this.title = title;
        this.url = url;
        this.parent = parent;
        this.children = children;
    }
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public WebPage getParent() {
        return parent;
    }
    public void setParent(WebPage parent) {
        this.parent = parent;
    }
    public List<WebPage> getChildren() {
        return children;
    }
    public void setChildren(List<WebPage> children) {
        this.children = children;
    }
        
}

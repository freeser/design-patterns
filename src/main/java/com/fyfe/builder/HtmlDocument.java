package com.fyfe.builder;

public class HtmlDocument {
    private String header = "";
    private String body = "";
    private String footer = "";

    public void addHeader(String header) {
        this.header = header;
    }

    public void addBody(String body) {
        this.body = body;
    }

    public void addFooter(String footer) {
        this.footer = footer;
    }

    @Override
    public String toString() {
        return "<html><head>" + header + "</head><body>" + body + "</body><footer>" + footer + "</footer></html>";
    }
}
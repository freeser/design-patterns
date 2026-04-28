package com.fyfe.builder;

public class HtmlDirector {
    private HtmlDocumentBuilder builder;

    public HtmlDirector(HtmlDocumentBuilder builder) {
        this.builder = builder;
    }

    public void constructDocument() {
        builder.createNewHtmlDocument();
        builder.buildHeader();
        builder.buildBody();
        builder.buildFooter();
    }

    public HtmlDocument getDocument() {
        return builder.getDocument();
    }
}
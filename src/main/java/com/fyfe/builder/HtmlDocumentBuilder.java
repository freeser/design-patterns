package com.fyfe.builder;

public abstract class HtmlDocumentBuilder {
    protected HtmlDocument document;

    public HtmlDocument getDocument() {
        return document;
    }

    public void createNewHtmlDocument() {
        document = new HtmlDocument();
    }

    public abstract void buildHeader();
    public abstract void buildBody();
    public abstract void buildFooter();
}
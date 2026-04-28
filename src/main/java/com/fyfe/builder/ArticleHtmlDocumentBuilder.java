package com.fyfe.builder;

public class ArticleHtmlDocumentBuilder extends HtmlDocumentBuilder {
    @Override
    public void buildHeader() {
        document.addHeader("Article Header");
    }

    @Override
    public void buildBody() {
        document.addBody("Article Body");
    }

    @Override
    public void buildFooter() {
        document.addFooter("Article Footer");
    }
}
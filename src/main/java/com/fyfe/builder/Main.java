package com.fyfe.builder;

public class Main {
    public static void main1(String[] args) {
        HtmlDocumentBuilder articleBuilder = new ArticleHtmlDocumentBuilder();
        HtmlDirector director = new HtmlDirector(articleBuilder);

        director.constructDocument();
        HtmlDocument document = director.getDocument();

        System.out.println("Constructed HTML Document: \n" + document);
    }

    public static void main(String[] args) {
        HtmlDoc.Builder builder = new HtmlDoc.Builder();
        HtmlDocument document = builder.addHeader("This is the header")
                .addBody("This is the body")
                .addFooter("This is the footer")
                .build();

        System.out.println("Constructed HTML Document: \n" + document);
    }
}
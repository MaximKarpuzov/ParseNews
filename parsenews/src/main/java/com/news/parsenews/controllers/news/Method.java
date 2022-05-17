package com.news.parsenews.controllers.news;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Method {
    public static List<Article> articleList= new ArrayList<>();
    private static Document getPage() throws IOException {
        String url = "https://www.mk.ru/news/";
        Document page = Jsoup.parse(new URL(url), 3000);
        return page;
    }

    public static List<Article> artList(List<Article> list) throws IOException{

        Document page = getPage();

        Element tableAll = page.select("section[class=news-listing__day-group]").first();

        Elements names = tableAll.select("li[class=news-listing__item ]");

        for(Element name : names){
            String title = name.select("h3[class=news-listing__item-title]").text();
            Element aElement = name.child(0);
            String href = aElement.attr("href");
            String time = name.select("span[class=news-listing__item-time]").text();

            list.add(new Article(time,title,href));
        }

        return list;
    }
}

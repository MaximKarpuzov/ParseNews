package com.news.parsenews.controllers.news;

public class Article {
    private String Time;
    private String Title;
    private String Url;

    public Article(String time, String title, String url) {
        Time = time;
        Title = title;
        Url = url;
    }

    public String getTime() {
        return Time;
    }

    public String getTitle() {
        return Title;
    }

    public String getUrl() {
        return Url;
    }

    public void setTime(String time) {
        Time = time;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setUrl(String url) {
        Url = url;
    }

    @Override
    public String toString() {
        return "Adding time: " + Time + '\n' +
                " Articlt title: " + Title + '\n' +
                " Link to article: " + Url ;
    }
}

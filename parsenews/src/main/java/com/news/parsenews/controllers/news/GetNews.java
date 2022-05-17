package com.news.parsenews.controllers.news;


import com.news.parsenews.controllers.MainController;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

import java.io.IOException;

@Service
@EnableScheduling
public class GetNews {

    private final MainController newsService;

    public GetNews(MainController newsService) {
        this.newsService = newsService;
    }

    @Scheduled(fixedDelay = 60000)
    public void run() throws IOException {
        Model model = new ExtendedModelMap();
        newsService.greeting(model);
    }
}

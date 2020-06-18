package com.example.spring.springselenium.page.google;

import com.example.spring.springselenium.annotation.Page;
import com.example.spring.springselenium.page.Base;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;


@Page
public class GooglePage extends Base {


    @Autowired
    @Lazy
    private SearchComponent searchComponent;

    @Autowired
    @Lazy
    private  SearchResult searchResult;

    @Value("${application.Url}")
    private String url;

    public void goTo(){
        this.driver.get(url);
    }

    public SearchComponent getSearchComponent() {
        return searchComponent;
    }

    public SearchResult getSearchResult() {
        return searchResult;
    }

    @Override
    public boolean isAt() {
        return this.searchComponent.isAt();
    }
}

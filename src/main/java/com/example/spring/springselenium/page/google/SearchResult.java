package com.example.spring.springselenium.page.google;

import com.example.spring.springselenium.annotation.PageFragment;
import com.example.spring.springselenium.page.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Service;

import java.util.List;

@PageFragment
public class SearchResult extends Base {


    @FindBy(css="div.rc")
    private List<WebElement> results;

    public int getCount(){
        return this.results.size();
    }


    @Override
    public boolean isAt() {
        return this.wait.until((driver) -> this.results.isEmpty() );
    }
}

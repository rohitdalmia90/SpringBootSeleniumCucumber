package com.example.spring.springselenium.Tests;


import com.example.spring.springselenium.SpringBaseTestNGTest;
import com.example.spring.springselenium.Util.ScreenShotUtil;
import com.example.spring.springselenium.page.google.GooglePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class googleTest2 extends SpringBaseTestNGTest {



    @Autowired
    @Lazy
    private GooglePage googlePage;


    @Autowired
    private ScreenShotUtil screenShotUtil;


    @Test
    public void googleTest() throws IOException {
        this.googlePage.goTo();
        Assert.assertTrue(this.googlePage.isAt());

        this.googlePage.getSearchComponent().search("Spring Boot ");
        Assert.assertTrue(this.googlePage.getSearchResult().getCount() > 2);
        this.screenShotUtil.takeScreenShot();

    }


}

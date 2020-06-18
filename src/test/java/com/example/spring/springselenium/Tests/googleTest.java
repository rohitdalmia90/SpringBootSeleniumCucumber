package com.example.spring.springselenium.Tests;


import com.example.spring.springselenium.SpringBaseTestNGTest;
import com.example.spring.springselenium.Util.ScreenShotUtil;
import com.example.spring.springselenium.page.google.GooglePage;
import com.google.common.util.concurrent.Uninterruptibles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class googleTest extends SpringBaseTestNGTest {


    @Lazy
    @Autowired
    private GooglePage googlePage;


    @Autowired
    private ScreenShotUtil screenShotUtil;


    @Test
    public void googleTest() throws IOException {
        this.googlePage.goTo();
        Assert.assertTrue(this.googlePage.isAt());

        this.googlePage.getSearchComponent().search("environment ");
        Assert.assertTrue(this.googlePage.getSearchResult().getCount() > 2);
        this.screenShotUtil.takeScreenShot();

    }


}

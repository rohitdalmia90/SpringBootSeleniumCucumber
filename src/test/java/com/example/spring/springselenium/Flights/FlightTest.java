package com.example.spring.springselenium.Flights;

import com.example.spring.springselenium.SpringBaseTestNGTest;
import com.example.spring.springselenium.page.flights.FlightPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlightTest extends SpringBaseTestNGTest {

    @Autowired
    private FlightPage flightPage;


    @Autowired
    private FlightAppDetails flightAppDetails;


    @Test
    public void flightTest(){
        this.flightPage.goTo(this.flightAppDetails.getUrl());
        Assert.assertTrue(this.flightPage.isAt());
        Assert.assertEquals(this.flightPage.getLabels(),this.flightAppDetails.getLabels());

    }
}

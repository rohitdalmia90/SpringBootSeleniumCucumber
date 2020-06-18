package com.example.spring.springselenium.config;

import com.example.spring.springselenium.annotation.LazyConfiguration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.*;

@LazyConfiguration
@Profile("!remote")
public class WebdriverConfig {



    @Bean
    @Scope("browserscope")
    @ConditionalOnMissingBean
    public WebDriver chromeDriver() {
       WebDriverManager.chromedriver().version("71.0.3578.80").setup();
        //WebDriverManager.chromedriver().version("83.0.4103.61").setup();
        return new ChromeDriver();
    }

    @Bean
    /*  @Primary*/
//    @ConditionalOnProperty(name = "browser", havingValue = "firefox")
    public WebDriver firefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }




}

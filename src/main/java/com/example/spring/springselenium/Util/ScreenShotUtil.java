package com.example.spring.springselenium.Util;

import com.example.spring.springselenium.config.WebdriverConfig;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;


@Component
public class ScreenShotUtil {


    @Autowired
    public WebDriver driver;

    @Value("${screenshot.path}/img.png")
    private Path path;

    public void takeScreenShot() throws IOException {

      File sourcefile=  ((TakesScreenshot)this.driver).getScreenshotAs(OutputType.FILE);
        FileCopyUtils.copy(sourcefile,this.path.toFile());

    }

}

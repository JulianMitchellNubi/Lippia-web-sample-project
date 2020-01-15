package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseWeb;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PageBaseTheInternet extends PageBaseWeb {

    public PageBaseTheInternet(RemoteWebDriver driver) {
        super(driver);
        BASE_URL = "https://the-internet.herokuapp.com/";
    }

}

package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TheInternetHomePage extends PageBaseTheInternet {

    private final String FORGOT_PASSWORD_LINK_XPATH = "//a[contains(.,'Forgot Password')]";

    public TheInternetHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public void go() {
        navigateToCompleteURL();
    }

    public void clickForgotPasswordLink(){
        clickElement(By.xpath(FORGOT_PASSWORD_LINK_XPATH));
    }

}

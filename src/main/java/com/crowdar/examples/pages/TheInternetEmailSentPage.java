package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TheInternetEmailSentPage extends PageBaseTheInternet{

    private final String CONFIRMATION_MESSAGE_ID = "content";

    public TheInternetEmailSentPage(RemoteWebDriver driver) {
        super(driver);
    }

    public String getConfirmationMessageText(){
        return getElementText(By.id(CONFIRMATION_MESSAGE_ID));
    }
}

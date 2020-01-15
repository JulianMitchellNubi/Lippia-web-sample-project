package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TheInternetForgotPasswordPage extends PageBaseTheInternet{

    private final String EMAIL_INPUT_ID = "email";
    private final String RETRIEVE_PASSWORD_BUTTON_ID = "form_submit";

    public TheInternetForgotPasswordPage(RemoteWebDriver driver) {
        super(driver);
    }

    public void enterEmail(String text){
        completeField(By.id(EMAIL_INPUT_ID), text);
    }

    public void clickRetrievePasswordButton(){
        clickElement(By.id(RETRIEVE_PASSWORD_BUTTON_ID));
    }
}

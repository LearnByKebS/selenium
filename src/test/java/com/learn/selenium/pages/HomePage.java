package com.learn.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Kebscito on 21/01/2016.
 */
public class HomePage {

    private WebDriver driver;

    private final String HOME_PAGE = "https://www.wikipedia.org/";

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void goToHomePage(){
        driver.get(HOME_PAGE);
    }

    public void clickLanguage(String language){
        WebElement link = driver.findElement(By.xpath("//div[@class='central-featured']//a/strong[text()='"+language+"']"));
        link.click();
    }

}
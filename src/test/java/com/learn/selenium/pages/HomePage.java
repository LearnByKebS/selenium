package com.learn.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Kebscito on 21/01/2016.
 */
public class HomePage {

    private WebDriver driver;

    private final String HOME_PAGE = "https://www.wikipedia.org/";

    @FindBy(xpath = "//div[@class='central-featured']")
    private WebElement languagesContainer;

    @FindBy(id = "searchInput")
    private WebElement searchInput;

    @FindBy(name = "go")
    private WebElement goButton;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void goToHomePage(){
        driver.get(HOME_PAGE);
    }

    public void clickLanguage(String language){
       languagesContainer.findElement(By.linkText(language));
    }

    public void searchInputSendKeys(String text){
        searchInput.sendKeys(text);
    }

    public void clickGoButton(){
        goButton.click();
    }

}
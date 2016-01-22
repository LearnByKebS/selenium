package com.learn.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Kebscito on 21/01/2016.
 */
public class HomePage {

    private WebDriver driver;

    private final String HOME_PAGE = "https://www.wikipedia.org/";

    @FindBy(xpath = "//div[@class='central-featured']//a/strong")
    private List<WebElement> languageLinks;

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
        for (WebElement languageLink : languageLinks) {
            if(languageLink.getText().equals(language)){
                languageLink.click();
                break;
            }
        }
    }

    public void searchInputSendKeys(String text){
        searchInput.sendKeys(text);
    }

    public void clickGoButton(){
        goButton.click();
    }

}
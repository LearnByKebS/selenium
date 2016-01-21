package com.learn.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Selenium simple tests examples
 */
public class SeleniumTest {

    private WebDriver driver = new FirefoxDriver();

    @Test
    public void exampleFindElement() {
        driver.get("https://www.wikipedia.org/");
        WebElement webElement = driver.findElement(By.linkText("English"));
        webElement.click();
        String expectedUrl = "https://en.wikipedia.org/wiki/Main_Page";
        String errorMessage = "By clicking the 'English' link in the home page the page was not redirected correctly";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, errorMessage);
    }

    @Test
    public void exampleFindElements() {
        driver.get("https://www.wikipedia.org/");
        //You should learn how to locate elements by xpath :)
        //The xpath used will match all the language links
        List<WebElement> listOfLanguagesLinks = driver.findElements(By.xpath("//div[@class='central-featured']//a/strong"));
        for (WebElement languageLink : listOfLanguagesLinks) {
            if(languageLink.getText().equals("Italiano")){
                languageLink.click();
                break;
            }
        }
        String expectedUrl = "https://it.wikipedia.org/wiki/Pagina_principale";
        String errorMessage = "By clicking the 'Italiano' link in the home page the page was not redirected correctly";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, errorMessage);
    }

}
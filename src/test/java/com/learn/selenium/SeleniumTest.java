package com.learn.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Selenium simple tests examples
 */
public class SeleniumTest {

    private WebDriver driver = new FirefoxDriver();

    @Test
    public void example1() {
        driver.get("https://www.wikipedia.org/");
        WebElement webElement = driver.findElement(By.linkText("English"));
        webElement.click();
        String expectedUrl = "https://en.wikipedia.org/wiki/Main_Page";
        String errorMessage = "By clicking the 'English' link in the home page the page was not redirected correctly";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, errorMessage);
    }
}
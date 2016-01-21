package com.learn.selenium.tests;

import com.learn.selenium.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Kebscito on 21/01/2016.
 */
public class SimplePageObjectTests {

    private WebDriver driver = new FirefoxDriver();

    @Test
    public void exampleSimplePageObjectTest(){
        HomePage homePage = new HomePage(driver);
        homePage.goToHomePage();
        homePage.clickLanguage("English");
        String expectedUrl = "https://en.wikipedia.org/wiki/Main_Page";
        String errorMessage = "By clicking the 'English' link in the home page the page was not redirected correctly";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, errorMessage);
    }
}
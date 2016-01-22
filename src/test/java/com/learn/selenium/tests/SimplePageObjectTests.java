package com.learn.selenium.tests;

import com.learn.selenium.pages.HomePage;
import com.learn.selenium.pages.SearchResultPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Kebscito on 21/01/2016.
 */
public class SimplePageObjectTests {

    private WebDriver driver = new FirefoxDriver();

    @Test
    public void examplePageFactory() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.goToHomePage();
        homePage.clickLanguage("English");
        String expectedUrl = "https://en.wikipedia.org/wiki/Main_Page";
        String errorMessage = "By clicking the 'English' link in the home page the page was not redirected correctly";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, errorMessage);
    }

    @Test
    public void examplePageFactorySendKeys() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.goToHomePage();
        homePage.searchInputSendKeys("Java");
        homePage.clickGoButton();
        SearchResultPage searchResultPage = PageFactory.initElements(driver, SearchResultPage.class);
        Assert.assertEquals(searchResultPage.getArticleTitle(), "Java", "The search result title is not correct");
    }

}
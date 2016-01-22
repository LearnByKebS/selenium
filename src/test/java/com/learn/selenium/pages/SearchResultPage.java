package com.learn.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Kebscito on 21/01/2016.
 */
public class SearchResultPage {

    @FindBy(tagName = "h1")
    private WebElement articleTitle;

    public String getArticleTitle() {
        return articleTitle.getText();
    }

}

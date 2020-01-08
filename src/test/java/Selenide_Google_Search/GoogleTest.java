package Selenide_Google_Search;

import static com.codeborne.selenide.WebDriverRunner.*;


import org.junit.Assert;
import org.junit.Test;

public class GoogleTest {
    @Test
    public void verifyFirstSearchResultFromGoogle() {
        String currentURL, expectedResult;
        GooglePage googlePage = new GooglePage();
        googlePage.openGoogle();
        googlePage.searchFor("Rotten Tomatoes API");
        SearchResultsPage results = new SearchResultsPage();
        results.checkResultsSizeIsAtLeast(1);
        results.checkResultstHasTest(0, "Welcome to the Rotten Tomatoes® Developer Network");
        results.checkFirstResultUrl(0, "developer.fandango.com");

        results.clickOnFirstResult();
        currentURL = url();
        expectedResult = "https://developer.fandango.com/rotten_tomatoes";
        Assert.assertEquals(expectedResult, currentURL);


    }
}

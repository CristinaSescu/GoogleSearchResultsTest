package Selenide_Google_Search;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPage {
    private ElementsCollection results = $$("#res .g");
    private SelenideElement result = $("#res .g");

    public void checkResultsSizeIsAtLeast(int expectedSize) {
        results.shouldHave(sizeGreaterThan(expectedSize));
    }

    public void checkResultstHasTest(int index, String resultUrl) {
        results.get(index).shouldBe(visible).shouldHave(text(resultUrl));
    }

    public void checkFirstResultUrl(int index, String resultUrl) {

        results.get(index).shouldHave(text(resultUrl));
    }

    public void clickOnFirstResult() {
        result.click();
    }

}

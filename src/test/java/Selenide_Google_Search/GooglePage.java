package Selenide_Google_Search;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GooglePage {
    private SelenideElement searchField = $(byName("q"));

    public void openGoogle () {
        open("https://google.com/ncr");
    }

    public void searchFor(String text) {
        searchField.val(text).pressEnter();
    }
}


package po;

import base.BaseMethod;
import org.openqa.selenium.By;

public class SearchPage extends BaseMethod {
    private final By search = By.cssSelector("#searchInput");
    private final By result = By.cssSelector("#firstHeading.mw-first-heading");

    public SearchPage clickOnSearch(){
        click(search, 10);
        return this;
    }

    public SearchPage fillText(String text){
        send(search, text);
        return this;
    }

    public SearchPage enterSearch(){
        clickEnter(search);
        return this;
    }

    public String getTitle(){
        return getTextFromElement(result);
    }

}

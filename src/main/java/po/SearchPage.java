package po;

import base.BaseMethod;
import org.openqa.selenium.By;

public class SearchPage extends BaseMethod {
    private final By search = By.cssSelector("#searchInput");
    private final By result = By.cssSelector("#firstHeading.mw-first-heading");

    public void clickOnSearch(){
        click(search, 10);
    }

    public void fillText(String text){
        send(search, text);
    }

    public void enterSearch(){
        clickEnter(search);
    }

    public String getTitle(){
        return getTextFromElement(result);
    }

}

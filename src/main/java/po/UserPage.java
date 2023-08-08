package po;

import base.BaseMethod;
import org.openqa.selenium.By;
import org.xml.sax.Locator;

public class UserPage extends BaseMethod {

    private final By autorizationUser = By.cssSelector("#pt-login");

    private final By userName = By.cssSelector("#wpName1");

    private final By userPassword = By.cssSelector("#wpPassword1");

    private final By userAccept = By.cssSelector("#wpLoginAttempt");

    private final By resultUser = By.cssSelector("#pt-userpage");

    public void clickOnAutorization(){
        click(autorizationUser, 10);
    }

    public void fillTextNameUser(String text){
        send(userName, text);
    }

    public void fillTextPasswordUser(String text){
        send(userPassword, text);
    }

    public void enterAutorisation(){
        clickEnter(userPassword);
    }

    public String getTitle(){
        return getTextFromElement(resultUser);
    }


}

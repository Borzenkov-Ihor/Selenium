package po;

import base.BaseMethod;
import org.openqa.selenium.By;

public class UserPage extends BaseMethod {

    private String userName;
    private String userPassword;
    private final By autorizationUser = By.cssSelector("#pt-login");
    private final By userName_field = By.cssSelector("#wpName1");
    private final By userPassword_field = By.cssSelector("#wpPassword1");

    private final By userAccept = By.cssSelector("#wpLoginAttempt");

    private final By resultUser = By.cssSelector("#pt-userpage");

    public UserPage clickOnAutorization(){
        click(autorizationUser, 10);
        return this;
    }

    public UserPage fillTextNameUser(String userName){
        this.userName = userName;
        send(userName_field, userName);
        return this;
    }

    public UserPage fillTextPasswordUser(String userPassword){
        this.userPassword = userPassword;
        send(userPassword_field, userPassword);
        return this;
    }

    public void clickEnter(){
        clickEnter(userPassword_field);
    }

    public String getTitle(){
        return getTextFromElement(resultUser);
    }


}

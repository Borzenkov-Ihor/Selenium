package builder;

import po.UserPage;

public class UserPageBuilder {
    private String userName;
    private String userPassword;

    public UserPageBuilder withUserName(String userName){
        this.userName = userName;
        return this;
    }

    public UserPageBuilder withUserPassword(String userPassword){
        this.userPassword = userPassword;
        return this;
    }
    public UserPage build(){
        return new UserPage()
                .fillTextNameUser(userName)
                .fillTextPasswordUser(userPassword);
    }
}

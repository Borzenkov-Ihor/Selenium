import builder.UserPageBuilder;
import org.testng.annotations.Test;
import po.UserPage;

import static org.testng.Assert.assertEquals;

public class AutorizationTest extends BaseTest{

    @Test
    void Autorization(){
        new UserPage()
                .clickOnAutorization();

        UserPage user = new UserPageBuilder()
                .withUserName("Setty2008")
                .withUserPassword("qwerty2008")
                .build();

        user.clickEnter();

        assertEquals("Setty2008", new UserPage().getTitle());
    }
}

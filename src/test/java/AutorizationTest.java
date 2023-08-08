import org.testng.annotations.Test;
import po.UserPage;

import static org.testng.Assert.assertEquals;

public class AutorizationTest extends BaseTest{
    UserPage user = new UserPage();
    @Test
    void Autorization(){
        user.clickOnAutorization();
        user.fillTextNameUser("Setty2008");
        user.fillTextPasswordUser("qwerty2008");
        user.enterAutorisation();

        assertEquals("Setty2008", user.getTitle());
    }
}

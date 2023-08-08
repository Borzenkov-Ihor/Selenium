import org.testng.annotations.Test;
import po.SearchPage;

import static org.testng.Assert.assertEquals;

public class SearchTest extends BaseTest{

    SearchPage search = new SearchPage();

    @Test
    void shouldBeVisibleResultSearch(){
            search.clickOnSearch();
            search.fillText("Ubisoft");
            search.enterSearch();


//            assertThat(search.getTitle()).as("Result").isEqualTo("Ubisoft");
            assertEquals("Ubisoft", search.getTitle());

    }

}

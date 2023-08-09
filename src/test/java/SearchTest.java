import org.testng.annotations.Test;
import po.SearchPage;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchTest extends BaseTest{

    @Test
    void shouldBeVisibleResultSearch(){
        new SearchPage()
                .clickOnSearch()
                .fillText("Ubisoft")
                .enterSearch();


        assertThat(new SearchPage().getTitle())
                    .as("The result of test is appeared")
                    .isEqualTo("Ubisoft");
    }

}

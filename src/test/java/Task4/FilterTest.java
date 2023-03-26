package Task4;

import org.junit.jupiter.api.Test;

public class FilterTest extends BaseTest {
OfficePage officePage = new OfficePage();
    @Test
    void officeFilterTest(){
        officePage.go();
        officePage.clickOnTheSearchButton();
        officePage.cityInput();
    }

}

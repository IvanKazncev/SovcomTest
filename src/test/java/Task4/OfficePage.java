package Task4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class OfficePage extends BaseTest {

    private final String URL = "https://sovcombank.ru";
    private final String CITY = "Саратов";
    private final String FILTERBUTTON = "//div[@class=\"flex items-center space-x-4\"]/button";
    private final String SEARCHINPUT = "//input[@name=\"search\"]";



    protected void go(){
        webDriver.get(URL);
    }
    protected void clickOnTheSearchButton(){
        webDriver.findElement(By.xpath(FILTERBUTTON)).click();
    }
    protected void cityInput(){
        webDriver.findElement(By.xpath(SEARCHINPUT)).sendKeys(CITY);
        webDriver.findElement(By.xpath(SEARCHINPUT)).sendKeys(Keys.ENTER);
    }


}


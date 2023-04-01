package Task3.Pages;
import org.openqa.selenium.By;

import static Task3.TestSettings.BaseTest.webDriver;

public class ResultForm {

     private final String regaxTwoWords = "^([A-z]).*?\\s([A-z]).*?\\s";
     private final String regaxOneWord = "^([A-z]).*?\\s";
     private final String regaxThreeWords = "^([A-z]).*?\\s([A-z]).*?\\s([A-z]).*?\\s";
            public String getStudentName(){
                return webDriver.findElements(By.tagName("tr")).get(1).getText().replaceAll(regaxTwoWords,"");
            }
            public String getMail(){
                return webDriver.findElements(By.tagName("tr")).get(2).getText().replaceAll(regaxTwoWords,"");
            }
            public String getGender(){
                return webDriver.findElements(By.tagName("tr")).get(3).getText().replaceAll(regaxOneWord,"");
            }
            public String getMobile(){
                return webDriver.findElements(By.tagName("tr")).get(4).getText().replaceAll(regaxOneWord,"");
            }
            public String getDateOfBirth(){
                return webDriver.findElements(By.tagName("tr")).get(5).getText().replaceAll(regaxThreeWords,"");
            }
            public String getSubjects(){
                return webDriver.findElements(By.tagName("tr")).get(6).getText().replaceAll(regaxOneWord,"");
    }
            public String getHobbies(){
                return webDriver.findElements(By.tagName("tr")).get(7).getText().replaceAll(regaxOneWord,"");
            }
            public String getPic(){
                return webDriver.findElements(By.tagName("tr")).get(8).getText().replaceAll(regaxOneWord,"");
            }
            public String getAddress(){
                return webDriver.findElements(By.tagName("tr")).get(9).getText().replaceAll(regaxOneWord,"");
            }
            public String getStateAndCity(){
                return webDriver.findElements(By.tagName("tr")).get(10).getText().replaceAll(regaxThreeWords,"");
            }
}

package Task3;
import org.openqa.selenium.By;

public class ResultForm extends BaseTest{
     private final String regaxTwoWords = "^([A-z]).*?\\s([A-z]).*?\\s";
     private final String regaxOneWord = "^([A-z]).*?\\s";
     private final String regaxThreeWords = "^([A-z]).*?\\s([A-z]).*?\\s([A-z]).*?\\s";
            protected String getStudentName(){
                return webDriver.findElements(By.tagName("tr")).get(1).getText().replaceAll(regaxTwoWords,"");
            }
            protected String getMail(){
                return webDriver.findElements(By.tagName("tr")).get(2).getText().replaceAll(regaxTwoWords,"");
            }
            protected String getGender(){
                return webDriver.findElements(By.tagName("tr")).get(3).getText().replaceAll(regaxOneWord,"");
            }
            protected String getMobile(){
                return webDriver.findElements(By.tagName("tr")).get(4).getText().replaceAll(regaxOneWord,"");
            }
            protected String getDateOfBirth(){
                return webDriver.findElements(By.tagName("tr")).get(5).getText().replaceAll(regaxThreeWords,"");
            }
            protected String getSubjects(){
                return webDriver.findElements(By.tagName("tr")).get(6).getText().replaceAll(regaxOneWord,"");
    }
            protected String getHobbies(){
                return webDriver.findElements(By.tagName("tr")).get(7).getText().replaceAll(regaxOneWord,"");
            }
            protected String getPic(){
                return webDriver.findElements(By.tagName("tr")).get(8).getText().replaceAll(regaxOneWord,"");
            }
            protected String getAddress(){
                return webDriver.findElements(By.tagName("tr")).get(9).getText().replaceAll(regaxOneWord,"");
            }
            protected String getStateAndCity(){
                return webDriver.findElements(By.tagName("tr")).get(10).getText().replaceAll(regaxThreeWords,"");
            }
}

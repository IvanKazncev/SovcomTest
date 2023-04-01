package Task3.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import static Task3.TestSettings.BaseTest.webDriver;
public class StudentRegistrationFormPage {

    private final String URL = "https://demoqa.com/automation-practice-form";
    private final String NAME = "Ivan";
    private final String LASTNAME = "Kazantsev";
    private final String EMAIL = "vowkaz@inbox.ru";
    private final String MOBILENUMBER = "9873548103";
    private final String SUBJECT = "E";
    private final String CURRENTADDRESS = "Центральная д.6";
    private final String PICTURE = "C:\\Users\\Рубиик\\IdeaProjects\\SovcomTest\\src\\main\\resources\\Pic.bmp";
    private final String firstNameInput = "#firstName";
    private final String  lastNameInput = "#lastName";
    private final String emailInput = "#userEmail";
    private final String genderChoiceMale = ".custom-control-label";
    private final String telNumberInput = "#userNumber";
    private final String dateOfBirth = "#dateOfBirthInput";
    private final String dateOfBirthMonth = ".react-datepicker__month-select";
    private final String getDateOfBirthMonthJune = "//div[@class=\"react-datepicker__month-dropdown-container " +
            "react-datepicker__month-dropdown-container--select\"]/select/option[6]";
    private final String dateOfBirthYear = "//SELECT[@class='react-datepicker__year-select']";
    private final String dateOfBirthYear1988 = "//div[@class=\"react-datepicker__year-dropdown-container" +
            " react-datepicker__year-dropdown-container--select\"]/select/option[89]";
    private final String dateOfBirthDate = "//DIV[@class='react-datepicker__day react-datepicker__day--008'][text()='8']";
    private final String subjects = ".subjects-auto-complete__input";
    private final String subjectsOpen = "#subjectsInput";
    private final String hobbies = ".custom-control-label";
    private final String picture = "#uploadPicture";
    private final String currentAddress = "#currentAddress";
    private final String stateAndCity = "#state";
    private final String setState = "#react-select-3-option-1";
    private final String city = ".css-1wa3eu0-placeholder";
    private final String setCity = "#react-select-4-option-1";
    private final String submitButton = "#submit";
    private final String finalWindow = "//DIV[@class='modal-body']";
    private final String getColorFirstName = "//*[@id=\"firstName\"]";
    private final String getColorLastName = "//*[@id=\"lastName\"]";
    private final String getColorMobile ="//*[@id=\"userNumber\"]";
    private final String getColorGender = "//*[@id=\"genterWrapper\"]/div[2]/div[1]/label";


     public void go(){
        webDriver.get(URL);
    }
    public void setName(){
        webDriver.findElement(By.cssSelector(firstNameInput)).sendKeys(NAME);
    }
    public void setLastname(){
        webDriver.findElement(By.cssSelector(lastNameInput)).sendKeys(LASTNAME);
    }
    public void setEmail(){
        webDriver.findElement(By.cssSelector(emailInput)).sendKeys(EMAIL);
    }
    public void setGenderChoiceMale(){
        webDriver.findElements(By.cssSelector(genderChoiceMale)).get(0).click();
    }
    public void setMobileNumber(){
        webDriver.findElement(By.cssSelector(telNumberInput)).sendKeys(MOBILENUMBER);
    }
    public void setDateOfBirth(){
        webDriver.findElement(By.cssSelector(dateOfBirth)).click();
        webDriver.findElement(By.cssSelector(dateOfBirthMonth)).click();
        webDriver.findElement(By.xpath(getDateOfBirthMonthJune)).click();
        webDriver.findElement(By.xpath(dateOfBirthYear)).click();
        webDriver.findElement(By.xpath(dateOfBirthYear1988)).click();
        webDriver.findElement(By.xpath(dateOfBirthDate)).click();
    }
    public void setHobbies(){
        webDriver.findElements(By.cssSelector(hobbies)).get(3).click();
    }
    public void setPicture(){
        webDriver.findElement(By.cssSelector(picture)).sendKeys(PICTURE);
    }
    public void setCurrentAddress(){
        webDriver.findElement(By.cssSelector(currentAddress)).sendKeys(CURRENTADDRESS);
    }
    public void setStateAndCity(){
        webDriver.findElement(By.cssSelector(stateAndCity)).click();
        webDriver.findElement(By.cssSelector(setState)).click();
        webDriver.findElement(By.cssSelector(city)).click();
        webDriver.findElement(By.cssSelector(setCity)).click();
    }
    public void setSubmitButton(){
        webDriver.findElement(By.cssSelector(submitButton)).click();
    }
    public void setSubject(){
        webDriver.findElement(By.cssSelector(subjectsOpen)).click();
        webDriver.findElement(By.cssSelector(subjectsOpen)).sendKeys(SUBJECT);
        webDriver.findElement(By.cssSelector(subjectsOpen)).sendKeys(Keys.TAB);
    }
    public String getColorFirstName(){
       var color =  webDriver.findElement(By.xpath(getColorFirstName)).getCssValue("border-color");
        return color;
    }
    public String getColorLastName(){
        var color =  webDriver.findElement(By.xpath(getColorLastName)).getCssValue("border-color");
        return color;
    }
    public String getColorMobile(){
        var color =  webDriver.findElement(By.xpath(getColorMobile)).getCssValue("border-color");
        return color;
    }
    public String getColorGender(){
        var color =  webDriver.findElement(By.xpath(getColorGender)).getCssValue("color");
        return color;
    }
}



package Task3;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class StudentRegistrationFormPage extends BaseTest {

    private final String URL = "https://demoqa.com/automation-practice-form";
    private final String NAME = "Ivan";
    private final String LASTNAME = "Kazantsev";
    private final String EMAIL = "vowkaz@inbox.ru";
    private final String MOBILENUMBER = "9873548103";
    private final String SUBJECT = "E";
    private final String CURRENTADDRESS = "Центральная д.6";
    private final String PICTURE = "C:\\Users\\Рубиик\\IdeaProjects\\SovcomTest\\src\\main\\resources\\Pic.bmp";

    private final String firstNameInput = "#firstName";
    private final  String  lastNameInput = "#lastName";
    private final String emailInput = "#userEmail";
    private final String genderChoiceMale = ".custom-control-label";
    private final String telNumberInput = "#userNumber";
    private final String dateOfBirth = "#dateOfBirthInput";
    private final String dateOfBirthMonth = ".react-datepicker__month-select";
    private final String getDateOfBirthMonthJune = "//div[@class=\"react-datepicker__month-dropdown-container react-datepicker__month-dropdown-container--select\"]/select/option[6]";
    private final String dateOfBirthYear = "//SELECT[@class='react-datepicker__year-select']";
    private final String dateOfBirthYear1988 = "//div[@class=\"react-datepicker__year-dropdown-container react-datepicker__year-dropdown-container--select\"]/select/option[89]";
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


    protected void go(){
        webDriver.get(URL);
    }
    protected void setName(){
        webDriver.findElement(By.cssSelector(firstNameInput)).sendKeys(NAME);
    }
    protected void setLastname(){
        webDriver.findElement(By.cssSelector(lastNameInput)).sendKeys(LASTNAME);
    }
    protected void setEmail(){
        webDriver.findElement(By.cssSelector(emailInput)).sendKeys(EMAIL);
    }
    protected void setGenderChoiceMale(){
        webDriver.findElements(By.cssSelector(genderChoiceMale)).get(0).click();
    }
    protected void setMobileNumber(){
        webDriver.findElement(By.cssSelector(telNumberInput)).sendKeys(MOBILENUMBER);
    }
    protected void setDateOfBirth(){
        webDriver.findElement(By.cssSelector(dateOfBirth)).click();
        webDriver.findElement(By.cssSelector(dateOfBirthMonth)).click();
        webDriver.findElement(By.xpath(getDateOfBirthMonthJune)).click();
        webDriver.findElement(By.xpath(dateOfBirthYear)).click();
        webDriver.findElement(By.xpath(dateOfBirthYear1988)).click();
        webDriver.findElement(By.xpath(dateOfBirthDate)).click();
    }
    protected void setHobbies(){
        webDriver.findElements(By.cssSelector(hobbies)).get(3).click();
    }
    protected void setPicture(){
        webDriver.findElement(By.cssSelector(picture)).sendKeys(PICTURE);
    }
    protected void setCurrentAddress(){
        webDriver.findElement(By.cssSelector(currentAddress)).sendKeys(CURRENTADDRESS);
    }
    protected void setStateAndCity(){
        webDriver.findElement(By.cssSelector(stateAndCity)).click();
        webDriver.findElement(By.cssSelector(setState)).click();
        webDriver.findElement(By.cssSelector(city)).click();
        webDriver.findElement(By.cssSelector(setCity)).click();
    }
    protected void setSubmitButton(){
        webDriver.findElement(By.cssSelector(submitButton)).click();
    }
    protected void setSubject(){
        webDriver.findElement(By.cssSelector(subjectsOpen)).click();
        webDriver.findElement(By.cssSelector(subjectsOpen)).sendKeys(SUBJECT);
        webDriver.findElement(By.cssSelector(subjectsOpen)).sendKeys(Keys.TAB);
    }
    protected String getColorFirstName(){
       var color =  webDriver.findElement(By.xpath("//*[@id=\"firstName\"]")).getCssValue("border-color");
        return color;
    }
    protected String getColorLastName(){
        var color =  webDriver.findElement(By.xpath("//*[@id=\"lastName\"]")).getCssValue("border-color");
        return color;
    }
    protected String getColorMobile(){
        var color =  webDriver.findElement(By.xpath("//*[@id=\"userNumber\"]")).getCssValue("border-color");
        return color;
    }
    protected String getColorGender(){
        var color =  webDriver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).getCssValue("color");
        return color;
    }
}



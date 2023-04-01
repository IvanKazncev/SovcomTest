package Task3.Test;

import Task3.Pages.ResultForm;
import Task3.Pages.StudentRegistrationFormPage;
import Task3.TestSettings.BaseTest;
import lombok.SneakyThrows;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentRegistrationFormTest extends BaseTest {
    StudentRegistrationFormPage studentRegistrationFormPage = new StudentRegistrationFormPage();
    ResultForm resultForm = new ResultForm();

    //Позитивный тест на заполнение формы регистрации
    @SneakyThrows
    @Test
    public void formTest() {

        studentRegistrationFormPage.go();
        studentRegistrationFormPage.setName();
        studentRegistrationFormPage.setLastname();
        studentRegistrationFormPage.setEmail();
        studentRegistrationFormPage.setGenderChoiceMale();
        studentRegistrationFormPage.setMobileNumber();
        studentRegistrationFormPage.setDateOfBirth();
        studentRegistrationFormPage.setSubject();
        studentRegistrationFormPage.setHobbies();
        studentRegistrationFormPage.setPicture();
        studentRegistrationFormPage.setCurrentAddress();
        studentRegistrationFormPage.setStateAndCity();
        studentRegistrationFormPage.setSubmitButton();
        Thread.sleep(300);
        Assertions.assertThat("Ivan Kazantsev").isEqualTo(resultForm.getStudentName());
        Assertions.assertThat("vowkaz@inbox.ru").isEqualTo(resultForm.getMail());
        Assertions.assertThat("Male").isEqualTo(resultForm.getGender());
        Assertions.assertThat("9873548103").isEqualTo(resultForm.getMobile());
        Assertions.assertThat("08 June,1988").isEqualTo(resultForm.getDateOfBirth());
        Assertions.assertThat("English").isEqualTo(resultForm.getSubjects());
        Assertions.assertThat("Sports").isEqualTo(resultForm.getHobbies());
        Assertions.assertThat("Pic.bmp").isEqualTo(resultForm.getPic());
        Assertions.assertThat("Центральная д.6").isEqualTo(resultForm.getAddress());
        Assertions.assertThat("Uttar Pradesh Lucknow").isEqualTo(resultForm.getStateAndCity());
    }

    //Негативный тест. Оставляем поля пустыми. Проверяем на уведомление (выделения поля красным цветом) на полях
    // Имя, Фамилия,Телефон,Выбор пола.
    @Test
    public void negativeTest() throws InterruptedException {
        studentRegistrationFormPage.go();
        studentRegistrationFormPage.setSubmitButton();
        Thread.sleep(500);
        Assertions.assertThat("rgb(220, 53, 69)").isEqualTo(studentRegistrationFormPage.getColorFirstName());
        Assertions.assertThat("rgb(220, 53, 69)").isEqualTo(studentRegistrationFormPage.getColorLastName());
        Assertions.assertThat("rgb(220, 53, 69)").isEqualTo(studentRegistrationFormPage.getColorMobile());
        Assertions.assertThat("rgba(220, 53, 69, 1)").isEqualTo(studentRegistrationFormPage.getColorGender());

    }
}

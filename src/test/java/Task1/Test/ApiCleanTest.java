package Task1.Test;
import Task1.Models.ErrorModel;
import Task1.Models.ResultModel;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import static io.restassured.RestAssured.given;

public class ApiCleanTest {
    FileInputStream file = new FileInputStream(new File("src/main/resources/testURL.xlsx"));
    XSSFWorkbook workbook = new XSSFWorkbook(file);
    public ApiCleanTest() throws IOException {
    }
    // Позитивный тест. На изменение ссылки
    @Test
    void apiTest()  {

        String url = workbook.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
        String website = workbook.getSheetAt(0).getRow(0).getCell(1).getStringCellValue();

        List<ResultModel> response = Collections.singletonList(given()
                .log().all()
                .contentType("multipart/form-data")
                .multiPart(url, website)
                .when()
                .post("https://cleanuri.com/api/v1/shorten")
                .then()
                .log().status()
                .log().body()
                .statusCode(200)
                .extract().body().as(ResultModel.class));
            response.forEach(x-> Assertions.assertTrue(x.getResult_url().contains("vkVRA5")));

        }
    //Негативный тест. Отправляем некорректную ссылку. Получаем 400 код ответа и ошибку.
    @Test
        void apiTestNegative(){

        String url = workbook.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
        String website = workbook.getSheetAt(0).getRow(0).getCell(2).getStringCellValue();

       List<ErrorModel> response = Collections.singletonList(given()
               .log().all()
               .contentType("multipart/form-data")
               .multiPart(url, website)
               .when()
               .post("https://cleanuri.com/api/v1/shorten")
               .then()
               .log().status()
               .log().body()
               .statusCode(400)
               .extract().body().as(ErrorModel.class));
       response.forEach(x-> Assertions.assertTrue(x.getError().equals("API Error: URL is invalid. (check #2)")));

        }
    }


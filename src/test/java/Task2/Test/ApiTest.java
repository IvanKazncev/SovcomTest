package Task2.Test;
import Task2.Models.ModelGender;
import Task2.Models.ResultModel;
import io.restassured.http.ContentType;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Type;
import static io.restassured.RestAssured.given;



//Позитивные тест. Проверка данные поступили и не равны 0.
public class ApiTest {
    ModelGender modelGender = new ModelGender();
    ResultModel resultModel = new ResultModel();
    @Test
    public void testApi(){
     ResultModel response = given()
             .log().uri()
             .queryParam("gender", "male")
             .queryParam("results", "2")
             .when()
             .get("https://randomuser.me/api")
             .then().log().all()
             .statusCode(200)
             .extract().as((Type) ResultModel.class);
            Assertions.assertThat(response.getResults().stream().map(x->x.getGender())).isNotEmpty();
            Assertions.assertThat(response.getResults().stream().map(x->x.getGender())).contains("male");
          System.out.println(response);


   }

   //Негативный тест. При указании не валидной ссылки получаем 404 код ответа.
   @Test
   public void testApiNegative(){
        given()
               .log().uri()
               .queryParam("gender", "male")
               .when()
               .contentType(ContentType.JSON)
               .get("https://randomuser.me/apii")
               .then()
               .log().body()
               .statusCode(404);
   }
}

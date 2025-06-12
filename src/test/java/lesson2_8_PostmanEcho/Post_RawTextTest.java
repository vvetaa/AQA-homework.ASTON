package lesson2_8_PostmanEcho;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Post_RawTextTest {

    @Test
    public void post_thenStatus200() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("application/json")
                .body("{\n" +
                        "    \"test\": \"Hello\"\n" +
                        "}")
                .when()
                .post("/post")
                .then().log().body()
                .statusCode(200)
                .and()
                .body("data.test", equalTo("Hello"));
    }
}

package lesson2_8_PostmanEcho;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PutTest {

    @Test
    public void put_thenStatus200() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain")
                .body("Java test Postman Echo")
                .when()
                .put("/put")
                .then().log().body()
                .statusCode(200)
                .and()
                .body("data", equalTo("Java test Postman Echo"));
    }
}

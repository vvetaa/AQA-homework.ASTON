package lesson2_8_PostmanEcho;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Post_FormDataTest {

    @Test
    public void post_thenStatus200() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("application/x-www-form-urlencoded; charset=utf-8")
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .when()
                .post("/post")
                .then().log().body()
                .statusCode(200)
                .and()
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"));
    }
}

package apitests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetUserTest {

    String baseUrl = "https://jsonplaceholder.typicode.com";

    @Test
    public void getUserTest() {
        given()
            .baseUri(baseUrl)
        .when()
            .get("/users/1")
        .then()
            .statusCode(200)
            .body("name", equalTo("Leanne Graham"))
            .body("email", equalTo("Sincere@april.biz"));

        System.out.println("GET User Test Passed!");
    }

    @Test
    public void getUserNotFoundTest() {
        given()
            .baseUri(baseUrl)
        .when()
            .get("/users/150")
        .then()
            .statusCode(404);

        System.out.println("GET User 404 Test Passed!");
    }
}

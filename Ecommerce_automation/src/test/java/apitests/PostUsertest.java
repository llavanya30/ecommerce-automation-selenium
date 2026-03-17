package apitests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.http.ContentType;

public class PostUsertest {

    String baseUrl = "https://jsonplaceholder.typicode.com";

    @Test
    public void createPostTest() {
        String requestBody = "{\n" +
            "\"title\": \"Lavanya's Post\",\n" +
            "\"body\": \"API Testing is fun!\",\n" +
            "\"userId\": 1\n" +
            "}";

        given()
            .baseUri(baseUrl)
            .contentType(ContentType.JSON)
            .body(requestBody)
        .when()
            .post("/posts")
        .then()
            .statusCode(201)
            .body("title", equalTo("Lavanya's Post"))
            .body("id", notNullValue());

        System.out.println("POST Test Passed!");
    }
}
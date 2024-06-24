import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.*;

public class TestAPI {

    private static String testURL = "https://postman-echo.com";
    private int statusCode = 200;

    @BeforeClass
    public static void setup() {
        RestAssured.baseURI = testURL;
    }

    @Test
    public void testGetMethod() {
        given()
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when()
                .get("/get")
                .then()
                .statusCode(statusCode)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"));
    }

    @Test
    public void testPostMethod() {
        given()
                .contentType("application/json")
                .body("{\"name\":\"Nikita\", \"lastName\":\"Kostyukov\"}")
                .when()
                .post("/post")
                .then()
                .statusCode(statusCode)
                .body("json.name", equalTo("Nikita"))
                .body("json.lastName", equalTo("Kostyukov"));
    }

    @Test
    public void testPutMethod() {
        given()
                .contentType("application/json")
                .body("{\"foo1\":\"bar1\", \"foo2\":\"bar2\"}")
                .when()
                .put("/put")
                .then()
                .statusCode(statusCode)
                .body("json.foo1", equalTo("bar1"))
                .body("json.foo2", equalTo("bar2"));
    }

    @Test
    public void testPatchMethod() {
        given()
                .contentType("application/json")
                .body("{\"foo1\":\"bar1\", \"foo2\":\"bar2\"}")
                .when()
                .patch("/patch")
                .then()
                .statusCode(statusCode)
                .body("json.foo1", equalTo("bar1"))
                .body("json.foo2", equalTo("bar2"));
    }

    @Test
    public void testDeleteMethod() {
        given()
                .contentType("application/json")
                .body("This is expected to be sent back as part of response body.")
                .when()
                .delete("/delete")
                .then()
                .log().body()
                .statusCode(statusCode)
                .body("data", equalTo("This is expected to be sent back as part of response body."))
                .body("url", equalTo("https://postman-echo.com/delete"));
    }
}
package com.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.equalTo;

@QuarkusTest
public class HelloResponderTest {
    @Test
    public void testDefaultChain() {
        String type = "hello";
        given().contentType("application/json")
                .header("ce-specversion", "1.0")
                .header("ce-id", UUID.randomUUID().toString())
                .header("ce-type", type)
                .header("ce-source", "test")
                .body("\"Start\"")
                .post("/")
                .then().statusCode(200)
                .header("ce-id", notNullValue())
                .header("ce-type", String.format("%s.output", type))
                .header("ce-source", type)
                .body(equalTo("\"Start::defaultChain\""));
    }
}

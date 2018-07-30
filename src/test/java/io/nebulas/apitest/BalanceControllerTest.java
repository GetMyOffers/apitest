package io.nebulas.apitest;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.InputStream;
import java.util.Scanner;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

/**
 * created by Keqi Huang on 2018/7/25.
 */
@RunWith(JUnit4.class)
@SpringBootTest(classes = ApiTestBootstrap.class)
@EnableAutoConfiguration
public class BalanceControllerTest {

    private final InputStream bodyInputStream = getClass().getResourceAsStream("/BalanceControllerRequest.json");
    private final String requestBody = new Scanner(bodyInputStream).useDelimiter("\\Z").next();
    private final Headers headers = new Headers(new Header("Content-Type", "application/json"),
                                                new Header("charset", "UTF-8"),
                                                new Header("x-neb-os", "android"),
                                                new Header("x-neb-appid", "nasnano"),
                                                new Header("x-neb-version", "2.0.0"),
                                                new Header("x-neb-cunit", "usd"),
                                                new Header("x-neb-language", "cn"),
                                                new Header("x-neb-deviceid", "c042d7de-f38b-405d-baa1-d722455694d1"));
    @BeforeClass
    public static void setUp() {
        RestAssured.baseURI= "http://47.105.39.106";
        RestAssured.port = 8090;
        RestAssured.basePath = "/api/v1/account/balance";
    }


    @Test
    public void testCorrectResponse() {
        // given().
        //         headers(headers).
        //         body(requestBody).
        // post("").then().assertThat().statusCode(200).body(matchesJsonSchemaInClasspath("BalanceControllerResponse.json"));
    }

    @Test
    public void testResponse() {
        // given().
        //         headers(headers).
        //         body(requestBody).
        //         post("").then().assertThat().statusCode(200).body(matchesJsonSchemaInClasspath("ww.json"));
    }
}

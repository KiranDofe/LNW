package com.lightwonder.qa;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserAPITest {

    @Test
    public void verfiyGetUsersAPI() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        Response response = RestAssured
            .given()
            .when()
            .get("/users/2");
        
        Assert.assertEquals(response.getStatusCode(),200);
    }
    
}

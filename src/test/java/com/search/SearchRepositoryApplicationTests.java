package com.search;

import static com.jayway.restassured.RestAssured.given;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchRepositoryApplicationTests {

	@Test
	public void basicPingTest() {
		given().when().get("https://api.github.com").then().statusCode(200);
	}

}

package com.MyGetRequestSD;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class GetRequestCucuSD 
{
	Response res;
	@Given("^user start the rest asured test$")
	public void user_start_the_rest_asured_test()
	{
		System.out.println("Starting of the GET request");
	}
	
	@When("^user hit the get request$")
	public void user_hit_the_get_request()
	{
		 res = RestAssured.given().relaxedHTTPSValidation()
			  .when().get("https://ergast.com/api/f1/2017/circuits.json");
		 
		 //print response in string
		 String respString = res.asString();
		 System.out.println(respString);
		 
//		 //get all headers
//		 Headers heds =res.getHeaders();
//		 System.out.println(heds);
	}
	
	@Then ("^user checks (\\d+) the status code$")
	public void user_checks_the_status_code(int expStCode)
	{
		int statusCode = res.getStatusCode();
		Assert.assertTrue(expStCode==statusCode);
	}
	
	@Then ("^user checks the count or size")
	public void user_checks_the_count_or_size()
	{
		String limitValue =res.getBody().jsonPath().getString("MRData.limit");
		Assert.assertEquals("30",limitValue);
		
//		//verify the size
//		res.then().assertThat().body("MRData.CircuitTable.Circuits.circuitId",hasSize(20));
	}
	
	
	@Then ("^user checks at path \"([^\"]*)\" with the \"([^\"]*)\" value$")
	public void user_checks_at_path_with_the_value(String circuitId,String idValueExpected)
	{
		String idValueActual =res.getBody().jsonPath().getString(circuitId);
		Assert.assertEquals(idValueActual,idValueExpected);
		
	}
}

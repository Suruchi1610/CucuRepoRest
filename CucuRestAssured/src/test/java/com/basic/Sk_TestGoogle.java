package com.basic;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class Sk_TestGoogle
{

	public static void main(String[] args)
	{
		Response res = RestAssured.given().get("https://www.google.co.in/");
		int statusCode = res.getStatusCode();
		Assert.assertEquals(200,statusCode);
	}
	
	@Test
	public  void TestGoogle()
	{
		Response res = RestAssured.given().get("https://www.google.co.in/");
		int statusCode = res.getStatusCode();
		Assert.assertEquals(200,statusCode);
	}

}

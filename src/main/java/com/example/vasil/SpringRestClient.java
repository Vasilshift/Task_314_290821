package com.example.vasil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@SpringBootApplication
public class SpringRestClient {

	private static final String GET_USERS_ENDPOINT_URL = "http://localhost:8080/api/users";
	private static final String GET_USER_ENDPOINT_URL = "http://localhost:8080/api/users/{id}";
	private static final String CREATE_USER_ENDPOINT_URL = "http://localhost:8080/api/users";
	private static final String UPDATE_USER_ENDPOINT_URL = "http://localhost:8080/api/users/{id}";
	private static final String DELETE_USER_ENDPOINT_URL = "http://localhost:8080/api/users/{id}";
	private static RestTemplate restTemplate = new RestTemplate();

	public static void main(String[] args) {
		SpringApplication.run(SpringRestClient.class, args);

		SpringRestClient springRestClient = new SpringRestClient();

//		// Step1: first create a new employee
//		springRestClient.createUser();
//
//		// Step 2: get new created employee from step1
//		springRestClient.getEmployeeById();

		// Step3: get all employees
		springRestClient.getUsers();

//		// Step4: Update employee with id = 1
//		springRestClient.updateEmployee();
//
//		// Step5: Delete employee with id = 1
//		springRestClient.deleteEmployee();
	}


	private void getUsers() {

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity <String> entity = new HttpEntity <String> ("parameters", headers);

		ResponseEntity <String> result = restTemplate.exchange(GET_USERS_ENDPOINT_URL, HttpMethod.GET, entity,
				String.class);

		System.out.println(result);
	}





}

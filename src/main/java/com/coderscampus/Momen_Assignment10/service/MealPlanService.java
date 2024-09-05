package com.coderscampus.Momen_Assignment10.service;

import java.net.URI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class MealPlanService {
	@Value("${spoonacular.api.key}")
	private String apiKey;
	@Value("${spoonacular.urls.base}")
	private String urlBase;
	@Value("${spoonacular.urls.mealplan}")
	private String urlMealPlan;

	RestTemplate rt = new RestTemplate();

	public <T> ResponseEntity<T> fetchingDataFromSpoonacular(String numCalories, String diet, String exclusions,
			String timeFrame, Class<T> responseClass) {

		URI uri = buildUrl(timeFrame, numCalories, diet, exclusions);

		return rt.getForEntity(uri, responseClass);

	}

	public URI buildUrl(String timeFrame, String numCalories, String diet, String exclusions) {
		return UriComponentsBuilder.fromHttpUrl(urlBase + urlMealPlan)
				.queryParam("timeFrame", timeFrame)
				.queryParam("targetCalories", numCalories)
				.queryParam("diet", diet)
				.queryParam("exclude", exclusions)
				.queryParam("apiKey", apiKey)
				.build()
				.toUri();

	}

}

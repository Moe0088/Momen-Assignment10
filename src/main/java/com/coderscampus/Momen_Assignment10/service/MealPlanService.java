package com.coderscampus.Momen_Assignment10.service;

import java.net.URI;
import java.util.Optional;

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

	public <T> ResponseEntity<T> fetchingDataFromSpoonacular(String timeFrame, String numCalories, String diet,
															 String exclusions, Class<T> responseClass) {

		URI uri = buildUrl(timeFrame, numCalories, diet, exclusions);

		return rt.getForEntity(uri, responseClass);

	}

	public URI buildUrl(String timeFrame, String numCalories, String diet, String exclusions) {
		UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(urlBase + urlMealPlan)
				.queryParam("timeFrame", timeFrame)
				.queryParam("apiKey", apiKey);

		if (numCalories != null) {
			uriBuilder.queryParam("targetCalories", numCalories);
		}
		if (diet != null) {
			uriBuilder.queryParam("diet", diet);
		}
		if (exclusions != null) {
			uriBuilder.queryParam("exclude", exclusions);
		}


		return uriBuilder.build().toUri();

	}

}

package com.coderscampus.Momen_Assignment10.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@Service
public class SpoonacularApiService {
    @Value("${spoonacular.api.key}")
    private String apiKey;
    @Value("${spoonacular.urls.base}")
    private String urlBase;
    @Value("${spoonacular.urls.mealplan}")
    private String urlMealPlan;

    public URI fetchingDataFromSpoonacular(String timeFrame, String numCalories, String diet,
                                           String exclusions) {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(urlBase + urlMealPlan)
                .queryParam("timeFrame", timeFrame)
                .queryParam("apiKey", apiKey)
                .queryParamIfPresent("targetCalories", Optional.ofNullable(numCalories))
                .queryParamIfPresent("diet", Optional.ofNullable(diet))
                .queryParamIfPresent("exclude", Optional.ofNullable(exclusions));

        return uriBuilder.build().toUri();
    }
}

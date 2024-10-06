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


    RestTemplate restTemplate = new RestTemplate();
    private final SpoonacularApiService spoonacularApiService;

    public MealPlanService(SpoonacularApiService spoonacularApiService) {
        this.spoonacularApiService = spoonacularApiService;
    }

    public <T> ResponseEntity<T> getDayWeekPlan(String timeFrame, String numCalories, String diet, String exclusions, Class<T> responseClass) {
        URI uri = spoonacularApiService.fetchingDataFromSpoonacular(timeFrame, numCalories, diet, exclusions);
        return restTemplate.getForEntity(uri, responseClass);
    }
}



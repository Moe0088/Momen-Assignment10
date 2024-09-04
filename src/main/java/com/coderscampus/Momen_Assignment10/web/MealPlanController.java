package com.coderscampus.Momen_Assignment10.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.coderscampus.Momen_Assignment10.dto.DayResponse;
import com.coderscampus.Momen_Assignment10.dto.WeekResponse;

public class MealPlanController {

	@GetMapping("mealplanner/week")

	public ResponseEntity<WeekResponse> getWeekMeals(String numCalories, String diet, String exclusions) {
		return null;
	}

	@GetMapping("mealplanner/day")

	public ResponseEntity<DayResponse> getDayMeals(String numCalories, String diet, String exclusions) {
		return null;
	}
}

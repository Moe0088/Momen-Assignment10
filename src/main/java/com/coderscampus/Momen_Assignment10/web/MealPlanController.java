package com.coderscampus.Momen_Assignment10.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.Momen_Assignment10.dto.DayResponse;
import com.coderscampus.Momen_Assignment10.dto.WeekResponse;
import com.coderscampus.Momen_Assignment10.service.MealPlanService;

@RestController
public class MealPlanController {

	@Autowired
	private MealPlanService mealPlanService;





	@GetMapping("mealplanner/week")
	public ResponseEntity<WeekResponse> getWeekMeals(@RequestParam String numCalories, @RequestParam String diet, @RequestParam String exclusions) {
		return mealPlanService.fetchingDataFromSpoonacular("week",numCalories, diet, exclusions,
				WeekResponse.class);
	}



	@GetMapping("mealplanner/day")
	public ResponseEntity<DayResponse> getDayMeals( @RequestParam String numCalories, @RequestParam String diet, @RequestParam String exclusions) {

		return mealPlanService.fetchingDataFromSpoonacular("day",numCalories, diet, exclusions,
				 DayResponse.class);
		
	}
}

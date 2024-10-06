package com.coderscampus.Momen_Assignment10.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.Momen_Assignment10.dto.DayResponse;
import com.coderscampus.Momen_Assignment10.dto.WeekResponse;
import com.coderscampus.Momen_Assignment10.service.MealPlanService;

@RestController
@RequestMapping("/mealplanner")
public class MealPlanController {


    private final MealPlanService mealPlanService;

    public MealPlanController(MealPlanService mealPlanService) {
        this.mealPlanService = mealPlanService;
    }

    @GetMapping("/week")
    public ResponseEntity<WeekResponse> getWeekMeals(String numCalories, String diet, String exclusions) {
        return mealPlanService.getDayWeekPlan("week", numCalories, diet, exclusions,
                WeekResponse.class);
    }


    @GetMapping("/day")
    public ResponseEntity<DayResponse> getDayMeals(String numCalories, String diet, String exclusions) {

        return mealPlanService.getDayWeekPlan("day", numCalories, diet, exclusions,
                DayResponse.class);

    }
}

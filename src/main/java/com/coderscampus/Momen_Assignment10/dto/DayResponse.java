package com.coderscampus.Momen_Assignment10.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DayResponse {
	@JsonProperty("meals")
	private List<Meal> meals;

	@JsonProperty("nutrients")
	private Nutrients nutrients;


	public List<Meal> getMeals() {
		return meals;
	}

	public void setMeals(List<Meal> meals) {
		this.meals = meals;
	}

	public Nutrients getNutrients() {
		return nutrients;
	}

	public void setNutrients(Nutrients nutrients) {
		this.nutrients = nutrients;
	}

}

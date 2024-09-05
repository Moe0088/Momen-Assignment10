package com.coderscampus.Momen_Assignment10.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeekResponse {
	@JsonProperty("meals")
	private List<Meals> meals;

	@JsonProperty("nutrients")
	private Nutrients nutrients;

	public List<Meals> getMeals() {
		return meals;
	}

	public void setMeals(List<Meals> meals) {
		this.meals = meals;
	}

	public Nutrients getNutrients() {
		return nutrients;
	}

	public void setNutrients(Nutrients nutrients) {
		this.nutrients = nutrients;
	}

}

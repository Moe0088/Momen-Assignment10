package com.coderscampus.Momen_Assignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Nutrients {
	@JsonProperty("calories")
	private String calories;
	@JsonProperty("carbohydrates")
	private String carbohydrates;
	@JsonProperty("fat")
	private String fat;
	@JsonProperty("protein")
	private String protein;

	public String getCalories() {
		return calories;
	}

	public void setCalories(String calories) {
		this.calories = calories;
	}

	public String getCarbohydrates() {
		return carbohydrates;
	}

	public void setCarbohydrates(String carbohydrates) {
		this.carbohydrates = carbohydrates;
	}

	public String getFat() {
		return fat;
	}

	public void setFat(String fat) {
		this.fat = fat;
	}

	public String getProtien() {
		return protein;
	}

	public void setProtien(String protien) {
		this.protein = protien;
	}

}

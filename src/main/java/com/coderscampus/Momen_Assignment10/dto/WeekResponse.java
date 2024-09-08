package com.coderscampus.Momen_Assignment10.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeekResponse {
	@JsonProperty("week")
	private WeekDays week;

	@JsonProperty("nutrients")
	private Nutrients nutrients;

	public WeekDays getWeek() {
		return week;
	}

	public void setWeek(WeekDays week) {
		this.week = week;
	}

	public Nutrients getNutrients() {
		return nutrients;
	}

	public void setNutrients(Nutrients nutrients) {
		this.nutrients = nutrients;
	}
}
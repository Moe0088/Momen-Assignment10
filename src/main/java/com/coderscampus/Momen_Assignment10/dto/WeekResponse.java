package com.coderscampus.Momen_Assignment10.dto;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeekResponse {
	@JsonProperty("week")
	private Map<String,DayResponse> week;

	public Map<String, DayResponse> getWeek() {
		return week;
	}

	public void setWeek(Map<String, DayResponse> week) {
		this.week = week;
	}
}
package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
	private String message;

	public MoodAnalyser() {
		this.message = "";
	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analysisMood() {
		try {
			if (message.contains("Sad") || message.contains("SAD")) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		} catch (NullPointerException e) {
			return "HAPPY";
		}
	}
}

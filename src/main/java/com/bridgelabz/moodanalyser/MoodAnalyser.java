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
		if (message.contains("Sad") || message.contains("SAD")) {
			return "Sad";
		} else {
			return "Happy";
		}
	}

}

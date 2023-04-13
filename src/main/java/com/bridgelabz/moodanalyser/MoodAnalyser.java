package com.bridgelabz.moodanalyser;

public class MoodAnalyser {

	public String analysisMood(String message) {
		if (message.contains("happy") || message.contains("Happy")) {
			return "Happy";
		} else {
			return "Sad";
		}
	}
}

package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
	private String message;

	public MoodAnalyser() {
		this.message = "";
	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analysisMood() throws MoodAnalyserException {
		try {
			if (message.length() == 0) {
				throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.EMPTY_MESSAGE,
						"Mood should not be empty");
			}
			if (message.contains("Sad") || message.contains("SAD")) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		} catch (NullPointerException e) {
			throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.NULL_MESSAGE,
					"Mood should not be null");
		}
	}
}

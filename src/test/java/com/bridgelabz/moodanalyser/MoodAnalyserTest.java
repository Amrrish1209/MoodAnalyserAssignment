package com.bridgelabz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
		try {
			String mood = moodAnalyser.analysisMood();
			Assert.assertEquals("SAD", mood);
		} catch (MoodAnalyserException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
		try {
			String mood = moodAnalyser.analysisMood();
			Assert.assertEquals("HAPPY", mood);
		} catch (MoodAnalyserException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenMessage_WhenNull_ShouldThrowMoodAnalysisException() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		try {
			moodAnalyser.analysisMood();
		} catch (MoodAnalyserException e) {
			Assert.assertEquals(MoodAnalyserException.ExceptionType.NULL_MESSAGE, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenMessage_WhenEmpty_ShouldThrowMoodAnalysisException() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("");
		try {
			moodAnalyser.analysisMood();
		} catch (MoodAnalyserException e) {
			Assert.assertEquals(MoodAnalyserException.ExceptionType.EMPTY_MESSAGE, e.type);
			System.out.println(e.getMessage());
		}
	}

}

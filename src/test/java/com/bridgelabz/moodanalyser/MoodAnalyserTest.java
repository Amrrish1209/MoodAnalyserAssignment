package com.bridgelabz.moodanalyser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void testHappyMood() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String message = "I am in Happy Mood";
		String mood = moodAnalyser.analysisMood(message);
		assertEquals("Happy", mood);
	}

	@Test
	public void testSadMood() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String message = "I am in Sad Mood";
		String mood = moodAnalyser.analysisMood(message);
		assertEquals("Sad", mood);
	}
}

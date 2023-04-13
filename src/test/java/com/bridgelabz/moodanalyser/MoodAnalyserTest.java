package com.bridgelabz.moodanalyser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void testHappyMood() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
		String mood = moodAnalyser.analysisMood();
		assertEquals("Happy", mood);
	}

	@Test
	public void testSadMood() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
		String mood = moodAnalyser.analysisMood();
		assertEquals("Sad", mood);
	}
}

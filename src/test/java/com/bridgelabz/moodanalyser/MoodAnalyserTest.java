package com.bridgelabz.moodanalyser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void testHappyMood() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
		String mood = moodAnalyser.analysisMood();
		assertEquals("HAPPY", mood);
	}

	@Test
	public void testSadMood() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
		String mood = moodAnalyser.analysisMood();
		assertEquals("SAD", mood);
	}

	@Test
	public void testNullMood() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		String mood = moodAnalyser.analysisMood();
		assertEquals("HAPPY", mood);
	}
}

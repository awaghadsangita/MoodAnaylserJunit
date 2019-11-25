package com.javacoreprojectjunit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestCoreConcept {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnaylser analyser = new MoodAnaylser(null);
        String mood = null;
        try {
            ExpectedException exceptionRule =ExpectedException.none();
            exceptionRule.expect(MoodAnaylsisException.class);
            mood = analyser.anaylseMood("this is SAD Mood");
            Assert.assertEquals("SAD",mood);
        } catch (MoodAnaylsisException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy(){
        MoodAnaylser moodAnalyser = new MoodAnaylser(null);
        String mood = null;
        try {
            ExpectedException exceptionRule=ExpectedException.none();
            exceptionRule.expect(MoodAnaylsisException.class);
            mood = moodAnalyser.anaylseMood("this is happy Mood");
            Assert.assertEquals("HAPPY",mood);
        } catch (MoodAnaylsisException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenNullMoodShouldThrowException() {
        MoodAnaylser moodAnaylser = new MoodAnaylser(null);
        try {
           moodAnaylser.anaylseMood(null);
        } catch (MoodAnaylsisException e) {
            Assert.assertEquals("Please enter proper message",e.getMessage());
        }
    }

    @Test
    public void givenMoodAnalserClass_WhenProper_ShouldReturnObject() {
        MoodAnaylser moodAnalyser = MoodAnalyserFactory.createMoodAnalyser("I am i Happy mood");
        String mood = null;
        try {
            mood = moodAnalyser.anaylseMood();
            Assert.assertEquals("HAPPY",mood);
        } catch (MoodAnaylsisException e) {
            e.printStackTrace();
        }
    }

}

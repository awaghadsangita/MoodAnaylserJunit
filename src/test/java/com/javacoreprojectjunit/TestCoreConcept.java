package com.javacoreprojectjunit;

import org.junit.Assert;
import org.junit.Test;

public class TestCoreConcept {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad(){
        MoodAnaylser analyser = new MoodAnaylser();
        String mood = analyser.anaylseMood("this is Sad Mood");
        Assert.assertEquals("SAD",mood);
    }
    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy(){
        MoodAnaylser moodAnalyser = new MoodAnaylser();
        String mood = moodAnalyser.anaylseMood("this is happy Mood");
        Assert.assertEquals("HAPPY",mood);
    }
    @Test
    public void givenNullMoodShouldReturnHappy() {
        MoodAnaylser moodAnaylser = new MoodAnaylser();
        String mood = moodAnaylser.anaylseMood(null);
        Assert.assertEquals("HAPPY",mood);

    }
}

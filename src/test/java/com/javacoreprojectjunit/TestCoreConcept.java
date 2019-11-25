package com.javacoreprojectjunit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestCoreConcept {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnaylser analyser = new MoodAnaylser();
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
        MoodAnaylser moodAnalyser = new MoodAnaylser();
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
        MoodAnaylser moodAnaylser = new MoodAnaylser();
        try {
            ExpectedException exceptionRule=ExpectedException.none();
            exceptionRule.expect(MoodAnaylsisException.class);
           moodAnaylser.anaylseMood(null);

        } catch (MoodAnaylsisException e) {
            e.printStackTrace();
        }



    }


}

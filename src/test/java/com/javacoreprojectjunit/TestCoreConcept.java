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
    public void givenMoodAnalserClass_WhenProper_ShouldReturnObject() throws MoodAnaylsisException{
        MoodAnaylser moodAnalyser = MoodAnalyserFactory.createMoodAnalyser("I am in Happy mood");
        Assert.assertEquals(new MoodAnaylser("I am in Happy mood"),moodAnalyser);
    }
    @Test
    public void givenObject_WhenCorrect_ReturnsInfoUsingReflection()
    {
        MoodAnaylser moodAnalyze = new MoodAnaylser();
        ObjectReflector.dump(moodAnalyze,3);
    }

    @Test
    public void givenNullMood_ShouldThrowException() {
        try{
            MoodAnaylser moodAnaylser = new MoodAnaylser(null);
            moodAnaylser.anaylseMood();

        }catch(MoodAnaylsisException e) {
            Assert.assertEquals(MoodAnaylsisException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    public void givenEmptyMood_ShouldThrowException() {
        try{
            MoodAnaylser moodAnaylser = new MoodAnaylser();
            moodAnaylser.anaylseMood("");
        }catch(MoodAnaylsisException e)
        {
            Assert.assertEquals(MoodAnaylsisException.ExceptionType.ENTERED_EMPTY,e.type);
        }
    }
}

package com.javacoreprojectjunit;

public class MoodAnaylser {
    public String anaylseMood( String message) throws MoodAnaylsisException {
        try{
            if (message.contains("SAD"))
            {
                return "SAD";
            }else
            {
                return "HAPPY";
            }
        }catch(NullPointerException e)
        {
            throw new MoodAnaylsisException("Please enter proper message");
        }
    }
}

package com.javacoreprojectjunit;

public class MoodAnaylser {
    public String anaylseMood( String message) {
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
            return "HAPPY";
        }
    }
}

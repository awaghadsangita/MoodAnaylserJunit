package com.javacoreprojectjunit;

public class MoodAnaylser {
    private String message;

    public MoodAnaylser(String message) {
        this.message=message;
    }
    public String anaylseMood(String message) throws MoodAnaylsisException {
        this.message=message;
        return  anaylseMood();
    }

    public String anaylseMood() throws MoodAnaylsisException {
        try{
            if(message.length()==0) {
                throw new MoodAnaylsisException("Please enter proper message");
            }else if(message.contains("SAD")){
                return "SAD";
            }else{
                return "HAPPY";
            }
        }catch(NullPointerException e){
            throw new MoodAnaylsisException("Please enter proper message");
        }
    }
}

package com.javacoreprojectjunit;

public class MoodAnaylser {
    private String message;

    public MoodAnaylser() {
    }

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
                throw new MoodAnaylsisException(MoodAnaylsisException.ExceptionType.ENTERED_EMPTY,"Please enter proper message");
            }else if(message.contains("SAD")){
                return "SAD";
            }else{
                return "HAPPY";
            }
        }catch(NullPointerException e){
            throw new MoodAnaylsisException(MoodAnaylsisException.ExceptionType.ENTERED_NULL,"Please enter proper message");
        }
    }
    public boolean equals(Object another)
    {
        if (this.message.equals(((MoodAnaylser)another).message))
            return true;
        return false;

    }
}

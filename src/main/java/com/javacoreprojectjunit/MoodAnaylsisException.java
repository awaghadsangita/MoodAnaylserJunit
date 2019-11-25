package com.javacoreprojectjunit;

public class MoodAnaylsisException extends Exception {
    enum ExceptionType{
        ENTERED_NULL,ENTERED_EMPTY
    }
    ExceptionType type;
    public MoodAnaylsisException(ExceptionType type,String message) {
        super(message);
        this.type=type;
    }
    public MoodAnaylsisException(ExceptionType type,Throwable cause)
    {
        super(cause);
        this.type=type;
    }
    public MoodAnaylsisException(ExceptionType type,String message,Throwable cause)
    {
        super(message,cause);
        this.type=type;
    }
}

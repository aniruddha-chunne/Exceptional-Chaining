package com.chainingException;

public class customException extends RuntimeException
{
    customException()
    {
        super("This is the custome exception");
    }

    @Override
    public String getMessage() {
        return "this is the getMessage()";
    }

    @Override
    public String toString() {
        return "this is .toString()";
    }

    public void initCause(String just_casual_reason)
    {
        System.out.println("we are casual reason");
    }
}

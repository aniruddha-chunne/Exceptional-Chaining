package com.inception;

public class YoungerAge extends Exception
{

    YoungerAge(String message)   // constructor
    {

        System.out.println(message);
    }

    @Override
    public String toString() {
        return "We are to string";
    }

    @Override
    public String getMessage() {
        return "Get Message";
    }

}

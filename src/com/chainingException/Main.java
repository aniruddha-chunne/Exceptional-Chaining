package com.chainingException;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("start");

        try
        {
            customException customException = new customException();

//            customException.initCause("just casual reason");

            customException.initCause(new IllegalAccessException("don't try to access it"));

            throw customException;
        }
        catch (Exception e)
        {

            System.out.println(e);
            System.out.println(e.getCause());
        }




//        try
//        {
//            throw new customException();
//        }
//        catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//            System.out.println(e.toString());
//            System.out.println(e);
//        }

//        two two = new two();
//
//        try
//        {
//            two.twoexcept();
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }

        System.out.println("end");
    }
}

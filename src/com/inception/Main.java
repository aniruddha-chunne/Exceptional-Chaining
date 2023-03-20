package com.inception;

public class Main
{

    public static void main(String[] args)
    {

        try {

            B b = new B();
            b.bmeth();


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("We have handled the expression");

//
//        try
//        {
//            throw new YoungerAge("we re Exception");
//        }
//        catch (YoungerAge e)
//        {
//            System.out.println(e);
//        }

    }

}

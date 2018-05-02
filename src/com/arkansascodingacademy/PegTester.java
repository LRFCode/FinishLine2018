package com.arkansascodingacademy;

public class PegTester
{
    public static void main(String[] args)
    {
        Peg bluePeg = new Peg();
        System.out.println(bluePeg.getPosition());
        bluePeg.moveForward();
        System.out.println(bluePeg.getPosition());


    }
}
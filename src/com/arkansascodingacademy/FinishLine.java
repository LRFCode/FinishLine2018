package com.arkansascodingacademy;

public class FinishLine
{
    private Peg bluePeg;
    private Peg redPeg;

    private Die dieOne;
    private Die dieTwo;

    public FinishLine()
    {
        bluePeg = new Peg();
        redPeg = new Peg();

        dieOne = new Die();
        dieTwo = new Die();
    }

    public void play()
    {
        System.out.println("Starting Game");

        while(true)
        {
            takeTurn(bluePeg);
            if (bluePeg.isWinner())
            {
                break;
            }
            takeTurn(redPeg);
            if (redPeg.isWinner())
            {
                break;
            }
        }

        printGameStatus();

        if (bluePeg.isWinner())
        {
            System.out.println("Blue wins!");
        }

        if (redPeg.isWinner())
        {
            System.out.println("Red wins!");
        }
    }

    private void takeTurn(Peg peg)
    {
        dieOne.roll();
        dieTwo.roll();

        if (peg.getNextPosition() == dieOne.getValue() ||
            peg.getNextPosition() == dieTwo.getValue() ||
            peg.getNextPosition() == dieOne.getValue() + dieTwo.getValue())
        {
            peg.moveForward();
        }
    }

    private void printGameStatus()
    {
        System.out.println("Blue peg at: " + bluePeg.getPosition() + "  Red peg at: " + redPeg.getPosition());
    }

    public void reset()
    {
        bluePeg.reset();
        redPeg.reset();
    }
}

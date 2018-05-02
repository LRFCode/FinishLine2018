package com.arkansascodingacademy;

public class Peg
{
    private int position;

    public Peg()
    {
        reset();
    }

    public int getPosition()
    {
        return position;
    }

    public int getNextPosition()
    {
        return position + 1;
    }

    public void moveForward()
    {
        position++;
    }

    public boolean isWinner()
    {
        return position >= 10;
    }

    public void reset()
    {
        position = 1;
    }
}

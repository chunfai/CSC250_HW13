package com.example.joeli.csc250_hw13;

import java.io.Serializable;

/**
 * Created by Joeli on 20/11/2017.
 */

public class MyObject implements Serializable
{
    private String number;

    public MyObject(String number)
    {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }
}

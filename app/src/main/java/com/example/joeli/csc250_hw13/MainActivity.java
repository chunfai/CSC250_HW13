package com.example.joeli.csc250_hw13;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    private Button page2Button;

    private MyObject obj;
    private int[] ar;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        this.ar = new int[200];
        for(int i = 0; i < this.ar.length; i++)
        {
            this.ar[i] = i+1;
        }

        this.printArray();



        this.obj = new MyObject("S");
        System.out.println(this.obj);

        this.page2Button = (Button)this.findViewById(R.id.page2Button);
        //Core.Number = "S";
    }
    private void printArray()
    {
        for(int i = 0; i < this.ar.length;i++)
        {
            System.out.println(this.ar[i]);
        }
    }


    @Override
    protected void onRestart()
    {
        super.onRestart();
        //System.out.println(this.obj.getNumber());
        this.printArray();
    }

    public void onNextPageButtonPressed(View v)
    {
        if(v == this.page2Button)
        {
            System.out.println(this.ar);
            Intent i = new Intent(this, Screen2.class);
            //Core.Number = "S";
            //i.putExtra("Number", "S");
            //i.putExtra("obj", this.obj);
            //Core.myObject = this.obj;
            i.putExtra("myAR", this.ar);
            this.startActivity(i);
        }

    }
}

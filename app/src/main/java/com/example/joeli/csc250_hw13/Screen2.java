package com.example.joeli.csc250_hw13;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class Screen2 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_screen2);
        //String theNum = this.getIntent().getStringExtra("Number");
        //System.out.println(Core.Number);
        //System.out.println(Core.Number);
        //MyObject obj = (MyObject)this.getIntent().getSerializableExtra("obj");
        //System.out.println(obj);
        //obj.setNumber("S");
        //System.out.println(obj.getNumber());
        int[] ar = this.getIntent().getIntArrayExtra("myAR");

        ViewGroup theVLL = (ViewGroup)this.findViewById(R.id.theVerticalLinearLayout);



        for(int i = 0; i < ar.length; i++)
        {
            TextView tv = new TextView(this);
            tv.setText("" + ar[i]);
            theVLL.addView(tv);
        }






    }
}

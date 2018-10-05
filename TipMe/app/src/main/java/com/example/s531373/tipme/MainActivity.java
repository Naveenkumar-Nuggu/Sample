package com.example.s531373.tipme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.bttippercent2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            cherukur();
            }
        });

        };
    public void cherukur(){
        Intent intent= new Intent(this,Sample.class);

        startActivity(intent);


    }
    public  void reset(View v){
        TextView t = findViewById(R.id.tv2);
        TextView t1 = findViewById(R.id.tv3);
        t.setText("Tip is $0.00");
        t1.setText("Total is $0.00");

    }






    public void compute(View v){

        try {

            EditText e1= findViewById(R.id.et1);

            double num = Double.parseDouble(e1.getText().toString());
            double tip;
            DecimalFormat format= new DecimalFormat("##.00");
            TextView t = findViewById(R.id.tv2);
            TextView t1 = findViewById(R.id.tv3);
            switch (v.getId()){
                case R.id.bt20:
                    tip= ((num*20)/100);
                    t.setText("Tip is $" +format.format(tip));
                    t1.setText("Total is $"+format.format(num+tip));
                    break;
                case R.id.bt15:
                    tip= ((num*15)/100);
                    t.setText("Tip is $" +format.format(tip));
                    t1.setText("Total is $"+format.format(num+tip));
                    break;
                case R.id.bt10:
                    tip= ((num*10)/100);
                    t.setText("Tip is $" +format.format(tip));
                    t1.setText("Total is $"+format.format(num+tip));
                    break;
                case R.id.bttippercent:
                    EditText e2= findViewById(R.id.et2);
                    double n1 = Double.parseDouble(e2.getText().toString());
                    tip= ((num*n1)/100);
                    t.setText("Tip is $" +format.format(tip));
                    t1.setText("Total is $"+format.format(num+tip));
                    break;
                case R.id.bttipamount:
                    EditText e3= findViewById(R.id.et3);
                    tip = Double.parseDouble(e3.getText().toString());
                    t.setText("Tip is $" +format.format(tip));
                    t1.setText("Total is $"+format.format(num+tip));
                    double percent = (tip/num)*100;
                    TextView t4 = findViewById(R.id.tv4);
                    t4.setText("Your tip amount is"+percent+"% of your billed amount");



            }

        }catch (Exception e){
            TextView t1 = findViewById(R.id.tv3);
            t1.setText("Number format exception ");
        }
    }



//    public void computeTwenty(View v){
//        try {
//            String txt;
//            EditText e1= findViewById(R.id.et1);
//            txt= e1.getText().toString();
//            double num = Double.parseDouble(txt);
////        System.out.println(num);
//            double tip;
//            tip= ((num*20)/100);
//            DecimalFormat format= new DecimalFormat("##.00");
////        System.out.println(format.format(tip));
//            TextView t = findViewById(R.id.tv2);
//            t.setText("Tip is $" +format.format(tip));
//            TextView t1 = findViewById(R.id.tv3);
////        System.out.println(num+tip);
//            t1.setText("Total is $"+format.format(num+tip));
//        }catch ( Exception e)
//        {
//            TextView t1 = findViewById(R.id.tv3);
//
//            t1.setText("Number format exception ");
//        }
//
//    }
//    public void computeFifteen(View v1){
//        try {
//            String txt;
//            EditText e1= findViewById(R.id.et1);
//            txt= e1.getText().toString();
//            double num = Double.parseDouble(txt);
////            System.out.println(num);
//            double tip;
//            tip= ((num*15)/100);
//            DecimalFormat format= new DecimalFormat("##.00");
////            System.out.println(format.format(tip));
//            TextView t = findViewById(R.id.tv2);
//            t.setText("Tip is $" +format.format(tip));
//            TextView t1 = findViewById(R.id.tv3);
////            System.out.println(num+tip);
//            t1.setText("Total is $"+format.format(num+tip));
//        }
//        catch (Exception e){
//            TextView t1 = findViewById(R.id.tv3);
//            t1.setText("Number format exception ");
//        }
//    }
//    public void computeTen(View v1){
//        try {
//            String txt;
//            EditText e1= findViewById(R.id.et1);
//            txt= e1.getText().toString();
//            double num = Double.parseDouble(txt);
////            System.out.println(num);
//            double tip;
//            tip= ((num*10)/100);
//            DecimalFormat format= new DecimalFormat("##.00");
////            System.out.println(format.format(tip));
//            TextView t = findViewById(R.id.tv2);
//            t.setText("Tip is $" +format.format(tip));
//            TextView t1 = findViewById(R.id.tv3);
////            System.out.println(num+tip);
//            t1.setText("Total is $"+format.format(num+tip));
//        }catch (Exception e){
//            TextView t1 = findViewById(R.id.tv3);
//            t1.setText("Number format exception ");
//        }
//
//    }

}

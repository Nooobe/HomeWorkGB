package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


 //private ArrayList<Double> listArr = new ArrayList<>();
    //private ArrayList<Character> listArr1 = new ArrayList<>();
    private ArrayList<String> MainArr = new ArrayList<>();


    private AllCounters allCounters;
  //  SharedPreferences sPref;

 private   String SAVED_TEXT = "saved_text";




    private TextView textView1;
    private TextView textView2;


    //   private Button b1, b2, b3 , b4, b5 , b6 ,b7 , b8 , b9, b0, b_equ, b_plu, b_min, b_spl, b_dell_all, b_dot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        allCounters = new AllCounters();


        initView();

        //loadText();
    }

    //метод для получения ID у элементов
    private void initView() {
        //окошко для ввода юзера
        textView1 = findViewById(R.id.textview1);
        //окошко для показа результата
        textView2 = findViewById(R.id.textview2);


        initButton1ClickListener();
        initButton2ClickListener();
        initButton3ClickListener();
        initButton4ClickListener();
        initButton5ClickListener();
        initButton6ClickListener();
        initButton7ClickListener();
        initButton8ClickListener();
        initButton9ClickListener();
        initButton0ClickListener();

        initButton_dot_ClickListener();

        initButton_Dell_All_ClickListener();
        initButton_equals_ClickListener();
        initButton_split_ClickListener();
        initButton_plus_ClickListener();
        initButton_mult_ClickListener();
        initButton_minus_ClickListener();
    }



    //метод вывода числа
    private void initButton1ClickListener() {
        Button b1 = findViewById(R.id.button1);
        b1.setOnClickListener(v -> {
          //  listArr.add((double)allCounters.getNum1());
            setTextOnTextView1(textView1, allCounters.getNum1());
        });
    }

    private void initButton2ClickListener() {
        Button b2 = findViewById(R.id.button2);

        b2.setOnClickListener(v -> {
          //  listArr.add((double) allCounters.getNum2());
            setTextOnTextView1(textView1, allCounters.getNum2());
        });
    }

    private void initButton3ClickListener() {
        Button b3 = findViewById(R.id.button3);
        b3.setOnClickListener(v -> {
          //  listArr.add((double) allCounters.getNum3());
            setTextOnTextView1(textView1, allCounters.getNum3());
        });
    }

    private void initButton4ClickListener() {
        Button b4 = findViewById(R.id.button4);
        b4.setOnClickListener(v -> {
         //   listArr.add((double) allCounters.getNum4());
            setTextOnTextView1(textView1, allCounters.getNum4());
        });
    }


    private void initButton5ClickListener() {
        Button b5 = findViewById(R.id.button5);
        b5.setOnClickListener(v -> {
           // listArr.add((double) allCounters.getNum5());

            setTextOnTextView1(textView1, allCounters.getNum5());
        });
    }

    private void initButton6ClickListener() {
        Button b6 = findViewById(R.id.button6);
        b6.setOnClickListener(v -> {
           // listArr.add((double) allCounters.getNum6());

            setTextOnTextView1(textView1, allCounters.getNum6());
        });
    }

    private void initButton7ClickListener() {
        Button b7 = findViewById(R.id.button7);
        b7.setOnClickListener(v -> {
           // listArr.add((double ) allCounters.getNum7());

            setTextOnTextView1(textView1, allCounters.getNum7());
        });
    }

    private void initButton8ClickListener() {
        Button b8 = findViewById(R.id.button8);
        b8.setOnClickListener(v -> {
           // listArr.add((double) allCounters.getNum8());

            setTextOnTextView1(textView1, allCounters.getNum8());
        });
    }

    private void initButton9ClickListener() {
        Button b9 = findViewById(R.id.button9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //listArr.add((double) allCounters.getNum9());

                setTextOnTextView1(textView1, allCounters.getNum9());
            }
        });
    }

    private void initButton0ClickListener() {
        Button b0 = findViewById(R.id.button0);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // listArr.add((double) allCounters.getNum0());

                setTextOnTextView1(textView1, allCounters.getNum0());
            }
        });
    }
    private void initButton_dot_ClickListener(){
        Button b_poi = findViewById(R.id.button_point);
        b_poi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //listArr.add((double) allCounters.getDot());
               textView1.setText(textView1.getText().toString() + ".");

            }
        });
    }

    private void initButton_Dell_All_ClickListener() {
        Button b_dell = findViewById(R.id.button_dell_all);
        b_dell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  listArr.removeAll(listArr);
                textView1.setText(" ");
                textView2.setText(" ");
            }
        });
    }

    private void initButton_plus_ClickListener(){
        Button b_plu = findViewById(R.id.button_plus);
        b_plu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // listArr1.add(allCounters.getPlus());
                textView1.setText(textView1.getText().toString() + allCounters.getPlus());

            }
        });
    }

    private void initButton_minus_ClickListener(){
        Button b_min = findViewById(R.id.button_minus);
        b_min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText().toString() + allCounters.getMin());

            }
        });
    }

    private void initButton_split_ClickListener(){
        Button b_spl = findViewById(R.id.button_split);
        b_spl.setOnClickListener(v -> textView1.setText(textView1.getText().toString() + allCounters.getSplit()));
    }

    private void initButton_mult_ClickListener(){
        Button b_mult = findViewById(R.id.button_multiply);
        b_mult.setOnClickListener(v -> textView1.setText(textView1.getText().toString() + allCounters.getMultip()));
    }


    private void initButton_equals_ClickListener(){
        Button b_eq = findViewById(R.id.button_equals);
        b_eq.setOnClickListener(v -> {
          SAVED_TEXT = textView1.getText().toString();

          MainArr.add(SAVED_TEXT);
          textView2.setText(SAVED_TEXT);
          textView1.setText(" ");


    //    saveText();




        //textView2.setText(text);
        });
    }







      private void setTextOnTextView1(TextView textView1, int counter){

        textView1.setText(textView1.getText().toString() + counter);


          //   textView1.setText(textView1.getText() + counter);


      }

// метод для сохранения данных, до след запуска( сохраняет в настройки проги)

//    private void saveText() {
//        sPref = getSharedPreferences("MyPref", MODE_PRIVATE);
//        SharedPreferences.Editor ed = sPref.edit();
//        ed.putString(SAVED_TEXT, textView1.getText().toString());
//        ed.commit();
//        Toast.makeText(MainActivity.this, "Text saved", Toast.LENGTH_SHORT).show();
//
//
//    }
//
//
//    private void loadText() {
//        sPref = getSharedPreferences("MyPref", MODE_PRIVATE);
//        String savedText = sPref.getString(SAVED_TEXT, "");
//        textView2.setText(savedText);
//        Toast.makeText(MainActivity.this, "Text loaded", Toast.LENGTH_SHORT).show();
//    }






}




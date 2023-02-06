package com.example.calculatorandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


        Button button0, button1, button2, button3, button4, button5, button6,
                button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
                buttonMul, button10, buttonC, buttonEqual;
        EditText edttxtdata;
        float mValueOne, mValueTwo;
        boolean btnAddition, mSubtract, btnMultiplication, btnDivision;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            button0 = (Button) findViewById(R.id.btn0);
            button1 = (Button) findViewById(R.id.btn1);
            button2 = (Button) findViewById(R.id.btn2);
            button3 = (Button) findViewById(R.id.btn3);
            button4 = (Button) findViewById(R.id.btn4);
            button5 = (Button) findViewById(R.id.btn5);
            button6 = (Button) findViewById(R.id.btn6);
            button7 = (Button) findViewById(R.id.btn7);
            button8 = (Button) findViewById(R.id.btn8);
            button9 = (Button) findViewById(R.id.btn9);
            button10 = (Button) findViewById(R.id.btn10);
            buttonAdd = (Button) findViewById(R.id.btnadd);
            buttonSub = (Button) findViewById(R.id.btnsub);
            buttonMul = (Button) findViewById(R.id.btnmul);
            buttonDivision = (Button) findViewById(R.id.btndiv);
            buttonC = (Button) findViewById(R.id.buttonC);
            buttonEqual = (Button) findViewById(R.id.btneql);
            edttxtdata = (EditText) findViewById(R.id.edttxt);

            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    edttxtdata.setText(edttxtdata.getText() + "1");
                }
            });
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    edttxtdata.setText(edttxtdata.getText() + "2");
                }
            });
            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    edttxtdata.setText(edttxtdata.getText() + "3");
                }
            });
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    edttxtdata.setText(edttxtdata.getText() + "4");
                }
            });
            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    edttxtdata.setText(edttxtdata.getText() + "5");
                }
            });
            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    edttxtdata.setText(edttxtdata.getText() + "6");
                }
            });
            button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   edttxtdata.setText(edttxtdata.getText() + "7");
                }
            });
            button8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   edttxtdata.setText(edttxtdata.getText() + "8");
                }
            });
            button9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    edttxtdata.setText(edttxtdata.getText() + "9");
                }
            });
            button0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    edttxtdata.setText(edttxtdata.getText() + "0");
                }
            });
            buttonAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (edttxtdata == null) {
                        edttxtdata.setText("");
                    } else {
                        mValueOne = Float.parseFloat(edttxtdata.getText() + "");
                        btnAddition = true;
                        edttxtdata.setText(null);
                    }
                }
            });
            buttonSub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mValueOne = Float.parseFloat(edttxtdata.getText() + "");
                    mSubtract = true;
                    edttxtdata.setText(null);
                }
            });
            buttonMul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mValueOne = Float.parseFloat(edttxtdata.getText() + "");
                   btnMultiplication = true;
                    edttxtdata.setText(null);
                }
            });
            buttonDivision.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mValueOne = Float.parseFloat(edttxtdata.getText() + "");
                    btnDivision = true;
                    edttxtdata.setText(null);
                }
            });
            buttonEqual.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mValueTwo = Float.parseFloat(edttxtdata.getText() + "");
                    if (btnAddition == true) {
                        edttxtdata.setText(mValueOne + mValueTwo + "");
                        btnAddition = false;
                    }
                    if (mSubtract == true) {
                        edttxtdata.setText(mValueOne - mValueTwo + "");
                        mSubtract = false;
                    }
                    if (btnMultiplication == true) {
                        edttxtdata.setText(mValueOne * mValueTwo + "");
                        btnMultiplication = false;
                    }
                    if (btnDivision == true) {
                       edttxtdata.setText(mValueOne / mValueTwo + "");
                        btnDivision = false;
                    }
                }
            });
            buttonC.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   edttxtdata.setText("");
                }
            });
            button10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    edttxtdata.setText(edttxtdata.getText() + ".");
                }
            });




    }
}
package com.example.addandsubtract;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView displayTextView;
    Button one_btn,two_btn,three_btn,four_btn,five_btn,six_btn,seven_btn,eight_btn,nine_btn,equal_btn,dot_btn,zero_btn,add_btn,sub_btn,divide_btn,mul_btn;
    Button clear_btn;
    double result=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayTextView=(TextView)findViewById(R.id.display_result_textview);
        one_btn=(Button)findViewById(R.id.button1);
        two_btn=(Button)findViewById(R.id.button2);
        three_btn=(Button)findViewById(R.id.button3);
        four_btn=(Button)findViewById(R.id.button4);
        five_btn=(Button)findViewById(R.id.button5);
        six_btn=(Button)findViewById(R.id.button6);
        seven_btn=(Button)findViewById(R.id.button7);
        eight_btn=(Button)findViewById(R.id.button8);
        nine_btn=(Button)findViewById(R.id.button9);
        zero_btn=(Button)findViewById(R.id.button0);
        add_btn=(Button)findViewById(R.id.add_btn);
        divide_btn=(Button)findViewById(R.id.divide_btn);
        sub_btn=(Button)findViewById(R.id.sub_btn);
        mul_btn=(Button)findViewById(R.id.multiply_btn);
        clear_btn=(Button)findViewById(R.id.clear_btn);
        equal_btn=(Button)findViewById(R.id.equal_btn);
        dot_btn=(Button)findViewById(R.id.dot_btn);

        equal_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String displayText=displayTextView.getText().toString();

                String first="",second="";
                /*for(int i=0;i<displayText.length();i++){
                    if(displayText.charAt(i)=='+' || displayText.charAt(i)=='-' || displayText.charAt(i)=='*' || displayText.charAt(i)=='/'){
                        double val1=Double.parseDouble(first);
                        double val2=Double.parseDouble(second);
                        if(displayText.charAt(i)=='+'){
                            result+=(val1+val2);
                        }else if(displayText.charAt(i)=='-'){
                            result+=(val1-val2);
                        }else if(displayText.charAt(i)=='*'){
                            result+=(val1*val2);
                        }else if(displayText.charAt(i)=='/'){
                            result+=(val1/val2);
                        }
                        first=Double.toString(result);
                        second="";
                    }else{
                        second+=displayText.charAt(i);
                    }
                }
                displayTextView.setText(first);*/
                int i=0;
                while(displayText.charAt(i)!='+' && displayText.charAt(i)!='-' && displayText.charAt(i)!='*' && displayText.charAt(i)!='/'){
                    first+=displayText.charAt(i);
                    i++;
                }
                char c=displayText.charAt(i);
                i++;
                while(i<displayText.length()){
                    second+=displayText.charAt(i);
                    i++;
                }
                double val1=Double.parseDouble(first);
                double val2=Double.parseDouble(second);
                if(c=='+'){
                    result+=(val1+val2);
                }else if(c=='-'){
                    result+=(val1-val2);
                }else if(c=='*'){
                    result+=(val1*val2);
                }else if(c=='/'){
                    result+=(val1/val2);
                }
                displayTextView.setText(Double.toString(result));
            }
        });
        clear_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayTextView.setText("");
                result=0;
            }
        });
    }

    public void writeInDisplay(View view){
        switch (view.getId()){
            case R.id.button0:
                if(displayTextView.getText().equals("0")){
                    displayTextView.setText("0");
                }else
                displayTextView.setText(displayTextView.getText().toString()+"0");
                break;
            case R.id.button1:
                if(displayTextView.getText().equals("0")){
                    displayTextView.setText("1");
                }else
                displayTextView.setText(displayTextView.getText().toString()+"1");
                break;
            case R.id.button2:
                if(displayTextView.getText().equals("0")){
                    displayTextView.setText("2");
                }else
                displayTextView.setText(displayTextView.getText().toString()+"2");
                break;
            case R.id.button3:
                if(displayTextView.getText().equals("0")){
                    displayTextView.setText("3");
                }else
                displayTextView.setText(displayTextView.getText().toString()+"3");
                break;
            case R.id.button4:
                if(displayTextView.getText().equals("0")){
                    displayTextView.setText("4");
                }else
                displayTextView.setText(displayTextView.getText().toString()+"4");
                break;
            case R.id.button5:
                if(displayTextView.getText().equals("0")){
                    displayTextView.setText("5");
                }else
                displayTextView.setText(displayTextView.getText().toString()+"5");
                break;
            case R.id.button6:
                if(displayTextView.getText().equals("0")){
                    displayTextView.setText("6");
                }else
                displayTextView.setText(displayTextView.getText().toString()+"6");
                break;
            case R.id.button7:
                if(displayTextView.getText().equals("0")){
                    displayTextView.setText("7");
                }else
                displayTextView.setText(displayTextView.getText().toString()+"7");
                break;
            case R.id.button8:
                if(displayTextView.getText().equals("0")){
                    displayTextView.setText("8");
                }else
                displayTextView.setText(displayTextView.getText().toString()+"8");
                break;
            case R.id.button9:
                if(displayTextView.getText().equals("0")){
                    displayTextView.setText("9");
                }else
                displayTextView.setText(displayTextView.getText().toString()+"9");
                break;
            case R.id.dot_btn:
                displayTextView.setText(displayTextView.getText().toString()+".");
                break;
            case R.id.add_btn:
                displayTextView.setText(displayTextView.getText().toString()+"+");
                break;
            case R.id.sub_btn:
                displayTextView.setText(displayTextView.getText().toString()+"-");
                break;
            case R.id.multiply_btn:
                displayTextView.setText(displayTextView.getText().toString()+"*");
                break;
            case R.id.divide_btn:
                displayTextView.setText(displayTextView.getText().toString()+"/");
                break;
        }
    }
}

package com.ubclaunchpad.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import android.widget.EditText;
import android.content.Intent;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener{
    private final static String TAG = CalculatorActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }

    /**
     * This implementation of the click listener is for the view found in res/layout/activity_calculator
     * The functions in general should grab the appropriate inputs, and if they are valid, computes the answer.
     * The answer should be displayed in a second activity labelled "AnswerActivity"
     * @param v
     */
    @Override
    public void onClick(View v) {
        
        Intent intent = new Intent(this, AnswerActivity.class);
        EditText editText1 = (EditText) findViewById(R.id.firstInput);
        int firstInput = Integer.parseInt(editText1.getText().toString()); 
        EditText editText2 = (EditText) findViewById(R.id.secondInput);
        int secondInput = Integer.parseInt(editText2.getText().toString()); 
        intent.putExtra(TAG, firstInput);
        intent.putExtra(TAG, secondInput);
        startActivity(intent);
        
        switch (v.getId())
        {   
            case R.id.operation_add:
            {
                R.id.firstInput + R.id.secondInput 
                break;
            }
            case R.id.operation_sub:
            {
                //TODO subtract function
                break;
            }
            case R.id.operation_multi:
            {
                //TODO multiply function
                break;
            }
            case R.id.operation_div:
            {
                //TODO divide function
                break;
            }
            case R.id.operation_extra1: 
                {
                    
                    break;
                }    
            default:
            {
                Toast.makeText(this, "Click not implmented yet", Toast.LENGTH_LONG).show();
                Log.e(TAG, "View id: " + v.getId() + " click not implemented yet");
                break;
            }
        }
    }
}

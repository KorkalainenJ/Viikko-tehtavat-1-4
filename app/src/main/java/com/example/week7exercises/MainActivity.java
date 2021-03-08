package com.example.week7exercises;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    EditText textInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.textView);
        textInput = (EditText) findViewById(R.id.textInputEdit);
        textInput.setOnEditorActionListener(editorListener);
    }

    public void HelloButtonMessage(View v) {    //these actions are run with hello world button
        System.out.println("Hello World!");     //completes 7.1
        text.setText("Hello World!");           //completes 7.2

    }

    public void HandleText(View v) {    //these actions are run with enter text button
        String input = textInput.getText().toString(); //takes input from text input field
        text.setText(input);    //changes string in the text field, completing 7.3
    }

    public EditText.OnEditorActionListener editorListener = (v, actionId, event) -> {
        if (actionId == EditorInfo.IME_ACTION_SEND) {
            HandleText(v); //completes 7.4 when the send("enter") action is pressed on keyboard
        }
        return false;
    };
}
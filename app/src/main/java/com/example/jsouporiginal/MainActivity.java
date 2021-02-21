package com.example.jsouporiginal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private AsyncWork asyncWork;
    private TextView textView;
    private static String webValues;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textview);
        Button buttonStart = findViewById(R.id.button);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                asyncWork = new AsyncWork();
                asyncWork.execute();
                textView.setText(webValues);
            }
        });
    }

    public static void setValues(String s) {
        webValues = s;
    }
}
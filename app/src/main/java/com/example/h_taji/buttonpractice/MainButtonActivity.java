package com.example.h_taji.buttonpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainButtonActivity extends AppCompatActivity {

    private TextView textView;
    private boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button);

        // ボタンを設定
        //Button button = (Button)findViewById(R.id.button);
        Button button = findViewById(R.id.button);

        // TextView の設定
        //textView = (TextView)findViewById(R.id.text_view);
        textView = findViewById(R.id.text_view);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // flagがtrueの時
                if (flag) {
                    //textView.setText(R.string.hello);
                    textView.setText("Hello");

                    flag = false;
                }
                // flagがfalseの時
                else {
                    //textView.setText(R.string.world);
                    textView.setText("New World");
                    flag = true;
                }
            }
        });
    }

}

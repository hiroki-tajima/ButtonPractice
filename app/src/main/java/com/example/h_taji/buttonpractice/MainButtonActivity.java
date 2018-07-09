package com.example.h_taji.buttonpractice;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainButtonActivity extends AppCompatActivity {

    private TextView textView;
    private boolean flag = false;
    private Button button;
    private LinearLayout.LayoutParams buttonLayoutParams;
    private float scale;
    private int buttonWidth;
    //    private int buttonHeight;
    private int margins;

    public MainButtonActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main_button);

        //リニアレイアウトの設定
        LinearLayout layout = new LinearLayout(MainButtonActivity.this);
        //orientationは垂直方向
        layout.setOrientation(LinearLayout.VERTICAL);
        //Layoutの縦幅・横幅設定
        layout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));
        //リニアレイアウトの中央寄せ
        layout.setGravity(Gravity.CENTER);
        setContentView(layout);


        // TextView の設定
//        textView = findViewById(R.id.text_view);
        textView = new TextView(MainButtonActivity.this);
        textView.setText(R.string.view_text);
        // テキストサイズ 30sp
        textView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
        // テキストカラー
        textView.setTextColor(Color.rgb(0x0, 0x0, 0x0));

        LinearLayout.LayoutParams textLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        textView.setLayoutParams(textLayoutParams);
        layout.addView(textView);



        // ボタンを設定
//        Button button = findViewById(R.id.button);
        Button button = new Button(MainButtonActivity.this);
        button.setText(R.string.btn_btn);
        // dp単位を取得
        float scale = getResources().getDisplayMetrics().density;
        int buttonWidth = (int)(150 * scale);
        // 横幅 150dp, 縦 100dp に設定
        LinearLayout.LayoutParams buttonLayoutParams = new LinearLayout.LayoutParams(
                buttonWidth, LinearLayout.LayoutParams.WRAP_CONTENT);
        // マージン 20dp に設定
        int margins = (int)(20 * scale);
        buttonLayoutParams.setMargins(margins, margins, margins, margins);

        button.setLayoutParams(buttonLayoutParams);
        layout.addView(button);

//        Button button = findViewById(R.id.back_button);


        //リスナーをボタンに設定
        button.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View view) {
                // flagがtrueの時
                if (flag) {
                    textView.setText(R.string.hello);

                    mode1();
                    flag = false;
                }
                // flagがfalseの時
                else {
                    textView.setText(R.string.new_world);

                    mode2();
                    flag = true;
                }
            }
        });
    }


    private void mode1(){
        buttonWidth = (int)(150 * scale);
        // 横幅 150dp に設定
        buttonLayoutParams = new LinearLayout.LayoutParams(
                buttonWidth, LinearLayout.LayoutParams.WRAP_CONTENT);
        buttonLayoutParams.setMargins(margins, margins, margins, margins);

        button.setLayoutParams(buttonLayoutParams);
    }

    private void mode2(){

        buttonWidth = (int)(250 * scale);
        int buttonHeight = (int)(100 * scale);
        // 横幅 250dp に設定
        buttonLayoutParams = new LinearLayout.LayoutParams(
                buttonWidth, buttonHeight);
        buttonLayoutParams.setMargins((int) (5 * scale), (int)(50 * scale),
                (int)(50 * scale), (int)(20 * scale));

        button.setLayoutParams(buttonLayoutParams);
    }
}

package com.example.administrator.mygit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_feature_1;
    Button btn_feature_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * feature-1
     * display HelloWorld
     * @param view
     */
    public void feature1(View view) {
        if (btn_feature_1.getText().toString().equals("功能1")) {
            btn_feature_1.setText(R.string.feature_1_dis);
        } else {
            btn_feature_1.setText(R.string.feature_1);
        }
    }
    /**
     * feature-2
     * display HelloAndroid
     * @param view
     */
    public void feature2(View view) {
        if (btn_feature_2.getText().toString().equals("功能2")) {
            btn_feature_2.setText(R.string.feature_2_dis);
        } else {
            btn_feature_2.setText(R.string.feature_2);
        }
    }
}

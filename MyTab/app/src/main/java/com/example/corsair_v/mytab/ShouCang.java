package com.example.corsair_v.mytab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ShouCang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shou_cang);
    }
//取消返回
    public void tianjia(View v)
    {
        //Intent intent = new Intent(ShezhiActivity.this, MainActivity.class);
        //startActivity(intent);
        ShouCang.this.finish();
    }
}
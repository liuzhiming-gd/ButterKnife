package com.ydimall.butterknife;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Nullable
    @BindView(R.id.tv_test)
    TextView tvTest;
    @Nullable
    @BindView(R.id.btn_test)
    Button btnTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        tvTest.setText("YDIMALL2018");
    }

//    @OnClick(R.id.tv_test)
//    public void onViewClicked() {
//        Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_SHORT);
//    }

    @OnClick(R.id.btn_test)
    public void onViewClicked() {
        Toast.makeText(this, "YDIMALL2018", Toast.LENGTH_SHORT).show();
        //TODO....

    }
}

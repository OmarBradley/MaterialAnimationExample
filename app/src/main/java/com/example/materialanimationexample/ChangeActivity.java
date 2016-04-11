package com.example.materialanimationexample;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ChangeActivity extends Activity {

    @Bind(R.id.imageView) ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change);
        ButterKnife.bind(this);
    }
}

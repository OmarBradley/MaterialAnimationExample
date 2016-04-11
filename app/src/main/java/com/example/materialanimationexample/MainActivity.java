package com.example.materialanimationexample;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewAnimationUtils;
import android.animation.Animator;

import android.widget.Button;
import android.widget.ImageView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends Activity {

    @Bind(R.id.circularRevealAniButton) Button circularRevealAniButton;
    @Bind(R.id.activityChangeButton) Button activityChangeButton;
    @Bind(R.id.imageView) ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        circularRevealAniButton.setOnClickListener(view -> {
            setRevealEffect();
        });
        activityChangeButton.setOnClickListener(view -> {
            Intent intent = new Intent(this, ChangeActivity.class);
            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this,imageView,"ball");
            startActivity(intent, options.toBundle());
        });

    }

    private void setRevealEffect() {
        int centerX = circularRevealAniButton.getWidth() / 2;
        int centerY = circularRevealAniButton.getHeight() / 2;
        int endRadius = Math.max(centerX, centerY);
        Animator circularRevealAnimator = ViewAnimationUtils.createCircularReveal(circularRevealAniButton, centerX, centerY, 0, endRadius);
        circularRevealAnimator.start();
    }

}

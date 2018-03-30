package com.example.android.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean charmanderIsShowing = true;

    public void  fade(View view) {
        Log.i("Info", "Imageview tapped");

        ImageView charmanderImageView = (ImageView) findViewById(R.id.charmanderImageView);

        ImageView charizardImageView = (ImageView) findViewById(R.id.charizardImageView);

        charmanderImageView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(1000);

        /* Types of animations
        *
        * fade animation

        if (charmanderIsShowing) {

            charmanderIsShowing= false;

            charmanderImageView.animate().alpha(0).setDuration(2000);
            charizardImageView.animate().alpha(1).setDuration(2000);

        } else {

            charmanderIsShowing = true;

            charmanderImageView.animate().alpha(0).setDuration(2000);
            charizardImageView.animate().alpha(1).setDuration(2000);

        }


        * moves image 100dp down animation
        * translationXBy(-1000) moves image to the right
        * imageView.animate().rotation(1800).alpha(0).setDuration(2000) -rotates & fades at the same time
        * scale() - expects a float | to convert to float: scale(0.5f)
        *
        charmanderImageView.animate().translationYBy(1000).setDuration(2000);
         */
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView charmanderImageView = (ImageView) findViewById(R.id.charmanderImageView);

        charmanderImageView.setX(-1000);
/*spins in from the left*/
        charmanderImageView.animate().translationXBy(1000).rotation(3600).setDuration(2000);
    }
}

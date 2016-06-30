package com.example.kchebolu.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**     Method:popularMovies
     Description: This method will display toast message when stock hawk button is clicked */

    public void popularMovies(View view) {
        Toast toast = Toast.makeText(this,"This button will launch my popular movies app",Toast.LENGTH_SHORT);
        toast.show();
    }

    /**     Method:stockHawk
     Description: This method will display toast message when stock hawk button is clicked */

    public void stockHawk(View view) {
        Toast toast = Toast.makeText(this,"This button will launch my stock hawk app",Toast.LENGTH_SHORT);
        toast.show();
    }

    /**     Method: buildBigger
            Description: This method will display toast message when Build it bigger button is clicked */

    public void buildBigger(View view) {
        Toast toast = Toast.makeText(this,"This button will launch my build it bigger app",Toast.LENGTH_SHORT);
        toast.show();
    }

    /**     Method: material
     Description: This method will display toast message when Make your app material button is clicked */

    public void material(View view) {
        Toast toast = Toast.makeText(this,"This button will launch my material app",Toast.LENGTH_SHORT);
        toast.show();
    }
    /**     Method: goUbiquitous
            Description: This method will display toast message when Go Ubiquitous button is clicked */

    public void goUbiquitous(View view) {
        Toast toast = Toast.makeText(this,"This button will launch my go ubiquitous app",Toast.LENGTH_SHORT);
        toast.show();
    }

    /**     Method: capStone
            Description: This method will display toast message when CAPSTONE button is clicked */

    public void capStone(View view) {
        Toast toast = Toast.makeText(this,"This button will launch my capstone app",Toast.LENGTH_SHORT);
        toast.show();
    }

}

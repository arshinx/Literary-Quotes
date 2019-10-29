package com.arshin.literaryquotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // Properties
    public static final String TAG = MainActivity.class.getSimpleName();
    private TextView quoteTextView;
    private Button showQuoteButton;
    private ConstraintLayout constraintLayout;
    String quote = "";
    int color =  0;
    private QuoteBook quoteBook = new QuoteBook();
    private ColorBook colorBook  = new ColorBook();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quoteTextView = (TextView) findViewById(R.id.quoteTextView);
        showQuoteButton = (Button) findViewById(R.id.showQuoteButton);
        constraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);


        // Toast
        Toast.makeText(this, "Welcome!", Toast.LENGTH_SHORT).show();

        // Log
        Log.d(TAG, "Welcome to the App! Looks like there are no issues so far.");
    }
}


//class  View  {}
//class Button extends View {}
//class TextView  extends View {}
//
//class Activity {
//    <T extends View> T findViewById(int id) {
//       View view = new View();
//        if (id  == 1) {
//            view = new Button();
//        }
//        if (id  == 2) {
//            view = new TextView();
//        }
//        return view;
//    }
//}

//class MainActivity extends Activity {
//    MainActivity() {
//        Button button = findViewById(1);
//        TextView textView = findViewById(2);
//    }
//}
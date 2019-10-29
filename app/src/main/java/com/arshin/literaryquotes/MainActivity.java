package com.arshin.literaryquotes;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
package com.example.delano.hellodelano;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Delano ", "button clicked");

                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.red));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.mainViewOnScreen).setBackgroundColor(getResources().getColor(R.color.lawnGreen));
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Grab text that user inputed
                String tempText = ((EditText) findViewById(R.id.editTextView)).getText().toString();

                if(TextUtils.isEmpty(tempText)){
                    ((TextView) findViewById(R.id.textView)).setText("Hello From Delano");
                }else{
                    ((TextView) findViewById(R.id.textView)).setText(tempText);
                }
            }
        });

        findViewById(R.id.mainViewOnScreen).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Reset the text color back to Black
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.black));
                //Reset the background color to colorAccent
                findViewById(R.id.mainViewOnScreen).setBackgroundColor(getResources().getColor(R.color.colorAccent));
                //Reset the text back to "Hello from Delano"
                ((TextView) findViewById(R.id.textView)).setText("Hello From Delano");
            }
        });

    }

}

    package com.sarmale.arduinobtexampleledcontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

    public class NextActivity2 extends AppCompatActivity {

        private static final String TAG = "FrugalLogs";
        Button servo, buzz;
        private String valueRead;
        ConnectedThread connectedThread;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_next2);
            servo = findViewById(R.id.servo);
            buzz = findViewById(R.id.buzz);


            servo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String servo="servo";
                    connectedThread.write(servo);
                }
            });
            buzz.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String buzz="buzz";
                    connectedThread.write(buzz);
                }
            });

            connectedThread = MyApplication.getApplication().getCurrentConnectedThread();
        }
    }
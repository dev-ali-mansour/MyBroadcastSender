package dev.alimansour.mybroadcastsender;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent();
        intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        intent.setAction("dev.alimansour.mybroadcastsender");
        intent.putExtra("FullName","Ahmed Essa");
        intent.putExtra("MyData", 1000);
        sendBroadcast(intent);
    }

}
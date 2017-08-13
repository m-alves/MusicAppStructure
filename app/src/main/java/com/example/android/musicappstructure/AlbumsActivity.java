package com.example.android.musicappstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        Button btn = (Button) findViewById(R.id.play_button_album);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(AlbumsActivity.this, MainActivity.class);
                AlbumsActivity.this.startActivity(myIntent);
            }
        });

        Button btn2 = (Button) findViewById(R.id.buy_button_album);

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent2 = new Intent(AlbumsActivity.this, PaymentActivity.class);
                AlbumsActivity.this.startActivity(myIntent2);
            }
        });
    }
}

package com.example.android.musicappstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ArtistLibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_library);

        Button btn = (Button) findViewById(R.id.play_button_artist_lib);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(ArtistLibraryActivity.this, MainActivity.class);
                ArtistLibraryActivity.this.startActivity(myIntent);
            }
        });

        Button btn2 = (Button) findViewById(R.id.albums_lib_launcher);

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent2 = new Intent(ArtistLibraryActivity.this, AlbumsActivity.class);
                ArtistLibraryActivity.this.startActivity(myIntent2);
            }
        });


    }
}

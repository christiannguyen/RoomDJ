package com.example.chris.djapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import com.google.gson.annotations.SerializedName;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

 //   @Override
    public void hostButton(View view){
        Intent intent = new Intent(getApplicationContext(),djhost.class);
        startActivity(intent);
        setContentView(R.layout.activity_djhost);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

//   // @Override
//    public class Config {
//
//        public static final String CLIENT_ID = "ae3650846fe30eccb67af5f0bf536913";
//        public static final String API_URL = "https://api.soundcloud.com";
//
//    }
//    // @Override
//    public class Track {
//
//        @SerializedNamed("title")
//        private String mTitle;
//
//        @SerializedNamed("id")
//        private int mID;
//
//        @SerializedNamed("stream_url")
//        private String mStreamUrl;
//
//        @SerializedNamed("artwork_url")
//        private String mArtworkUrl;
//
//        public Track() {
//        }
//
//        public String getTitle() {
//            return mTitle;
//        }
//    }
}

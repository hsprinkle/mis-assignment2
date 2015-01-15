package com.mis572.hsprinkle.assignment2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Heather on 12/30/2014.
 */
public class Tracker extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tracker);

        Button trackerWeb = (Button)findViewById(R.id.trackerBtn);

        trackerWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.cnet.com/news/jawbone-up-3-and-up-move-hands-on-a-heart-rate-tracker-that-feels-like-jewelry/")));
            }
        });
    }
}
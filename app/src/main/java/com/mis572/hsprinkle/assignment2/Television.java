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
public class Television extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.television);

        Button tvWeb = (Button)findViewById(R.id.televisionBtn);

        tvWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.amazon.com/Panasonic-TX-42AS500B-Widescreen-Built-In-Freeview/dp/B00IOQ5X4U")));
            }
        });
    }
}

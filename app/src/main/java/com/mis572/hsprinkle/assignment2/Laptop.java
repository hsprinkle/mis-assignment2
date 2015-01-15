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
public class Laptop extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.laptop);

        Button laptopWeb = (Button)findViewById(R.id.laptopBtn);

        laptopWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.cnet.com/products/msi-gt72-dominator-pro-208-17-3-core-i7-4710hq-windows-8-1-32-gb-ram-512-gb-ssd-plus-1-tb-hdd/")));
            }
        });
    }
}

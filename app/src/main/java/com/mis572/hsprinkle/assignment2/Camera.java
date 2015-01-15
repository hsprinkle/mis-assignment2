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
public class Camera extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.camera);

        Button cameraWeb = (Button)findViewById(R.id.cameraBtn);

        cameraWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.cnet.com/products/nikon-1-j1-with-10-30mm-lens/")));
            }
        });
    }
}

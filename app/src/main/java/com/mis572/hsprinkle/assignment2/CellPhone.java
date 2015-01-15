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
public class CellPhone extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cellphone);

        Button cellphoneWeb = (Button)findViewById(R.id.cellphoneBtn);

        cellphoneWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.cnet.com/products/motorola-moto-x/")));
            }
        });
    }
}

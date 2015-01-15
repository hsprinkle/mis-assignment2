package com.mis572.hsprinkle.assignment2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;


public class FloorTilingApp extends ActionBarActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floor_tiling_app);

        final EditText length = (EditText)findViewById(R.id.lengthInput);
        final EditText width = (EditText)findViewById(R.id.widthInput);

        final RadioButton r12x12 = (RadioButton) findViewById(R.id.rad12x12);
        final RadioButton r18x18 = (RadioButton) findViewById(R.id.rad18x18);

        final TextView result = (TextView) findViewById(R.id.result);

        Button calculate = (Button) findViewById(R.id.btnCalc);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (length.getText().toString().isEmpty() || width.getText().toString().isEmpty()) {

                    Toast.makeText(FloorTilingApp.this, "Neither length nor width can be blank", Toast.LENGTH_LONG).show();

                } else {

                    double lengthEntered = Double.parseDouble(length.getText().toString());
                    double widthEntered = Double.parseDouble(width.getText().toString());

                    double sqFt = lengthEntered * widthEntered;

                    double numofTiles;

                    DecimalFormat tenth = new DecimalFormat("#.#");

                    if (r12x12.isChecked()) {
                        if (lengthEntered > 0 && widthEntered > 0) {
                            numofTiles = sqFt / 1;
                            result.setText(tenth.format(numofTiles) + " tiles needed");
                        } else {
                            result.setText("");
                            Toast.makeText(FloorTilingApp.this, "Both length and width must be greater than 0", Toast.LENGTH_LONG).show();
                        }
                    }
                    if (r18x18.isChecked()) {
                        if (lengthEntered > 0 && widthEntered > 0) {
                            numofTiles = sqFt / 3;
                            result.setText(tenth.format(numofTiles) + " tiles needed");
                        } else {
                            result.setText("");
                            Toast.makeText(FloorTilingApp.this, "Both length and width must be greater than 0", Toast.LENGTH_LONG).show();
                        }
                    }
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_floor_tiling_app, menu);
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
}

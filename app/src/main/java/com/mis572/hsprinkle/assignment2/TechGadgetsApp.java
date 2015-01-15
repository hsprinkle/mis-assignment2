package com.mis572.hsprinkle.assignment2;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class TechGadgetsApp extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] gadgets = {"Phone", "TV", "Laptop", "Camera", "Fitness Tracker"};
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, gadgets));
    }

    protected void onListItemClick(ListView l, View v, int position, long id){
        switch (position){
            case 0:
                startActivity(new Intent(TechGadgetsApp.this, CellPhone.class));
                break;
            case 1:
                startActivity(new Intent(TechGadgetsApp.this, Television.class));
                break;
            case 2:
                startActivity(new Intent(TechGadgetsApp.this, Laptop.class));
                break;
            case 3:
                startActivity(new Intent(TechGadgetsApp.this, Camera.class));
                break;
            case 4:
                startActivity(new Intent(TechGadgetsApp.this, Tracker.class));
                break;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tech_gadgets_app, menu);
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

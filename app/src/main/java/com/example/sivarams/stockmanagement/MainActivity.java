package com.example.sivarams.stockmanagement;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
//import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar); // get the reference of Toolbar
        toolbar.setTitle("   Kale Stock"); // set Title for Toolbar
        toolbar.setLogo(R.drawable.ic_action_home); // set logo for Toolbar
        toolbar.setNavigationIcon(R.drawable.ic_action_share);
        setSupportActionBar(toolbar);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);// Inflate the menu; this adds items to the action bar if it is present.
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {// Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        int id = item.getItemId();// as you specify a parent activity in AndroidManifest.xml.
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_usb) {// Display menu item's title by using a Toast.
            //Toast.makeText(getApplicationContext(), "Setting Menu", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.action_import) {
            //Toast.makeText(getApplicationContext(), "Search Menu", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.action_category) {
            //Toast.makeText(getApplicationContext(), "User Menu", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

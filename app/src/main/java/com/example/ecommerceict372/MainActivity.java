package com.example.ecommerceict372;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){

        int itemId = item.getItemId();


        if (itemId == R.id.menu_home) {
            Intent i = new Intent(MainActivity.this, MainActivity.class);
            startActivity(i);
            return true;
        } else if (itemId == R.id.menu_login) {
            Intent i = new Intent(MainActivity.this, Login.class);
            startActivity(i);
            return true;
        } else if (itemId == R.id.menu_registration) {
            Intent i = new Intent(MainActivity.this, RegistrationPage.class);
            startActivity(i);
            return true;
        } else if (itemId == R.id.menu_cart) {
            Intent i = new Intent(MainActivity.this, Cart.class);
            startActivity(i);
            return true;
        } else if (itemId == R.id.menu_history) {
            Intent i = new Intent(MainActivity.this, History.class);
            startActivity(i);
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}
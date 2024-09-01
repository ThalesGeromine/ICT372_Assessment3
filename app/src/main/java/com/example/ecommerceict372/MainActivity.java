package com.example.ecommerceict372;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listViewMenu;
    TextView textView;
    String[] listMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewMenu=(ListView)findViewById(R.id.listViewMenu);
        textView=(TextView)findViewById(R.id.textViewHead);
        listMenu= getResources().getStringArray(R.array.arrayMenu);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, listMenu);
        listViewMenu.setAdapter(adapter);

        listViewMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value=adapter.getItem(i);
                Toast.makeText(getApplicationContext(),value, Toast.LENGTH_SHORT).show();

            }
        });


    }
}
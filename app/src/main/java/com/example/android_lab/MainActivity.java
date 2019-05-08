package com.example.android_lab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> target;
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //todo

        String[] values = new String[] {"antylopa", "bóbr", "czapla", "delfin", "elephant", "foka"};
        this.target = new ArrayList<String>();
        this.target.addAll(Arrays.asList(values));

        this.adapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, this.target);
        ListView listview = (ListView)findViewById(R.id.listView);
        listview.setAdapter((this.adapter));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflanter = getMenuInflater();
        inflanter.inflate(R.menu.main_menu, menu);
        return true;
    }

    public void nowyWpis(MenuItem mi){
        Intent intencja = new Intent(this,DodajWpis.class);
        startActivityForResult(intencja,1);
    }




}

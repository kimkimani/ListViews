package com.example.kim.listviews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
private ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list =(ListView)findViewById(R.id.thelist);
        EditText search=(EditText) findViewById(R.id.editText);
        Log.d(TAG, "onCreate: started");
        final ArrayList<String> names = new ArrayList<>();
        names.add("her");
        names.add("status");
        names.add("results");
        names.add("over");
        names.add("under");
        names.add("status");
        names.add("results");
        names.add("over");
        names.add("under");
        names.add("status");
        names.add("results");
        names.add("over");
        names.add("under");
        names.add("kim");
        names.add("tip");
        names.add("home");
        names.add("kim");
        names.add("away");
        names.add("odd");
        names.add("status");
        names.add("results");
        names.add("over");
        names.add("under");
        names.add("her");
        names.add("kim");
        names.add("tip");
        names.add("home");
        names.add("kim");
        names.add("away");
        names.add("odd");
        names.add("status");
        names.add("results");
        names.add("over");
        names.add("under");
        adapter = new ArrayAdapter(this, R.layout.list_item_layout,names);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d(TAG, "onItemClick: ");
                Toast.makeText(MainActivity.this , "you clicked"+names.get(position),Toast.LENGTH_LONG).show();


                Intent intent= new Intent(MainActivity.this,seond_screen.class);
              intent.putExtra("name",names.get(position));
                startActivity(intent);
            }
        });
        search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                (MainActivity.this).adapter.getFilter().filter(s);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });







    }
}
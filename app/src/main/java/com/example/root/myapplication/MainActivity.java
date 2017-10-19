package com.example.root.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView lstSearch;
    private EditText edtSearch;
    private ArrayAdapter<String> adapter;

    String data[] = {
            "Acesite Knutsford Hotel","Attitude on Granville","B P International","BEST WESTERN Grand Hotel","Best Western PLUS Hotel Kowloon",
            "Butterfly on Prat","Empire Hotel Kowloon - Tsim Sha Tsui","Gateway Hotel","GDH Hotel",
            "Harbour Bay Hotel",
            "Holiday Inn Golden Mile Hong Kong",
            "Hotel Benito",
            "Hotel ICON",
            "Hotel Panorama by Rhombus",
            "Hotel Pravo Hong Kong",
            "Hullett House",
            "Hyatt Regency Hong Kong, Tsim Sha Tsui",
            "Imperial Hotel",
            "InterContinental Grand Stanford Hong Kong",
            "InterContinental Hong Kong",
            "Kowloon Shangri-La",
            "Marco Polo Hongkong Hotel",
            "New World Millennium Hong Kong Hotel",
            "Park Hotel",
            "Popway Hotel",
            "Prince Hotel",
            "Regal Kowloon Hotel",
            "Residence G Hong Kong",
            "Sheraton Hong Kong Hotel & Towers",
            "Stanford Hillview Hotel",
            "Sunny Day Hotel",
            "The Bauhinia Hotel",
            "The Kimberley Hotel",
            "The Kowloon Hotel",
            "The Langham, Hong Kong",
            "The Luxe Manor",
            "The Mira Hong Kong",
            "The Peninsula Hong Kong",
            "The Perkin Hotel",
            "The Royal Garden",
            "The Royal Pacific Hotel and Towers",
            "The Salisbury",
            "Xi Hotel"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstSearch = (ListView) findViewById(R.id.lstSearch);
        edtSearch = (EditText) findViewById(R.id.edtSearch);
        adapter = new ArrayAdapter<String>(this, R.layout.list_item,R.id.textView,data);
        lstSearch.setAdapter(adapter);

        edtSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                MainActivity.this.adapter.getFilter().filter(s);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}

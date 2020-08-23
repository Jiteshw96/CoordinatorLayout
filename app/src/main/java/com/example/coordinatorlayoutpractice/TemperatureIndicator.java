package com.example.coordinatorlayoutpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TemperatureIndicator extends AppCompatActivity  implements AdapterView.OnItemSelectedListener {

   private Spinner tempSpinner,unitSpinner;
   private String[] tempValues, unitValues;
   private TextView tempLable,unitLabel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_indicator);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        tempLable = findViewById(R.id.temp_lbl);
        unitLabel = findViewById(R.id.unit_text);
        setSupportActionBar(toolbar);
        initSpinner();
    }

    private void initSpinner() {
        tempSpinner = findViewById(R.id.temp_spinner);
        unitSpinner = findViewById(R.id.unit_spinner);

        tempValues = getResources().getStringArray(R.array.tempValues);
        unitValues = getResources().getStringArray(R.array.units);

        ArrayAdapter<String> tempAdapter = new ArrayAdapter<String>(this,R.layout.spinner_item,tempValues);
        tempAdapter.setDropDownViewResource(R.layout.spinner_item);
        tempSpinner.setAdapter(tempAdapter);
        tempSpinner.setOnItemSelectedListener(this);


        ArrayAdapter<String> unitAdapter = new ArrayAdapter<String>(this,R.layout.spinner_item,unitValues);
        unitAdapter.setDropDownViewResource(R.layout.spinner_item);
        unitSpinner.setAdapter(unitAdapter);
        unitSpinner.setOnItemSelectedListener(this);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(parent.getId() == R.id.temp_spinner){
            String item = parent.getItemAtPosition(position).toString();
            tempLable.setText(item);
        }else if(parent.getId() == R.id.unit_spinner) {
            String item = parent.getItemAtPosition(position).toString();
            unitLabel.setText(item);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}

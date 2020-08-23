package com.example.coordinatorlayoutpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.triggertrap.seekarc.SeekArc;

import java.util.ArrayList;
import java.util.List;

public class OximeterIndicator extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

   private List<String> oximeterValues;
   private SeekArc seekArc;
   private TextView oximeterIndicator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oximeter_indicator);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        oximeterIndicator = findViewById(R.id.percent_indicator_lbl);
        initSpinner();
        initSeekBar();


    }

    private void initSeekBar() {
        seekArc = findViewById(R.id.seekArcOximeter);
    }

    private void initSpinner() {
        Spinner spinner = findViewById(R.id.oximeter_spinner);
        spinner.setOnItemSelectedListener(this);
        oximeterValues = new ArrayList<String>();
        oximeterValues.add("10 %");
        oximeterValues.add("20 %");
        oximeterValues.add("30 %");
        oximeterValues.add("40 %");
        oximeterValues.add("50 %");
        oximeterValues.add("60 %");
        oximeterValues.add("70 %");
        oximeterValues.add("80 %");
        oximeterValues.add("90 %");
        oximeterValues.add("100 %");

        ArrayAdapter<String> dataAdapter =  new ArrayAdapter<String>(this,R.layout.spinner_item,oximeterValues);
        dataAdapter.setDropDownViewResource(R.layout.spinner_item);
        spinner.setAdapter(dataAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        int progress = (position + 1) * 10;
      //  String item = parent.getItemAtPosition(position).toString();

       // Toast.makeText(this,item,Toast.LENGTH_SHORT).show();
        oximeterIndicator.setText(String.valueOf(progress));
        seekArc.setProgress(progress);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}

package com.braincells.factorydemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private ColoredShapeFactory factory = new ColoredShapeFactory();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner shapeSelector = (Spinner) findViewById(R.id.shapeSelector);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
            R.array.shapes, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        shapeSelector.setAdapter(adapter);
        shapeSelector.setOnItemSelectedListener(this);

        Spinner colorSelector = (Spinner) findViewById(R.id.colorSelector);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> colorAdapter = ArrayAdapter.createFromResource(this,
                R.array.colors, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        colorAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        colorSelector.setAdapter(colorAdapter);
        colorSelector.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Spinner colorSelector = (Spinner) findViewById(R.id.colorSelector);
        Spinner shapeSelector = (Spinner) findViewById(R.id.shapeSelector);
        String color = colorSelector.getSelectedItem().toString();
        String shape = shapeSelector.getSelectedItem().toString();
        ColoredShape cs = factory.getInstance(shape, color);
        Log.d("factorydemo", colorSelector.getSelectedItem().toString() + " "  + shapeSelector.getSelectedItem().toString());

        TextView output = (TextView) findViewById(R.id.outputText);
        output.setText(cs.getColor() + " " + cs.getShape());
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        TextView output = (TextView) findViewById(R.id.outputText);
        output.setText("");
    }
}

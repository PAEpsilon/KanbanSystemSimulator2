package com.example.kanbansystemsimulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textoPantalla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View launchButton = findViewById(R.id.launchButton);
        launchButton.setOnClickListener(this);

        textoPantalla = (TextView) findViewById(R.id.textoPrincipal);

    }

    @Override
    public void onClick(View v) {

        Simulation.configure(new ConfigurationSimulatorParameters(30));
        Simulation.executeSimulator();

        int tamano = Simulation.getTotalQueue();
        textoPantalla.setText(Simulation.getDataToDraw());

    }
}

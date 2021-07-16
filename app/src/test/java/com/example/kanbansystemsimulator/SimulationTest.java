package com.example.kanbansystemsimulator;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimulationTest {

    @Test
    public void configureSimulator(){

        ConfigurationSimulatorParameters configurationSimulatorParameters = new ConfigurationSimulatorParameters(5);
        Simulation.configure(configurationSimulatorParameters);
        assertEquals(Simulation.totalTimeOfSimulator,5);
    }


    @Test
    public void simulationCompletedTime(){


        ConfigurationSimulatorParameters configuration = new ConfigurationSimulatorParameters(60);
        Simulation.configure(configuration);
        Simulation.executeSimulator();
        assertEquals(Simulation.totalTimeOfSimulator, 0);

    }





}

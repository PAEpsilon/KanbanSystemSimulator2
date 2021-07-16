package com.example.kanbansystemsimulator;

public class Simulation {


    public static int totalTimeOfSimulator;
    public static String dataOfTheSimulator;



    public static void configure(ConfigurationSimulatorParameters parameters)
    {
        totalTimeOfSimulator = parameters.timeOfSimulation;
        dataOfTheSimulator = "";

    }

    public static void executeSimulator() {
        WorkSystem.start();
        dataOfTheSimulator = WorkSystem.draw();

        while(totalTimeOfSimulator >0)
        {

            appearsNewPerson();
            WorkSystem.workADay();

            /*
            personMakeOperation();
            personasIsEnded();
            appearsNewPerson();*/
            totalTimeOfSimulator --;
            addNewLineToDraw();
        }
    }

    private static void addNewLineToDraw() {
        dataOfTheSimulator += "\n";
        dataOfTheSimulator += WorkSystem.draw() + "time: "+totalTimeOfSimulator;
    }

    private static void appearsNewPerson(){
        if(Math.random()>0.5){
            WorkSystem.addItem(new WorkItem(3));
        }
    }


    public static int getTotalQueue() {
        return WorkSystem.totalNumberStack();
    }

    public static String getDataToDraw() { return dataOfTheSimulator;}
}

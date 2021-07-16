package com.example.kanbansystemsimulator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrawWorkSystemTest {

    @Test
    public void convertItemToTextForDraw(){
        WorkItem workItemtem = new WorkItem(4);
        assertEquals(workItemtem.toString(),"[4]");


    }

    @Test
    public void convertWorkSystemToTextForDraw(){
        WorkSystem workSystem = new WorkSystem();
        workSystem.start();
        workSystem.addItem(new WorkItem(2));
        workSystem.addItem(new WorkItem(3));

        assertEquals(WorkSystem.draw(),"->[2][3]<-");


    }

    @Test
    public void convertEmptyWorkSystemToTextForDraw(){
        WorkSystem workSystem = new WorkSystem();
        workSystem.start();
        assertEquals(WorkSystem.draw(),"-><-");

    }
}

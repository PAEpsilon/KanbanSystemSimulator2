package com.example.kanbansystemsimulator;

import org.junit.Test;

import static org.junit.Assert.*;

public class WorkItemTest {

    @Test
    public void existsTimeToWork() {
        assertEquals(new WorkItem(5).timeToWork, 5);
    }

    @Test
    public void workInTheItem(){
        WorkItem itemToWork = new WorkItem(5);
        assertEquals(itemToWork.timeToWork, 5);
        itemToWork.workInTheItem();
        assertEquals(itemToWork.timeToWork, 4);
    }

    @Test
    public void negativeTimeInAWorkItem(){

        WorkItem itemToWork = new WorkItem(0);
        itemToWork.workInTheItem();
        assertEquals(itemToWork.timeToWork, 0);
    }
}

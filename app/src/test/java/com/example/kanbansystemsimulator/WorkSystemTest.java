package com.example.kanbansystemsimulator;

import org.junit.Test;

import static org.junit.Assert.*;
public class WorkSystemTest {


    @Test
    public void existsWorkSystem(){

        WorkSystem.start();
        assertEquals(WorkSystem.stack.size(), 0);

    }

     @Test
    public void addItemToTheWorkSystem(){
        WorkSystem.start();
        WorkItem item = new WorkItem(5);
        WorkSystem.addItem(item);
        assertEquals(WorkSystem.stack.size(), 1);
        assertEquals(WorkSystem.getLastItem(), item);


     }

     @Test
    public void sizeStack(){
        WorkSystem.start();
        WorkItem item = new WorkItem(5);
        WorkSystem.addItem(item);
        WorkItem item2 = new WorkItem(5);
        WorkSystem.addItem(item2);
        WorkItem item3 = new WorkItem(5);
        WorkSystem.addItem(item3);
        assertEquals(WorkSystem.totalNumberStack(), 3);


     }

    @Test
    public void workOneDay(){
        WorkSystem.start();
        WorkItem item = new WorkItem(10);
        WorkSystem.addItem(item);
        WorkSystem.workADay();
        assertEquals(WorkSystem.getByPosition(0).timeToWork,9);

    }

     @Test
     public void workOneDayWithTwoWip(){
        WorkSystem.start(2);
        WorkItem item = new WorkItem(10);
        WorkItem item2 = new WorkItem(5);
        WorkSystem.addItem(item);
        WorkSystem.addItem(item2);
        WorkSystem.workADay();
        assertEquals(WorkSystem.getByPosition(0).timeToWork,9);
        assertEquals(WorkSystem.getByPosition(1).timeToWork, 4);
     }

     @Test
     public void itemByPosition(){
         WorkSystem.start();
         WorkItem item = new WorkItem(5);
         WorkItem item2 = new WorkItem(4);
         WorkSystem.addItem(item);
         WorkSystem.addItem(item2);
         assertEquals(WorkSystem.getByPosition(1), item2);
     }

     @Test
     public void removeFirstItem(){
         WorkSystem.start();
         WorkItem item = new WorkItem(3);
         WorkSystem.addItem(item);
         assertEquals(WorkSystem.totalNumberStack(),1);
         WorkSystem.removeFirstItem();
         assertEquals(WorkSystem.totalNumberStack(),0);
     }

     @Test
    public void itemFinishTheWork(){
         WorkSystem.start();
         WorkItem item = new WorkItem(3);
         WorkSystem.addItem(item);
         assertEquals(WorkSystem.totalNumberStack(),1);
         WorkSystem.workADay();
         WorkSystem.workADay();
         WorkSystem.workADay();
         assertEquals(WorkSystem.totalNumberStack(),0);
     }

}

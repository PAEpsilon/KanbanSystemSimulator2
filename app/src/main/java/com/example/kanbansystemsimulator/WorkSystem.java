package com.example.kanbansystemsimulator;

import java.util.LinkedList;
import java.util.List;

class WorkSystem {
    public static List<WorkItem> stack;
    public static int resources;

    public static void start() {
        stack = new LinkedList<WorkItem>();
        resources = 1;
    }

    public static void start(int numberOfResources) {
        stack = new LinkedList<WorkItem>();
        resources = numberOfResources;
    }


    public static void addItem(WorkItem item) {
        stack.add(item);
    }

    public static WorkItem getLastItem() {

        return stack.get(stack.size()-1);
    }

    public static int totalNumberStack() {
        return stack.size();
    }

    public static String draw(){

        String drawInStringFormat = "->";

        for(WorkItem item:stack)
        {
            drawInStringFormat +=item.toString();
        }

        drawInStringFormat+="<-";

        return drawInStringFormat;
    }

    public static void workADay() {

        if (stack.size() > 0) {
            stack.get(0).workInTheItem();

            if(stack.get(0).timeToWork ==0){
                removeFirstItem();
            }
        }

    }

    public static void removeFirstItem() {
        if (stack.size() > 0) {
            stack.remove(0);
        }
    }

    public static WorkItem getByPosition(int i) {
        return stack.get(i);


    }
}

package com.example.kanbansystemsimulator;

import androidx.annotation.Nullable;

public class WorkItem {

    int timeToWork = 5;

    public WorkItem(int timeToWork) {
        this.timeToWork = timeToWork;
    }

    public void workInTheItem() {
        timeToWork = timeToWork==0?0:timeToWork-1;
    }

    public String toString(){
        return "["+timeToWork+"]";
    }
}

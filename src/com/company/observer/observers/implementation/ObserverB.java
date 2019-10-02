package com.company.observer.observers.implementation;

import com.company.observer.observers.interfaces.Observer;
import com.company.observer.subject.interfaces.Subject;

public class ObserverB implements Observer {

    private Subject subject;

    public ObserverB(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("ObserverB state:"+subject.getState());
    }
}

package com.company.observer.observers.implementation;

import com.company.observer.observers.interfaces.Observer;
import com.company.observer.subject.interfaces.Subject;

public class ObserverA implements Observer {

    private Subject subject;

    public ObserverA(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("ObserverA is: "+subject.getState());
    }
}

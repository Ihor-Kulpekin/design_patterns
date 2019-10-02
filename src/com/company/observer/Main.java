package com.company.observer;

import com.company.observer.observers.implementation.ObserverA;
import com.company.observer.observers.implementation.ObserverB;
import com.company.observer.observers.interfaces.Observer;
import com.company.observer.subject.implementation.SubjectImpl;
import com.company.observer.subject.interfaces.Subject;

public class Main {
    public static void main(String[] args) {
        Subject subject = new SubjectImpl();

        Observer observerA = new ObserverA(subject);
        Observer observerB = new ObserverB(subject);

        subject.addObserver(observerA);
        subject.addObserver(observerB);

        subject.setState(15);

        subject.notifyAllObservers();

        System.out.println("Here We delete observer");
        subject.removeObserver(observerA);

        subject.setState(56);

        subject.notifyAllObservers();
    }
}

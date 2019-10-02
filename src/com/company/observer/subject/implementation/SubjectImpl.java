package com.company.observer.subject.implementation;

import com.company.observer.observers.interfaces.Observer;
import com.company.observer.subject.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {

    private List<Observer> observers= new ArrayList<>();
    private int state;

    public List<Observer> getObservers() {
        return observers;
    }

    @Override
    public int getState() {
        return state;
    }

    @Override
    public void setState(int state) {
        this.state = state;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
        notifyAllObservers();
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer :observers) {
            observer.update();
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}

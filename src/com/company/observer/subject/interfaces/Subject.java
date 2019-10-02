package com.company.observer.subject.interfaces;

import com.company.observer.observers.interfaces.Observer;

import java.util.List;

public interface Subject {
    void notifyAllObservers();
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void setObservers(List<Observer> observers);
    int getState();
    void setState(int state);
}

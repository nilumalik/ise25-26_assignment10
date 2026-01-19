package de.seuhd.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<Observer> observers = new ArrayList<>();

    // Alle Methoden public, damit ConcreteSubject sie aufrufen kann
    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        System.out.println("Sending update to observers ...");
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}

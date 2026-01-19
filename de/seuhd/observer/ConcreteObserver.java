package de.seuhd.observer;

public class ConcreteObserver implements Observer {

    private String name;
    private Subject subject;

    public ConcreteObserver(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
        subject.attach(this); // automatisch registrieren
    }

    @Override
    public void update(Subject subject) {
        if (subject instanceof ConcreteSubject) {
            ConcreteSubject cs = (ConcreteSubject) subject;
            System.out.println(name + " received update from subject : New value is " + cs.getValue());
        }
    }

    // Observer abmelden
    public void detach() {
        subject.detach(this);
    }
}

package subject_observer.observer.concrete;

import subject_observer.display.DisplayElement;
import subject_observer.observer.Observer;
import subject_observer.subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private Subject subject;
    private float temp;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("温度: " + temp + "\n湿度 " + humidity + "\n压力: " + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.display();
    }
}

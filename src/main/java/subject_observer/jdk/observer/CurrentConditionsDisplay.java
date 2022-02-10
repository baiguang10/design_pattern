package subject_observer.jdk.observer;

import subject_observer.display.DisplayElement;
import subject_observer.jdk.observerable.WeatherData;


import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements DisplayElement, Observer {
    private Observable observable;
    private float temp;
    private float humidity;
    private float pressure;

    @Override
    public void display() {
        System.out.println("温度: " + temp + "\n湿度 " + humidity + "\n压力: " + pressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temp = weatherData.getTemp();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }

    public CurrentConditionsDisplay(Observable o) {
        this.observable = o;
        o.addObserver(this);
    }
}

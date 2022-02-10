package subject_observer;

import org.junit.Test;
import subject_observer.observer.concrete.CurrentConditionsDisplay;
import subject_observer.subject.concrete.WeatherData;

import java.util.Observable;

public class WeatherDataTest {
    @Test
    public void displayTest() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurement(0.5f, 33.9f, 80);
    }

    @Test
    public void JDKDisplayTest() {
        subject_observer.jdk.observerable.WeatherData weatherData = new subject_observer.jdk.observerable.WeatherData();
        subject_observer.jdk.observer.CurrentConditionsDisplay currentConditionsDisplay = new subject_observer.jdk.observer.CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurement(0.5f, 33.9f, 80);
    }
}

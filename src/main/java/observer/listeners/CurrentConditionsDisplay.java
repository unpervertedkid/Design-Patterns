package observer.listeners;

import observer.listeners.displayelements.DisplayElement;
import observer.subjects.Subject;

public class CurrentConditionsDisplay implements DisplayElement,Observer{
    private float temperature;
    private float humidity;
    Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }


    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + " Celsius and " + humidity + "% humidity");
    }
}

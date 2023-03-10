package observer.listeners;

import observer.listeners.displayelements.DisplayElement;
import observer.subjects.Subject;

public class ForecastDisplay implements DisplayElement,Observer{

    private float currentPressure;
    private float lastPressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.print("Current forecast:");
        if (currentPressure >  lastPressure){
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same.");
        }else {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
    }
}

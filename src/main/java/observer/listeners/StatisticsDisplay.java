package observer.listeners;

import observer.listeners.displayelements.DisplayElement;
import observer.subjects.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float averageTemperature = Float.MIN_VALUE;
    private float averageHumidity = Float.MIN_VALUE;
    private float averagePressure = Float.MIN_VALUE;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        updateAverages(temperature, humidity, pressure);
    }

    @Override
    public void display(){
        System.out.println("Average conditions:");
        System.out.println("\tAverageTemperature = " + averageTemperature);
        System.out.println("\tAverageHumidity = " + averageHumidity + "%");
        System.out.println("\tAveragePressure = " + averagePressure);
    }

    private void updateAverages(float temperature, float humidity,float pressure){

        this.averageTemperature = averageTemperature == Float.MIN_VALUE ? temperature : (averageTemperature + temperature) / 2;
        this.averageHumidity = averageHumidity == Float.MIN_VALUE ? humidity : (averageHumidity + humidity) / 2;
        this.averagePressure = averagePressure == Float.MIN_VALUE ? pressure : (averagePressure + pressure) / 2;

        display();
    }
}

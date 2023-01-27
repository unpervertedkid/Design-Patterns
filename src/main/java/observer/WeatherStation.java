package observer;

import observer.listeners.CurrentConditionsDisplay;
import observer.listeners.ForecastDisplay;
import observer.listeners.StatisticsDisplay;
import observer.subjects.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(26,65,30.4f);
        weatherData.setMeasurements(21,70,29.2f);
        weatherData.setMeasurements(23,90,29.2f);
    }
}

package observer;

public class WeatherData {
    private float temperature;
    private float humidity;
    private float pressure;
    CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
    ForecastDisplay forecastDisplay = new ForecastDisplay();

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void measurementsChanged(){
        float temperature = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();


        currentConditionsDisplay.update(temperature,humidity,pressure);
        statisticsDisplay.update(temperature,humidity,pressure);
        forecastDisplay.update(temperature,humidity,pressure);
    }
}

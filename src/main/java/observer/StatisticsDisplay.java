package observer;

public class StatisticsDisplay implements Observer,DisplayElement{

    private float averageTemperature;
    private float averageHumidity;
    private float averagePressure;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.averageTemperature = 0;
        this.averageHumidity = 0;
        this.averagePressure = 0;
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
        this.averageTemperature = (averageTemperature + temperature) / 2;
        this.averageHumidity = (averageHumidity + humidity) / 2;
        this.averagePressure = (averagePressure + pressure) / 2;

        display();
    }
}

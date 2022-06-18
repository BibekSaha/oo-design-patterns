package ml.bibek.two.observer;

public class ForecastDisplay implements Observer, Display {

    private final WeatherData weatherData;
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.lastPressure = this.currentPressure;
        this.currentPressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.println(
                "Last Pressure: " + lastPressure +
                        ", Current Pressure: " + currentPressure
        );
    }
}

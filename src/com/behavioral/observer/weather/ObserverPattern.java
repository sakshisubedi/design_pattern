package com.behavioral.observer.weather;

/**
 * The Client creates publisher and subscriber objects separately and then registers subscribers for publisher updates.
 */
public class ObserverPattern {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer currentConditionsDisplay  = new CurrentConditionsDisplay();
        Observer forecastDisplay  = new ForecastDisplay();
        Observer statisticsDisplay  = new StatisticsDisplay();
        Observer thirdPartyDisplay  = new ThirdPartyDisplay();

        weatherData.setMeasurements(55, 20, 50);

        weatherData.subscribe(currentConditionsDisplay);
        weatherData.subscribe(forecastDisplay);
        weatherData.setMeasurements(65, 20, 50);

        weatherData.unsubscribe(forecastDisplay);
        weatherData.subscribe(statisticsDisplay);
        weatherData.subscribe(thirdPartyDisplay);
        weatherData.setMeasurements(100, 50, 30);

    }
}

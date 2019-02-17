package SDA;

import java.time.LocalDate;

public class Weather {
    private LocalDate Date;
    private int MaxTemperature;
    private double MeanTemperature;
    private int MinTemperature;


    public Weather(LocalDate date, int maxTemperature, double meanTemperature, int minTemperature) {
        Date = date;
        MaxTemperature = maxTemperature;
        MeanTemperature = meanTemperature;
        MinTemperature = minTemperature;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "Date=" + Date +
                ", Max Temperature=" + MaxTemperature +
                ", MeanTemperature=" + MeanTemperature +
                ", MinTemperature=" + MinTemperature +
                '}';
    }

    public LocalDate getDate() {
        return Date;
    }

    public int getMaxTemperature() {
        return MaxTemperature;
    }

    public double getMeanTemperature() {
        return MeanTemperature;
    }

    public int getMinTemperature() {
        return MinTemperature;
    }
}

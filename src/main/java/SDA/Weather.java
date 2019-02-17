package SDA;

import java.time.LocalDate;

public class Weather {
    private LocalDate Date;
    private int maxTemperaturec;
    private double MeanTemperature;
    private int MinTemperature;


    public Weather(LocalDate date, int maxTemperature, double meanTemperature, int minTemperature) {
        Date = date;
        maxTemperaturec = maxTemperature;
        MeanTemperature = meanTemperature;
        MinTemperature = minTemperature;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "Date=" + Date +
                ", maxTemperaturec=" + maxTemperaturec +
                ", MeanTemperature=" + MeanTemperature +
                ", MinTemperature=" + MinTemperature +
                '}';
    }

    public LocalDate getDate() {
        return Date;
    }

    public int getMaxTemperaturec() {
        return maxTemperaturec;
    }

    public double getMeanTemperature() {
        return MeanTemperature;
    }

    public int getMinTemperature() {
        return MinTemperature;
    }
}

package SDA;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class WeatherMethod {

    protected static final Logger log = Logger.getLogger(WeatherMethod.class.getName());
    private List<Weather> weathers = new ArrayList<>();

    public List<Weather> utworzListe() throws IOException {

        File file = new File("D:\\JAVA\\Zajęcia Java\\PrzetwarzaniePlikow\\src\\main\\resources\\Pliki\\weather-data.csv");


        LineIterator fileContents = FileUtils.lineIterator(file, "UTF-8");

        while (fileContents.hasNext()) {

            String[] line = fileContents.nextLine().split(",");
            try {

                weathers.add(
                        new Weather(
                                LocalDate.parse(line[0], DateTimeFormatter.ofPattern("M/d/yyyy")),
                                new Integer(line[1]),
                                new Integer(line[2]), new Integer(line[3])));
            } catch (DateTimeParseException | NumberFormatException e) {
                log.warning("Number");
            }
        }
        return weathers;
    }

    public Weather pogodaDnia(LocalDate data) {

        for (Weather weather : weathers) {
            if (data.equals(weather.getDate())) {
                return weather;
            }
        }
        return null;
    }


    public MinMaxResult porownanie(LocalDate dataPierwsza, LocalDate dateDruga) {
        List<Weather> weathersFromRange = getDateFromRange(dataPierwsza, dateDruga);
        if (weathersFromRange.isEmpty()) {
            return null;
        }
        int maxTemp = weathersFromRange.get(0).getMaxTemperaturec();
        int minTemp = weathersFromRange.get(0).getMinTemperature();

        for (Weather weather : weathersFromRange) {
            if (weather.getMaxTemperaturec() >= maxTemp) {
                maxTemp = weather.getMaxTemperaturec();
            }
            if (weather.getMinTemperature() <= minTemp) {
                minTemp = weather.getMinTemperature();
            }
        }

return new MinMaxResult(minTemp,maxTemp);
    }



    private List<Weather> getDateFromRange(LocalDate dateFrom, LocalDate dateTo) {
        List<Weather> lista = new ArrayList<>();

        for (Weather weather : weathers) {
            if (weather.getDate().isAfter(dateFrom) && weather.getDate().isBefore(dateTo)) {

                lista.add(weather);

            }

        }
        return lista;
    }

    public int iloscDni(int i) {
        int count = 0;
        for (Weather weather : weathers) {
            if (weather.getMeanTemperature() >= i) {
                ++count;
            }
        }
        return count;

    }

    public int rok() {
        int najwyzsza = 0;
        int najcieplejszyRok = 0;
        for (Weather weather : weathers) {
            if (weather.getMaxTemperaturec() >= najwyzsza) {
                najwyzsza = weather.getMaxTemperaturec();
                najcieplejszyRok = weather.getDate().getYear();
            }
        }
        System.out.println(najwyzsza);
        return najcieplejszyRok;

    }
}





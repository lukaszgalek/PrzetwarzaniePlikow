package SDA;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class WeatherMethod {

    protected static final Logger log = Logger.getLogger(WeatherMethod.class.getName());
    private List<Weather> weather = new ArrayList<>();

    public List<Weather> utworzListe () throws IOException {

        File file = new File("D:\\JAVA\\Zajęcia Java\\PrzetwarzaniePlikow\\src\\main\\resources\\Pliki\\weather-data.csv");



        LineIterator fileContents = FileUtils.lineIterator(file,"UTF-8");

        while(fileContents.hasNext()){

            String[] line = fileContents.nextLine().split(",");
try{

            weather.add(new Weather(LocalDate.parse(line[0]),new Integer(line[1]),new Integer(line[2]),new Integer( line[3])));
} catch (NumberFormatException e) {

    log.warning("Number");
}
        }return weather;
    }

    public void pogodaWDnia(LocalDate data){
        for (Weather i :weather ){
            if ( data.equals(i.getDate())){
                i.getMaxTemperature();
                i.getMeanTemperature();
                i.getMinTemperature();}
            }
        }

    }


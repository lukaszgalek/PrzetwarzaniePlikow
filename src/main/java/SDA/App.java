package SDA;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class App {
    public static void main(String[] args) throws IOException {
//        File file = new File("D:\\JAVA\\Zajęcia Java\\PrzetwarzaniePlikow\\src\\main\\resources\\Pliki\\simpleExample.txt");
//
//        LineIterator fileContent = FileUtils.lineIterator(file, "UTF-8");
//
//        while (fileContent.hasNext()) {
//            System.out.println(fileContent.nextLine());
//        }
//
//
//UserMethod userMethod = new UserMethod();
//        for (User i: userMethod.list()){
//        System.out.println(i);}
////userMethod.listy();
//        System.out.println("\n");
//
//        for (User i: userMethod.getKobiety()){
//            System.out.println(i );}
//        System.out.println("\n");
//        for (User i: userMethod.getMezczyzni()){
//            System.out.println(i);}
// druga metoda
//        File file = new File("D:\\JAVA\\Zajęcia Java\\PrzetwarzaniePlikow\\src\\main\\resources\\Pliki\\simpleExample.txt");
//        FileReader fis = new FileReader(file);
//        String linia = "";
//        BufferedReader bfr = new BufferedReader(fis);
//        while ((linia = bfr.readLine()) != null) {
//            System.out.println(linia);
//        }


//        BooksMethod booksMethod = new BooksMethod();
//        for (Books i : booksMethod.utworzListe()) {
//            System.out.println(i);
//        }
WeatherMethod weatherMethod = new WeatherMethod();
                for (Weather i : weatherMethod.utworzListe()) {
            System.out.println(i);
        }

        System.out.println(weatherMethod.pogodaDnia(LocalDate.parse("1948-01-01")));
        System.out.println("---------------------");
        System.out.println(weatherMethod.porownanie(LocalDate.parse("1948-02-01"),LocalDate.parse("1948-09-09")));



        System.out.println(weatherMethod.iloscDni(20));


        System.out.println(weatherMethod.rok());

    }

}


package SDA;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserMethod {
    private List<User> kobiety = new ArrayList<User>();
    private List<User> mezczyzni = new ArrayList<User>();


    public void listy () throws IOException {
        File fileTwo = new File("D:\\JAVA\\Zajęcia Java\\PrzetwarzaniePlikow\\src\\main\\resources\\Pliki\\users.txt");


        LineIterator fileContents = FileUtils.lineIterator(fileTwo, "UTF-8");

        while (fileContents.hasNext()) {
            String[] line = fileContents.nextLine().split(" ");
            if (line[1].endsWith("a")){
                kobiety.add(new User(line[0], line[1], new Integer(line[2])));
            }else{
            mezczyzni.add(new User(line[0], line[1], new Integer(line[2])));
        }

    }}

    public List<User> list () throws IOException {
        File fileTwo = new File("D:\\JAVA\\Zajęcia Java\\PrzetwarzaniePlikow\\src\\main\\resources\\Pliki\\users.txt");
        List<User> usersList = new ArrayList<User>();

        LineIterator fileContents = FileUtils.lineIterator(fileTwo, "UTF-8");

        while (fileContents.hasNext()) {
            String[] line = fileContents.nextLine().split(" ");
            usersList.add(new User(line[0], line[1], new Integer(line[2])));
        }
        return usersList;
    }

    public List<User> getKobiety() {
        return kobiety;
    }

    public List<User> getMezczyzni() {
        return mezczyzni;
    }
}

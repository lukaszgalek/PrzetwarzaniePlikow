package SDA;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class BooksMethod {

protected  static final Logger log = Logger.getLogger(BooksMethod.class.getName());
    public List<Books> utworzListe() throws IOException {

        File file = new File("D:\\JAVA\\Zajęcia Java\\PrzetwarzaniePlikow\\src\\main\\resources\\Pliki\\books.csv");
        List<Books> books = new ArrayList<>();

        LineIterator fileContents = FileUtils.lineIterator(file, "UTF-8");

        while (fileContents.hasNext()) {
            String[] line = fileContents.nextLine().split(",");

            try {
                books.add(new Books(new Integer(line[0]), line[1], line[2], new Double(line[3]), new Boolean(line[4]),
                        line[5], line[6], new Integer(line[7]), line[8]));
            } catch (NumberFormatException e) { log.warning("Number");
            }
        }
        books.sort(new BooksComparator());
        return books;
    }
}

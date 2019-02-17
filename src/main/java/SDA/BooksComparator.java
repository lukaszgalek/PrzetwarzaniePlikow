package SDA;

import java.util.Comparator;

public class BooksComparator implements Comparator<Books> {


    @Override
    public int compare(Books o1, Books o2) {
        int result  = o2.isInStock().compareTo(o1.isInStock());
        if(result==0){
            result = o2.getPrice().compareTo(o1.getPrice());
        }
        return result;
    }
}

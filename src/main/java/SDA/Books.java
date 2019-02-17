package SDA;

public class Books {

    private int id;
    private String cat;
    private String name;
    private double price;
    private boolean inStock;
    private String author_t;
    private String series_t;
    private int sequence_i;
    private String genre_s;


    public Books(int id, String cat, String name, double price, Boolean inStock, String author_t, String series_t, int sequence_i, String genre_s) {
        this.id = id;
        this.cat = cat;
        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.author_t = author_t;
        this.series_t = series_t;
        this.sequence_i = sequence_i;
        this.genre_s = genre_s;


    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", cat='" + cat + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", inStock=" + inStock +
                ", author_t='" + author_t + '\'' +
                ", series_t='" + series_t + '\'' +
                ", sequence_i=" + sequence_i +
                ", genre_s='" + genre_s + '\'' +
                '}';
    }

    public Double getPrice() {
        return price;
    }

    public Boolean isInStock() {
        return inStock;
    }
}

public class Book {
    private int bookCode;
    private String name;
    private double price;
    private String author;




    public Book(int bookCode, String name, double price, String author) {
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;
    }


    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Book{" +
                "bookCode=" + bookCode +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }

}

public class FictionBook extends Book {
    private String category;

    public FictionBook(int bookCode, String name, double price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }


    public String getCategory() {
        return category;
    }




}

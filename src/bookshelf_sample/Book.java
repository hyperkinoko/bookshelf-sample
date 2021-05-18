package bookshelf_sample;

public class Book {
    private String name;
    private String author;
    private int price;

    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("『%s』 著：%s %d円",
                this.name, this.author, this.price);
    }
}

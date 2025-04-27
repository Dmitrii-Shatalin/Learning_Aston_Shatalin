public class Book {
    private String title;
    private int pages;
    private int year;

    // Конструктор принимает: название, страницы, год
    public Book(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return title + " (" + pages + ", " + year + " год)";
    }
}
package classwork._5_2908_Classes.Task5;

public class Book {
    private String name;
    private String author;
    private int publishingYear;
    private String publishingHouse;
    private String genre;
    private int countOfPage;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Book(String name, String author, String genre) {
        this(name, author);
        this.genre = genre;
    }

    public Book(String name, String author, int publishingYear, String publishingHouse, String genre, int countOfPage) {
        this(name, author, genre);
        this.publishingYear = publishingYear;
        this.publishingHouse = publishingHouse;
        this.countOfPage = countOfPage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getCountOfPage() {
        return countOfPage;
    }

    public void setCountOfPage(int countOfPage) {
        this.countOfPage = countOfPage;
    }

    @Override
    public String toString() {
        return "\nBook{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishingYear=" + publishingYear +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", genre='" + genre + '\'' +
                ", countOfPage=" + countOfPage +
                '}';
    }
}
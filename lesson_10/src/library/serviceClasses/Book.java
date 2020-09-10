package library.serviceClasses;

public class Book {
    private final int id;
    private String title;
    private String genre;

    protected Book(int id, String title, String genre) {
        this.id = id;
        this.title = title;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "ID=" + id +
                ", Title='" + title + '\'' +
                ", Genre='" + genre + '\'';
    }

    protected int getId() {
        return id;
    }

    protected String getTitle() {
        return title;
    }

    protected void setTitle(String title) {
        this.title = title;
    }

    protected void setGenre(String genre) {
        this.genre = genre;
    }

}

package HomeworkLesson9;

public class Book {
    private String nameOfBook;
    private int yearOfPublication;
    private Author author;

    public Book(String nameOfBook, int yearOfPublication, Author author) {
        this.nameOfBook = nameOfBook;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public String getNameOfBook() {
        return this.nameOfBook;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }


    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
class Author {

    private String nameAuthor;
    private String surnameAuthor;

    public Author(String nameAuthor, String surnameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
    }

    public String getNameAuthor() {
        return this.nameAuthor;
    }

    public String getSurnameAuthor() {
        return this.surnameAuthor;
    }

}







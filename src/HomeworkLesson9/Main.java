package HomeworkLesson9;

public class Main {

    public static void main(String[] args) {

        Book[] books = new Book[5];


        Author rouling = new Author("Джоан", "Роулинг");
        Author tolkin = new Author("Джон", "Толкин");

        Book harryPotter1 = new Book("Гарри Поттер и Философский Камень", 1995, rouling);
        Book theLordOfRings1 = new Book("Властелин Колец", 1954, tolkin);
        Book harryPotter2 = new Book("Гарри Поттер и Тайная комната",2000,rouling);


        harryPotter1.setYearOfPublication(1994); // заменил год
        System.out.println("Книга : " + harryPotter1.getNameOfBook() + ". Год издания :" + harryPotter1.getYearOfPublication()); //тестил


        AddBook(harryPotter1, books);
        AddBook(harryPotter2, books);
        AddBook(theLordOfRings1, books);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                sb.append(books[i].author.getNameAuthor() + " " + books[i].author.getSurnameAuthor() + ": " + books[i].getNameOfBook() + ": " + books[i].getYearOfPublication());
                System.out.println(sb);
                sb.setLength(0);
            } else {
                break;
            }
        }
        }


    public static void AddBook (Book newBook, Book[] books) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                break;
            }
        }
    }
}
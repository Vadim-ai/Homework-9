package HomeworkLesson9;

public class Main {

    public static void main(String[] args) {

        Book harryPotter1 = new Book("Гарри Поттер и Философский Камень", 1995);
        Book theLordOfRings1 = new Book("Властелин Колец", 1954);
        Author rouling = new Author("Джоан","Роулинг");
        Author tolkin = new Author("Джон","Толкин");

        System.out.println("Имя автора : " + tolkin.getNameAuthor() + ". Фамилия автора : " + tolkin.getSurnameAuthor() + ". Книга : " + theLordOfRings1.getNameOfBook()); //тестил
        harryPotter1.setYearOfPublication(1994); // заменил год
        System.out.println("Книга : " + harryPotter1.getNameOfBook() + ". Год издания :" + harryPotter1.getYearOfPublication()); //тестил


    }
}
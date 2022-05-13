package HomeworkLesson9;

public class Main {

    public static void main(String[] args) {



        Author rouling = new Author("Майк", "Вазовски");
        Author tolkin = new Author("Джон","Толкин");

        Book harryPotter1 = new Book("Гарри Поттер и Философский Камень", 1995,rouling);
        Book theLordOfRings1 = new Book("Властелин Колец", 1954, tolkin);


        harryPotter1.setYearOfPublication(1994); // заменил год
        System.out.println("Книга : " + harryPotter1.getNameOfBook() + ". Год издания :" + harryPotter1.getYearOfPublication()); //тестил

    }
}
package HomeworkLesson9;

public class Book {
        private String nameOfBook;
        private int yearOfPublication;

        public Book (String nameOfBook, int yearOfPublication) {
            this.nameOfBook = nameOfBook;
            this.yearOfPublication  = yearOfPublication;
        }
       public String getNameOfBook(){
            return this.nameOfBook;
        }

        public int getYearOfPublication(){
            return this.yearOfPublication;
        }

        public void setYearOfPublication(int yearOfPublication) {
            this.yearOfPublication = yearOfPublication;
        }

    }



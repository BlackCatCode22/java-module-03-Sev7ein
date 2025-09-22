package p1;
//9/20/25
// s.n


public class App{
    public static void main(String[] args) {
        // p1.Book is the class being called
        // book1 is the name we gave to the template of our new object
        // new is the call to define the object book1 and p1.Book() runs the function of the class
        Book book1 = new Book();
        book1.title = "Atomic Habits";
        book1.author = "n/a";
        book1.pages = 300;
        book1.language = "English";

        Book book2 = new Book();
        book2.title = "Atomic Habits";
        book2.author = "n/a";
        book2.pages = 300;
        book2.language = "English";

        Student student1 = new Student();
        student1.firstName = "Jim";
        student1.lastName = "Halpert";
        student1.gpa = 2.3;
        student1.major = "Business";

        System.out.println(book1.pages | book2.pages);

        }
    }

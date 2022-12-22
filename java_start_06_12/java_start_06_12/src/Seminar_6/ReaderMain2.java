package Seminar_6;

public class ReaderMain2 {
    public static void main(String[] args) {
        Reader2 st1 = new Reader2();
        Reader2 st2 = new Reader2();

        Book book1 = new Book("Приключения", "Иооан Гассим");
        Book book2 = new Book("Словарь", "Даль");
        Book book3 = new Book("Энциклопедия", "Процевский");

        st1.setName("Иван");
        st1.setNumber(111);
        st1.setDate("25/09/1988");
        st1.setFacult("Библиография");
        st1.setPhone("0500005454");
        System.out.println("Студент " + st1.getName() + " с чит. билетом номер " + st1.getNumber() +
                " который учится на факультете " + st1.getFacult() + " зарегистрирован");
        System.out.println("Дата рождения: " + st1.getDate() + "; номер телефона: " + st1.getPhone());

        st2.setName("Сергей");
        st2.setNumber(222);
        st2.setDate("12/05/1987");
        st2.setFacult("Библиография");
        st2.setPhone("0500546974");
        System.out.println("Студент " + st2.getName() + " с чит. билетом номер " + st2.getNumber() +
                " который учится на факультете " + st2.getFacult() + " зарегистрирован");
        System.out.println("Дата рождения: " + st2.getDate() + "; номер телефона: " + st2.getPhone());
        System.out.println();

        st1.takeBook("Брат");
        st2.takeBook("Под прицелом", "Никита кожемяка");
        System.out.println();

        st1.returnBook("Код да-винчи");
        st2.returnBook("Игра престолов", "Властелин колец");
        System.out.println();

        st1.takeBook(book1, book2, book3);
        st1.returnBook(book1, book2, book3);
        System.out.println();

        st1.info();
        st2.info();
    }
}
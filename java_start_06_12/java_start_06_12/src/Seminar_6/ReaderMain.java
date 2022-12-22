package Seminar_6;

public class ReaderMain {
    public static void main(String[] args) {
        Reader st1 = new Reader();
        Reader st2 = new Reader();

        st1.setName("Иван");
        st1.setNumber(111);
        st1.setDate("25/09/1988");
        st1.setFacult("Библиография");
        st1.setPhone("0500905454");
        System.out.println("Студент " + st1.getName() + " с чит. билетом номер " + st1.getNumber() +
                " который учится на факультете " + st1.getFacult() + " зарегистрирован");
        System.out.println("Дата рождения: " + st1.getDate() + "; номер телефона: " + st1.getPhone());

        st2.setName("Sergey");
        st2.setNumber(222);
        st2.setDate("12/05/1987");
        st2.setFacult("Библиография");
        st2.setPhone("0510546974");
        System.out.println("Студент " + st2.getName() + " с чит. билетом номер " + st2.getNumber() +
                " который учится на факультете " + st2.getFacult() + " зарегистрирован");
        System.out.println("Дата рождения: " + st2.getDate() + "; номер телефона: " + st2.getPhone());

        st1.takeBook("Приключения");
        st1.takeBook("Словарь");
        st1.takeBook("Энциклопедия");

        st1.returnBook("Приключения");
        st1.returnBook("Словарь");
        st1.returnBook("Энциклопедия");

        st1.info();
        st2.info();
    }
}


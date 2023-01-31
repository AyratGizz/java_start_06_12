package OOP.seminar5.DZ_sem5.PhoneBook.Person;

public interface IPerson {
    void addNewPhone(String name, String phone);

    void removePhone(String name);

    void editPhone(String name, String phone);
}

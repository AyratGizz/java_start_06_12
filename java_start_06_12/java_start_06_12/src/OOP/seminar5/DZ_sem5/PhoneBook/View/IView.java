package OOP.seminar5.DZ_sem5.PhoneBook.View;

import OOP.seminar5.DZ_sem5.PhoneBook.Person.Person;

import java.util.HashSet;

public interface IView {
    void showContacts(HashSet<Person> listPersons);

    int choiceContacts(HashSet<Person> listPersons);

    void showPhoneList(Person person);

    int showMenu();

    String getName();

    int getIndex();

    String getPhone();

    String getComment();

    int choiceOperation();
}

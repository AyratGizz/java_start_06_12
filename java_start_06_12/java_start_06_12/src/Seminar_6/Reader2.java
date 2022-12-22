package Seminar_6;

import java.util.Arrays;

import Seminar_6.Book;

public class Reader2 {
    private String name;
    private int number;
    private String date;
    private String phone;
    private String facult;

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setFacult(String facult) {
        this.facult = facult;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getDate() {
        return date;
    }

    public String getPhone() {
        return phone;
    }

    public String getFacult() {
        return facult;
    }

    public void takeBook(String book) {
        System.out.println("Студент " + name + " взял книгу: " + book);
    }

    public void takeBook(String... book) {
        System.out.println("Студент " + name + " взял книги: " + Arrays.toString(book));
    }

    public void returnBook(String book) {
        System.out.println("Студент " + name + " вернул книгу: " + book);
    }

    public void returnBook(String... book) {
        System.out.println("Студент " + name + " вернул книги: " + Arrays.toString(book));
    }

    public void takeBook(Book... books) {
        System.out.println("Cтудент " + name + " взял книги: " + Arrays.toString(books));
    }

    public void returnBook(Book... books) {
        System.out.println("Cтудент " + name + " вернул книги: " + Arrays.toString(books));
    }

    public void info() {
        System.out.println(name + " " + number + " " + facult + " " + phone);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reader2 reader2 = (Reader2) o;

        if (number != reader2.number) return false;
        if (name != null ? !name.equals(reader2.name) : reader2.name != null) return false;
        if (date != null ? !date.equals(reader2.date) : reader2.date != null) return false;
        if (phone != null ? !phone.equals(reader2.phone) : reader2.phone != null) return false;
        return facult != null ? facult.equals(reader2.facult) : reader2.facult == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + number;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (facult != null ? facult.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Reader2{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", date='" + date + '\'' +
                ", phone='" + phone + '\'' +
                ", facult='" + facult + '\'' +
                '}';
    }
}
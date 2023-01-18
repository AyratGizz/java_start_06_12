package OOP.seminar1.DZ_seminar1;

public class Family {
    private String familyName;
    private String firstName;
    private int age;
    private String birthday;

    Family(String familyName, String firstName, int age, String birthday) {
        this.familyName = familyName;
        this.firstName = firstName;
        this.age = age;
        this.birthday = birthday;
    }

    Family() {
        this.age = 0;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getBirthday() {
        return birthday;
    }

    public int getAge() {
        return age;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }


    public void showInfo() {
        System.out.println("Фамилия: " + familyName);
        System.out.println("Имя: " + firstName);
        System.out.println("Возраст: " + age);
        System.out.println("Дата рождения: " + birthday);
    }
}

class Relaitive extends Family {
    private String relativeStatus;
    String parents;
    String children;

    public String getRelativeStatus() {
        return relativeStatus;
    }

    public void setRelativeStatus(String relativeStatus) {
        this.relativeStatus = relativeStatus;
    }


    Relaitive(String s) {
        super();
        setRelativeStatus(s);
    }

    Relaitive(String s, String famN, String firstN, int age, String birth) {
        super(famN, firstN, age, birth);
        setRelativeStatus(s);
    }

    void showStatus() {
        System.out.println("Статус: " + relativeStatus);
    }


}

class FamilyTree {
    public static void main(String[] args) {
        Relaitive p1 = new Relaitive("Отец", "Иванов", "Иван", 36, "10.10.1987");
        Relaitive p2 = new Relaitive("Мать", "Иванова", "Мария", 34, "16.06.1962");
        Relaitive s1 = new Relaitive("Сын", "Иванов", "Кирилл", 11, "10.11.2007");


        p1.showStatus();
        p1.showInfo();
        System.out.println("*************");
        p2.showStatus();
        p2.showInfo();
        System.out.println("*************");
        s1.showStatus();
        s1.showInfo();


    }
}
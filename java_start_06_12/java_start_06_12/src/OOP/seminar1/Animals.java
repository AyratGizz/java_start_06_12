package OOP.seminar1;

public class Animals {
    private String name;

    void speak() {
        System.out.println("Рыбка: К сожалению я не умею говорить");
    }

    String getName() {
        return this.name;
    }
}

class Cat extends Animals {
    @Override
    void speak() {
        System.out.println("Кошка говорит: Мяу");
    }
}

class Tests {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Animals fish = new Animals();
        cat.speak();
        fish.speak();
    }
}

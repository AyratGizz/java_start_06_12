package OOP.seminar1;

class TwoShape {
    private double height;
    private double width;

    TwoShape(double h, double w) {
        this.height = h;
        this.width = w;
    }

    TwoShape() {
        this.height = 0;
        this.width = 0;
    }

    TwoShape(double x) {
        this.height = this.width = x;
    }

    public double getHeight() {
        return height;
    }

    public double getWeidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeidth(double weidth) {
        this.width = weidth;
    }

    public void showInfo() {
        System.out.println("Высота: " + height);
        System.out.println("Ширина: " + width);
    }
}

class Triangle extends TwoShape {
    private String style;

    // Конструктор ниже
    Triangle(String s, double h, double w) {
        super(h, w); // Вызывает конструктор супер класса
        setStyle(s);

    }

    Triangle(String s) {
        super(); // Вызвывает конструктор супер класса по умолчанию
        setStyle(s);
    }

    Triangle(String s, double x) {
        super(x); // Вызывает конструктор супер класса с одним аргументом
        setStyle(s);
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    double area() {
        return getHeight() * getWeidth() / 2;
    }

    void ShowStyle() {
        System.out.println("Стиль: " + style);
    }
}

class Shapes {
    public static void main(String[] args) {
        // Использование созданного конструктора
        Triangle t1 = new Triangle("Закрышенный");
        Triangle t2 = new Triangle("Пустой", 5.0, 1.0);
        Triangle t3 = new Triangle("Пустой", 5.0);

        System.out.println("Информация о t1: ");
        t1.ShowStyle();
        t1.showInfo();
        System.out.println("Площадь: " + t1.area());

        System.out.println();

        System.out.println("Информация о t2:");
        t2.ShowStyle();
        t2.showInfo();
        System.out.println("Площадь: " + t2.area());

        System.out.println();

        System.out.println("Информация о t3:");
        t3.ShowStyle();
        t3.showInfo();
        System.out.println("Площадь: " + t3.area());

    }
}

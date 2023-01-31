package OOP.seminar5;

import OOP.seminar5.Console.View;
import OOP.seminar5.Model.SumCalc;
import OOP.seminar5.Presenter.Presenter;

public class Main {
    public static void main(String[] args) {
        Presenter app = new Presenter(new SumCalc(), new View());
        app.runOperation();
    }
}

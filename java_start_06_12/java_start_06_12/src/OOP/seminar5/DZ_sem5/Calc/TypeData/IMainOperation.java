package OOP.seminar5.DZ_sem5.Calc.TypeData;

public interface IMainOperation<T> {
    void summarize(T other);

    void subtraction(T other);

    void multiplication(T other);

    void division(T other);
}

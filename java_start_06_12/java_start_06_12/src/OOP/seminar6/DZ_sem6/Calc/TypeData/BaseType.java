package OOP.seminar6.DZ_sem6.Calc.TypeData;
/*
 * Создаём базовый класс вычислений
 * от которого наследуют классы Complex Rational
 * разбил общий интерфейс на четыре для каждой операции
 * */

import OOP.seminar6.DZ_sem6.Calc.TypeData.Interface.IDivision;
import OOP.seminar6.DZ_sem6.Calc.TypeData.Interface.IMultiplication;
import OOP.seminar6.DZ_sem6.Calc.TypeData.Interface.ISubtraction;
import OOP.seminar6.DZ_sem6.Calc.TypeData.Interface.ISummarize;

public class BaseType implements IMultiplication, IDivision, ISubtraction, ISummarize {
    @Override
    public void division(Object obj) {

    }

    @Override
    public void multiplication(Object obj) {

    }

    @Override
    public void subtraction(Object obj) {

    }

    @Override
    public void summarize(Object obj) {

    }
}

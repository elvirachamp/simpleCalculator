package ru.elvira.calculator._main;

import ru.elvira.calculator.service.ResultWriterService;
import ru.elvira.calculator.util.Calculator;

public class _Main {
    public static void main(String[] args) {
        int num1 = 99;
        int num2 = 2;
        int result1 = Calculator.addNum(num1, num2);//сумма
        ResultWriterService.printNum(num1, num2, result1, "Сумма");
        int result2 = Calculator.subtractNum(num1, num2);//разница
        ResultWriterService.printNum(num1, num2, result2, "Разница");
        int result3 = Calculator.productNum(num1, num2);//произведение
        ResultWriterService.printNum(num1, num2, result3, "Произведение");
    }
}

//1) в методе main() вызываем соответствующий
// метод калькулятора, передавая в него 2 числа для вычисления
// 2)из него получаем результат.
// 3)Затем вызываем метод класса вывода результата,и передаем в него 4 аргумента.
// 4) в него приходит 4 значения. используя эти параметры он печатает нам 2 начальных
// числа, результат, название операции (сложение, вычитание, умножение) в консоль, терминал.
//27. Вывод результата должен быть реализован с помощью конкатенаций внутри
// одного-единственного System.out.println(). (Соединять параметры можно с помощью
// пробела, например: "операция" + " " + num1 + ... и т.д.)
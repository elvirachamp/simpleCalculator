package ru.elvira.calculator.service;

public class ResultWriterService {
    public static void printNum(int number1, int number2, int result, String operation) {
        System.out.println(operation + " " + number1 + " " + "и" + " " + number2 + " " + "равно" + " " + result);
    }
}

// должен быть один метод - "напечатать результат", принимающий 4 параметра: 1 число,
// 2 число, результат, строку-название операции. например (int num1, int num2
// , int result, "произведение"). Используя эти 4 значения с помощью System.out.println()
// в этом методе печатаем результат в консоль.

package vsu.negulyaevPavelNikolaevich;

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

// 11 задание из task01

public class Main {

    public static double area(double cathetus) {
        double hypotenuse = Math.sqrt(cathetus * cathetus + cathetus * cathetus); // Находим гипотенузу ( Пифагор )
        double radius = hypotenuse / 2; // Радиус
        return Math.PI * radius * radius; // Возвращаем площадь окружности S = Pi * R^2
    }

    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);

        System.out.print("Enter the cathetus: ");

        Scanner Scanner = new Scanner(System.in); // Создание объекта сканнер класса сканнер

        double Cathetus = Scanner.nextDouble(); // Ввод данных с консоли

        if (Cathetus < 0) // проверка на введенные данные
            System.out.println("Impossible cathetus value");
        else
            System.out.println("Area of circle = " + (float)area(Cathetus)); // Тип данных флоат, "более грубое округление"
    }
}


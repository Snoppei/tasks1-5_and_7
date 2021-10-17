package vsu.negulyaevPavelNikolaevich;

import java.lang.Math;
import java.util.Locale;
import java.util.Scanner;

// 29 задание из task01

public class Main {

    public static void Area(double r1, double r2, double r3) {
        if (r1 > r2 || r2 > r3 || r1 > r3) // проверка на значения
            System.out.println("\nImpossible values!!!");

        else {
            double areaOfCircle1 = Math.PI * Math.pow(r1, 2); // Считаем площадь самого малого круга
            double areaOfCircle2 = Math.PI * Math.pow(r2, 2); // Площадь среднего круга
            double areaOfCircle3 = Math.PI * Math.pow(r3, 2); // Площадь большого круга
            double areaOfSquare = Math.pow(2 * r3, 2); // Площадь квадрата

            double areaOfExternalPart = 0.75 * (areaOfSquare - areaOfCircle3); // площадь "внешней" части между кругом и квадратом
            double areaOfInternalPart = 0.625 * (areaOfCircle2 - areaOfCircle1); // площадь "внутренней" части между окружностями

            System.out.println("\nShaded area = " + (float) (areaOfExternalPart + areaOfInternalPart)); // сумма площадей и
        }                                                                                               // вывод на экран
    }


    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);

        Scanner Scanner = new Scanner(System.in);
        System.out.print("\nEnter the small radius(r1): "); // вывод на консоль "интерфейса"
        double r1 = Scanner.nextDouble(); // ввод радиусов в консоль
        System.out.print("\nEnter the medium radius(r2): ");
        double r2 = Scanner.nextDouble();
        System.out.print("\nEnter the large radius(r3): ");
        double r3 = Scanner.nextDouble();

        Area(r1, r2, r3); // метод класса Main, описанный выше
    }
}

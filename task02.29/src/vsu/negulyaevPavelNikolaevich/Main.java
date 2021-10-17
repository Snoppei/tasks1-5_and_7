package vsu.negulyaevPavelNikolaevich;

import java.util.Scanner;


public class Main {

    public static int howMuchCakes(int priceOf1, int numberOf1, int priceOf2, int numberOf2, int money) {
        int CountOfCakes = 0; // инициализируем значение которое будем возвращать

        if (money < priceOf1 || money < priceOf2) //  если денег меньше чем цена торта 1 или 2 то возврат нуля
            return CountOfCakes;


        if (money >= priceOf1 + priceOf2) // если денег хватает на покупку хотя бы двух разных тортов
        {
            money = money - (priceOf1 + priceOf2); // СТАРТОВЫЕ УСЛОВИЯ
            numberOf1 = numberOf1 - 1;
            numberOf2 = numberOf2 - 1;
            CountOfCakes = 2;

            if (priceOf1 > priceOf2) { // выборка по типу что выгоднее покупать сначала ( здесь - ТОРТЫ 2 )
                while (money >= priceOf2) {
                    money = money - priceOf2;
                    CountOfCakes++;
                    numberOf2--;
                    if (numberOf2 == 0) break;
                }
                while (money >= priceOf1) { // докупка при наличии оставшихся денег
                    money = money - priceOf1;
                    CountOfCakes++;
                    numberOf1--;
                    if (numberOf1 == 0) break;
                }
            }


            if (priceOf1 <= priceOf2) { // выборка по типу что выгоднее покупать сначала (здесь - ТОРТЫ 1 ИЛИ РАВЕНСТВО)
                while (money >= priceOf1) {
                    money = money - priceOf1;
                    CountOfCakes++;
                    numberOf1--;
                    if (numberOf1 == 0) break;
                }
                while (money >= priceOf2) { // докупка при наличии денег
                    money = money - priceOf2;
                    CountOfCakes++;
                    numberOf2--;
                    if (numberOf2 == 0) break;
                }
            }
        }


        return CountOfCakes;
    }


        public static void main (String[]args){
            Scanner Scanner = new Scanner(System.in);
            System.out.print("Enter the price of first cake: "); // вывод
            int P1 = Scanner.nextInt(); // ввод
            System.out.print("Enter the summary of first cakes: "); // и т.д.
            int N1 = Scanner.nextInt();
            System.out.print("Enter the price of second cake: ");
            int P2 = Scanner.nextInt();
            System.out.print("Enter the summary of second cakes: ");
            int N2 = Scanner.nextInt();
            System.out.print("Enter the summary of your money: ");
            int M = Scanner.nextInt();


            System.out.print("Number of cakes you bought: " + howMuchCakes(P1, N1, P2, N2, M));
            // profit

        }
    }

package vsu.negulyaevPavelNikolaevich;

import java.util.Scanner;

public class Main {

    public static void tower(int w)
    {
        char dash = '-';
        char exclamationMark = '!';
        int сounter = w; // считает строчки восклицательных знаков чтобы потом их можно было определить какчетные или нечетные
        if (w < 3) System.out.printf("Impossible value%n"); // проверка на правильность введенных данных

        else {
            for(int i=0;;i++) {
                if (i % 2 == 0) {                                           // для "-"
                    for(int j = 0; j < w; j++) {
                        System.out.print(dash);
                        if (j + 1 == w) System.out.println();
                    }

                } else {                                                   // для "!"

                    for(int l = 0; l < сounter; l++) {
                        if(сounter % 2 != 0 && сounter != w && l == 0) { // отсев на нечетность строки + выборка самого первого символа НЕЧЕТНОЙ строки с !
                            for(int countOfSpaces = сounter; countOfSpaces - w < 0; countOfSpaces++) { // цикл на создание пробелов в нечетных строках с !
                            System.out.print(" "); }
                        }
                        System.out.print(exclamationMark);
                        if(l + 1 == сounter) {
                            System.out.println();
                        }

                    }
                    сounter--;

                }
                if(сounter == -1) System.out.println();
                if(сounter == -2) break;
            }
        }
    }

    public static void main(String[] args) {
/*        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();*/
        tower(19);
    }
}

package vsu.negulyaevPavelNikolaevich;
                                                                //task 04.24
import java.lang.Math;

public class Main {

    public static int[] arr = new int[1000]; // создаем массив

    public static int getDigit ( int number, int index ) { // ф-ция возвращает цифру числа по счету
        return (int)(number / Math.pow(10, index)) % 10; // счет СПРАВА НАЛЕВО по разрядам не 123 а 321
    }

    public static boolean isValueCorrect(int number) { // функция проверяет само число т.е 100<=x<=999
        if (number >= 100 && number < 999) return true;
        else return false;
    }

    public static boolean isNCorrect(int N){ // функция которая проверяет число N (счет)
        if(N <= 999) return true;
        else return false;
    }

    public static int getValue (int N) { // N - н-ое ПО СЧЕТУ
        if (!isNCorrect(N)) return 0;
        if(arr[0] == 0) { // заполнение массива в случае если он пустой
            int NUMBER = 100;
            for (int i = 0; i < 500; i++) { // итеррация по массиву
                for (; isValueCorrect(NUMBER);) // итеррация по числам
                {
                  if(       (getDigit(NUMBER, 1) == getDigit(NUMBER, 0) && getDigit(NUMBER, 0) != getDigit(NUMBER, 2))
                          ||(getDigit(NUMBER, 1) == getDigit(NUMBER, 2) && getDigit(NUMBER, 1) != getDigit(NUMBER, 0))
                          ||(getDigit(NUMBER, 0) == getDigit(NUMBER, 2) && getDigit(NUMBER, 0) != getDigit(NUMBER, 1)) ) {
                      arr[i] = NUMBER;
                      NUMBER++;
                      break;
                  } else {
                      NUMBER++;
                  }
                }
            }
        }
        return arr[N];
    }

    public static void main(String[] args) {

        for(int i = 0; i < 100; i++) {
            System.out.println(getValue(i));
        }

    }
}

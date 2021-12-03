package vsu.negulyaevPavelNikolaevich;

public class ArraySolutions {
    public static int subArrayLength;
    public static int positionOfFirstValueInSubArray;
    public static int[] primaryArray;
    public static int[] subArray;


    public static void solution(int[] mainArray){ // возвращает позицию первого элемента
            int count = 0, max = 1;                                            // подпоследовательности в осн. массиве
            int result = 0;
            for (int i = 1; i < mainArray.length; i++) {
                if (mainArray[i] >= mainArray[i - 1]) {
                    count++;
                }
                if(mainArray[i] < mainArray[i - 1]) {
                    count = 1;
                }

                if (count > max) {
                    result = i - max;
                    max = count;
                    continue;
                }

            }
            primaryArray = mainArray;
            positionOfFirstValueInSubArray = result;
            subArrayLength = max;

            int[] subArr = new int[subArrayLength];

            for (int i = 1, j = 0; i < mainArray.length; i++) {
                if (mainArray[i] >= mainArray[i - 1]) {
                    subArr[subArr.length-1] = mainArray[i]; // последний элемент массива не заполнялся, фикшено этой строкой
                    subArr[j] = mainArray[i - 1];
                    j++;
                    if(subArr.length == j+1) break;
                } else j = 0;
            }
            subArray = subArr;
        }
}




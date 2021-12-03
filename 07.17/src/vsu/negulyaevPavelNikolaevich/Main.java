package vsu.negulyaevPavelNikolaevich;

public class Main {

    public static int[] readIntArrayFromConsole() { // типа разработал метод для ввода массива с консоли?(что?)
        return cs.util.ArrayUtils.readIntArrayFromConsole();
    }

    public static void writeArrayToConsole(int[] array) { // выводит массив в консоль
        System.out.print("Вывод массива в консоль: ");
        for(int i = 0; i < array.length; i++) {
            if(i == array.length - 1) {
                System.out.print(array[i] + ";");
            }
            else System.out.print(array[i] + ", ");
        }
        System.out.println();
    }


    public static void test(int cases) { // тесты
        switch(cases){
            case 1:
                int[] array1 = {1, 2, 3, 4, 4, 6, 7, 8, 10, 8};
                ArraySolutions Test1 = new ArraySolutions();
                Test1.solution(array1);
                writeArrayToConsole(Test1.subArray);
                break;
            case 2:
                int[] array2 = {100, 252, 300, 0, 100, 252, 99929};
                ArraySolutions Test2 = new ArraySolutions();
                Test2.solution(array2);
                writeArrayToConsole(Test2.subArray);
                break;
            case 3:
                int[] array3 = {0, 1, 4, 9};
                ArraySolutions Test3 = new ArraySolutions();
                Test3.solution(array3);
                writeArrayToConsole(Test3.subArray);
                break;
            case 4:
                int[] array4 = {-1, -2, -3, -4, -5, 0, 25};
                ArraySolutions Test4 = new ArraySolutions();
                Test4.solution(array4);
                writeArrayToConsole(Test4.subArray);
                break;
            case 5:
                int[] array5 = {-1, 1, -1, 1, -1, 1, -1, 1};
                ArraySolutions Test5 = new ArraySolutions();
                Test5.solution(array5);
                writeArrayToConsole(Test5.subArray);
                break;
            case 6:
                int[] array6 = {10, 9, 8, 7, 6, 5, 4 ,3 ,2 ,1, 0};
                ArraySolutions Test6 = new ArraySolutions();
                Test6.solution(array6);
                writeArrayToConsole(Test6.subArray);
                break;
            case 7:
                int[] array7 = {5, 7, 9, 15, 13, 16, 999, 1, 2, 3 ,4 ,5 ,6, 7 , 8, 9, 10};
                ArraySolutions Test7 = new ArraySolutions();
                Test7.solution(array7);
                writeArrayToConsole(Test7.subArray);
                break;
            case 8:
                int[] array8 = {1};
                ArraySolutions Test8 = new ArraySolutions();
                Test8.solution(array8);
                writeArrayToConsole(Test8.subArray);
                break;
            case 9:
                int[] array9 = {1,2,3,4,5,6,7,8,9,10};
                ArraySolutions Test9 = new ArraySolutions();
                Test9.solution(array9);
                writeArrayToConsole(Test9.subArray);
                break;
            case 10:
                int[] array10 = {-1,-2,-3,-4,-5,-6,-7,-8};
                ArraySolutions Test10 = new ArraySolutions();
                Test10.solution(array10);
                writeArrayToConsole(Test10.subArray);
                break;
        }
    }


    public static void main(String[] args) {
        ArraySolutions arraySol = new ArraySolutions();
        test(1);
        test(2);
        test(3);
        test(4);
        test(5);
        test(6);
        test(7);
        test(8);
        test(9);
        test(10);
        arraySol.solution(readIntArrayFromConsole());
        System.out.println("---------------------------");
        writeArrayToConsole(arraySol.primaryArray);
        System.out.println("---------------------------");
        writeArrayToConsole(arraySol.subArray);
        System.out.println("---------------------------");
        System.out.println(arraySol.positionOfFirstValueInSubArray);
        System.out.println("---------------------------");
        System.out.println(arraySol.subArrayLength);
    }
}

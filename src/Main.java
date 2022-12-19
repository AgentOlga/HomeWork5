import java.awt.image.ConvolveOp;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        //Объявите три массива:
        //Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.
        // Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
        // Произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.
        task2();
        // Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую. В конце строки запятую ставить не надо.
        task3();
        // Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую. В конце строки запятую ставить не надо.
        task4();
        // Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        //Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания используйте циклы.
        //Распечатайте результат преобразования в консоль.


    }

    public static void task1() {
        int[] numbersArray = new int[]{1, 2, 3};
        double[] secondArray = {1.57, 7.654, 9.986};
        long [] thirdArray = new long [36];
    }

    public static void task2() {
        System.out.println("Задача 2");

        int[] numbersArray = new int[]{1, 2, 3};
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.print(numbersArray[i]);

            if (i != numbersArray.length - 1) {
                System.out.print((", "));
            }
        }
        System.out.println();

        double[] secondArray = {1.57, 7.654, 9.986};
        for (int i = 0; i < secondArray.length; i++) {

            System.out.print(secondArray[i]);

            if (i != secondArray.length - 1) {
                System.out.print((", "));
            }
        }
        System.out.println();

        long [] thirdArray = new long [36];
        for (int i = 0; i < thirdArray.length; i++) {
            System.out.print(thirdArray[i]);

            if (i != thirdArray.length - 1) {

                System.out.print((", "));
            }
        }
        System.out.println();


    }

    public static void task3() {
        System.out.println("Задача 3");

        int[] numbersArray = new int[]{1, 2, 3};
        for (int i = numbersArray.length - 1; i >= 0; i--) {
            System.out.print(numbersArray[i]);

            if (i != 0) {
                System.out.print((", "));
            }
        }
        System.out.println();

        double[] secondArray = {1.57, 7.654, 9.986};
        for (int i = secondArray.length - 1; i >= 0; i--) {

            System.out.print(secondArray[i]);

            if (i != 0) {
                System.out.print((", "));
            }
        }
        System.out.println();

        long[] thirdArray = new long[36];

        for (int i = thirdArray.length - 1; i >= 0; i--) {
            System.out.print(thirdArray[i]);

            if (i != 0) {
                System.out.print((", "));
            }
        }

        System.out.println();
    }
    public static void task4() {
        System.out.println ("Задача 4");
        int[] numbersArray = new int[]{1, 2, 3};
        for (int i = 0; i <= numbersArray.length-1; i++) {
            if (numbersArray[i] % 2 != 0) {
                numbersArray[i]++;
            }
        }
        System.out.println(Arrays.toString(numbersArray));


    }


}





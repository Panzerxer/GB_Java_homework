import java.util.Arrays;
import java.util.Collection;

import static kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.*;

public class lesson_3 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5(1, 555);
        task6();
        task7();
        task8(7);
    }

    //Первое задание
    public static void task1() {
        int[] first;
        first = new int[10];
        //наполняем массив
        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) {
                first[i] = 1;
            } else {
                first[i] = 0;
            }
        }
        //заменяем значения
        for (int i = 0; i < 10; i++) {
            if (first[i] == 0) {
                first[i] = 1;
            } else {
                first[i] = 0;
            }
        }
    }

    //Второе задание
    public static void task2() {
        int[] t2;
        t2 = new int[100];
        //наполняем массив
        for (int i = 0; i < t2.length; i++) {
            t2[i] = i + 1;
        }

    }

    //Третье задание
    public static void task3() {
        int[] t3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < t3.length; i++) {
            if (t3[i] < 6) {
                t3[i] = t3[i] * 2;
            } else {
                t3[i] = t3[i];
            }
        }

    }

    //Четвертое задание
    public static void task4() {
        int a = 7;
        int c = a;
        int[][] t4;
        t4 = new int[a][c];
        for (int i = 0; i < t4.length; i++) {
            for (int j = 0; j < t4[i].length; j++)
                if (i == j) {
                    t4[i][j] = 1;

                } else if (j == t4.length - i - 1) {
                    t4[i][j] = 1;
                }
            String text = Arrays.toString(t4[i]);
            System.out.println(text);

        }

    }

    //Пятое задание
    public static void task5(int len, int initialValue) {

        int[] t5;
        t5 = new int[len];
        for (int i = 0; i < t5.length; i++) {
            t5[i] = initialValue;

        }
        System.out.println(Arrays.toString(t5));
    }

    //Шестое задание
    public static void task6() {
        int[] t6 = {1, 4, 3, 2, 5, 76, 5, -2, 2, 4, 56};
        int a = t6[0];
        int b = t6[0];
        for (int i = 1; i < t6.length; i++) {
            if (a < t6[i]) {
                a = t6[i];
            } else if (b > t6[i]) {
                b = t6[i];
            }

        }
        System.out.println("Наибольшее число: " + a);
        System.out.println("Наименьшее число: " + b);
    }

    //Седьмое задание
    public static void task7() {
        int[] t7 = {1, 1, 1, 1, 1, 1, 2};

        int a;

            for (a = 1; a < t7.length; a++)

            {
                int sumLeft = 0;
                int sumRight = 0;

                for (int i = 0; i < a; i++) {
                    sumLeft = sumLeft + t7[i];
                }
                for (int j = a; j < t7.length; j++) {
                    sumRight = sumRight + t7[j];
                }
                if(sumLeft == sumRight){
                    System.out.println(true);
                }

            }




    }

    //Восьмое задание
    public static void task8(int s) {

        int t8[] = {1,2,3,4,5,6,7};


        if (s > 0){

            for (int i = 0; i < s; i++) {
                int t = t8[0];
                t8[0] = t8[t8.length - 1];
                for (int j = 1; j < (t8.length - 1); j++) {
                    t8[t8.length - j] = t8[t8.length - j - 1];
                }
                t8[1] = t;
            }
        }
        else{
            for (int i = 0; i > s; i--) {
                int t = t8[t8.length - 1];
                t8[t8.length - 1] = t8[0];
                for (int j = 1; j < (t8.length - 1); j++) {
                    t8[j - 1] = t8[j];
                }
                t8[t8.length - 2] = t;
            }
        }
        System.out.println(Arrays.toString(t8));
    }
}






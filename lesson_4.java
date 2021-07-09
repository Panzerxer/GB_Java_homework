import javax.crypto.spec.PSource;
import java.util.Random;
import java.util.Scanner;

public class lesson_4 {
    public static void main(String[] args) {
        initMap();
        printMap();
        while (true){
            humanTurn();
            printMap();
            if (checkWin(dX)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()){
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(d0)) {
                System.out.println("Победил Компьютер");
                break;
            }
            if (isMapFull()){
                System.out.println("Ничья");
                break;
            }

        }
        System.out.println("Игра закончена");

    }
    public static char [][] map;
    public static final int size = 4;
    public static final int winDots = 4;
    public static final char empty = '_';
    public static final char dX = 'X';
    public static final char d0 = '0';

    public static void initMap(){
        map = new char[size][size];
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                map[i][j] = empty;
            }
        }
    }
    public static void printMap(){
        for (int i = 0; i <= size; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < size; i++){
            System.out.print((i + 1) + " ");
            for (int j = 0; j < size; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= size || y < 0 || y >= size) return false;
        if (map[y][x] == empty) return true;
        return false;
    }
    public static Scanner sc = new Scanner(System.in);
    public static void humanTurn(){
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
            }
        while (!isCellValid(x, y));
        map[y][x] = dX;
    }
    public static Random rnd = new Random();
    public static void aiTurn(){
        int x, y;
        do {
            x = rnd.nextInt(size);
            y = rnd.nextInt(size);
        }
        while (!isCellValid(x, y));
        map[y][x] = d0;
        System.out.println("Компьютер пошел в точку " + (x + 1) + " " + (y + 1));
    }
    public static boolean checkWin(char symb) {
        if (checkWin2(symb)) return true; //горизонтали
        if (checkWin3(symb)) return true; //вертикали
        if (checkWin4(symb)) return true; //диагонали
        return false;
    }
    public static boolean checkWin2(char symb) {

        for (int i = 0; i < size; i++){
            int sum = 0;
            for (int j = 0; j < size; j++){

                sum = sum + map[i][j];
            }
            if (winDots == sum/symb && sum%symb == 0) return true;

        }

           return false;
    }
    public static boolean checkWin3(char symb) {

        for (int i = 0; i < size; i++){
            int sum = 0;
            for (int j = 0; j < size; j++){

                sum = sum + map[j][i];
            }
            if (winDots == sum/symb && sum%symb == 0) return true;


        }

        return false;
    }
    public static boolean checkWin4(char symb) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + map [i][i];
        }
        if (winDots == sum/symb && sum%symb == 0) return true;
        int sum2 = 0;
        for (int i = 0; i < winDots; i++) {
            sum2 = sum2 + map [i][size - 1 - i];
        }
        if (winDots == sum2/symb && sum%symb == 0) return true;
        return false;

    }

    public static boolean isMapFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == empty) return false;
            }
        }
        return true;
    }


}

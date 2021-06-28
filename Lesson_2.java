public class Lesson_2 {
    public static void main(String[] args) {
        sumCheck(4, 15);
        plusminusCheck(-7);
        sighCheck(-1);
        StringRepeat(1, "wasted");
        visogod(2000);
    }

    public static void sumCheck(int a, int b) {

        int s = (a + b);
        if (s < 10) {
            System.out.println("false");
        } else if (s > 20) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }

    public static void plusminusCheck(int a) {
        if (a >= 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }
    }

    public static void sighCheck(int a) {
        if (a >= 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }

    public static void StringRepeat(int count, String message) {
        int counter = 0;
        while (counter < count) {
            System.out.println(message);
            counter++;
        }


    }

    public static void visogod(double z) {
        double a = (z / 4);
        double b = (z / 100);
        double c = (z / 400);
        if (a % 1== 0) {
            if (b % 1 == 0) {
                if (c % 1 == 0) {
                    System.out.println("Високосный");
                } else {
                    System.out.println("Не високосный");
                }
            } else {
                System.out.println("Високосный");
            }

        } else {
            System.out.println("Не високосный");
        }

    }
}
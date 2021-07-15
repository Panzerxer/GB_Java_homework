package Lesson_6;

public class Cats extends Animals{

    Cats(int swim, int run) {
        super(swim, run);
        this.maxrun = 200;
        this.maxswim = 0;

        if (run > maxrun){
            System.out.println(run + " cлишком далеко для кота! Не больше " + maxrun);
        }
        else System.out.println("Кот пробежал " + run);

        System.out.println("Кот не плавает");
    }
}

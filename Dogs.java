package Lesson_6;

public class Dogs extends Animals{



    Dogs(int swim, int run) {
        super(swim, run);

        this.maxrun = 500;
        this. maxswim = 10;

        if (run > maxrun){
            System.out.println(run + " cлишком далеко для собаки! Не больше " + maxrun);
        }
        else System.out.println("Собака пробежала " + run);
        if (run > maxswim){
            System.out.println(swim + " cлишком далеко для собаки! Не больше " + maxswim);
        }
        else System.out.println("Собака проплыла " + swim);

    }

}



package Lesson_5;

public class Main {
    public static void main(String[] args) {
        empArray();



    }
    public static void empArray(){
        Employee[] emparr = new Employee[5];
        emparr[0] = new Employee("ewf","efwef","23f2f3","3f23f", 234234, 23);
        emparr[1] = new Employee("ehterhwf","efwef","23f2f3","3f23f", 234234, 46);
        emparr[2] = new Employee("eerherhwf","ewetfwef","23f2f3","3f23f", 234234, 74);
        emparr[3] = new Employee("ewerhef","efwef","23f2f3","3f23f", 234234, 35);
        emparr[4] = new Employee("ewwetwf","eftwwef","23f2f3","3f23f", 234234, 41);

        System.out.println("Весь персонал");
        for (int i = 0; i < emparr.length; i++) {
            emparr[i].printer();
        }
        System.out.println("Старше 40 лет");
        for (int i = 0; i < emparr.length; i++) {
            emparr[i].printerold();
        }
    }


}







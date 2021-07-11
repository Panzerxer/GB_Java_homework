package Lesson_5;

public class Employee {
   String fullname;
    String position;
    String email;
    String phone;
    int sallary;
    int age;


    Employee(String newfullname, String newposition, String newemail, String newphone, int newsallary, int newage){
        fullname = newfullname;
        position = newposition;
        email = newemail;
        phone = newphone;
        sallary = newsallary;
        age = newage;

    }
    void printer(){
        System.out.println(fullname + " " + position + " " + email + " " + phone + " " + sallary + " " + age);
        System.out.println();
    }
    void printerold(){

        if (age > 40){
            System.out.println(fullname + " " + position + " " + email + " " + phone + " " + sallary + " " + age);
        }

    }

}

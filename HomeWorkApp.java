public class HomeWorkApp {
    public static void main(String[] args){
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords(){
        String a = ("_Orange\n");
        String b = ("_Banana\n");
        String c = ("_Apple\n");
        System.out.print(a);
        System.out.print(b);
        System.out.print(c);
    }
     public static void checkSumSign(){
       int  a = 4;
       int  b = -4;

       int s = (a + b);

        if (s >= 0){
            System.out.println("Сумма положительная");
         }
        else {
             System.out.println("Сумма отрицательная");
         }

     }
     public static void printColor(){
        int value = 0;
       if(value <= 0){
           System.out.println("Красный");
       }
      else if(value > 100){
           System.out.println("Зеленый");
       }
      else {
          System.out.println("Желтый");
       }


     }
     public static void compareNumbers(){
         int a = -7;
         int b = 7;
         if(a >= b){
             System.out.println("a>=b");
         }
         else{
             System.out.println("a<b");
         }

     }
}

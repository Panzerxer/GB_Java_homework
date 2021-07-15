package Lesson_6;
public class Main {
    public static void main(String[] args) {
      Creator creator = new Creator();

      Cats cat = creator.newCat(224);
      Dogs dog = creator.newDog(343535,33);
      Dogs dog2 = creator.newDog(343535,33);
      Dogs dog3 = creator.newDog(343535,33);
      Dogs dog4 = creator.newDog(343535,33);
      Dogs dog5 = creator.newDog(343535,33);


        System.out.println("Животных всего: " + creator.getAnimals());
      System.out.println("Собак всего: " + creator.getDogs());
      System.out.println("Кошек всего: " + creator.getCats());

    }
}







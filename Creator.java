package Lesson_6;

public class Creator {
   private int animals;
   private int dogs;
   private int cats;

   public Creator(){
       animals = 0;
       dogs = 0;
       cats = 0;
       }
       public Cats newCat(int run){
       Cats cat = new Cats(0, run);
       animals++;
       cats++;
       return cat;
       }
       public Dogs newDog(int swim, int run){
       Dogs dog = new Dogs(swim, run);
       animals++;
       dogs++;
       return dog;
       }
       public int getAnimals() {return animals;
           }
    public int getDogs() {return dogs;
        }
    public int getCats() {return cats;
        }
   }


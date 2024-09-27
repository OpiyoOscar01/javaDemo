public class Dog  extends Animal {
   public Dog(String name) {

   }
   public void eat(){
      System.out.println("Dog eat");
   }

   public static void main(String[] args) {
      Dog d = new Dog("Dog");
      d.eat();
      d.makeSound();
   }

}

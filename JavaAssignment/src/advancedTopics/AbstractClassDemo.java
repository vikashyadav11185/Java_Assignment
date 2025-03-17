package advancedTopics;
//Define an abstract class
abstract class Man {
 abstract void sound(); // Abstract method

 void sleep() { // Concrete method
     System.out.println(" This type of Man is sleeping.");
 }
}

class Father extends Man {
 @Override
 void sound() {
     System.out.println("Father scold son!");
 }
}

public class AbstractClassDemo {
 public static void main(String[] args) {
     Father father = new Father();
     father.sound();   
     father.sleep();   
 }
}

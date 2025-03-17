package advancedTopics;
//Define an interface
interface Animal {
 void sound(); // abstract method (no body)
}

//Implementing the interface
class Dog implements Animal {
 @Override
 public void sound() {
 }
}

class Cat implements Animal {
 @Override
 public void sound() {
     System.out.println("Cat meows!");
 }
}

public class InterfaceDemo {
 public static void main(String[] args) {
     Animal dog = new Dog();
     dog.sound(); 

     Animal cat = new Cat();
     cat.sound(); 
 }
}

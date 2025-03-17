package oops;
//Parent class Game
class Game {
 // Method with no parameters (overridden by child class)
 void play() {
     System.out.println("Playing a game...");
 }
 
 // Overloaded method with one parameter (number of players)
 void play(int players) {
     System.out.println("Playing a game with " + players + " players.");
 }

 // Overloaded method with two parameters (number of players and duration)
 void play(int players, double duration) {
     System.out.println("Playing a game with " + players + " players for " + duration + " hours.");
 }
}

//Child class Badminton
class Badminton extends Game {
 // Overriding the play() method from the Game class
 @Override
 void play() {
     System.out.println("Playing Badminton!");
 }
 
 // Overloading the play() method with one parameter (number of players)
 @Override
 void play(int players) {
     System.out.println("Playing Badminton with " + players + " players!");
 }
 
 // Overloading the play() method with two parameters (number of players and duration)
 @Override
 void play(int players, double duration) {
     System.out.println("Playing Badminton with " + players + " players for " + duration + " hours!");
 }
}

public class Polymorphism {
 public static void main(String[] args) {
     // Create instances of the Game class and Badminton class
     Game game1 = new Game();
     Badminton badmintonGame = new Badminton();

     // Demonstrating polymorphism and method overloading and overriding

     // Calling the method from Game class (parent)
     game1.play();  // Outputs: Playing a game...
     game1.play(2);  // Outputs: Playing a game with 2 players.
     game1.play(2, 1.5);  // Outputs: Playing a game with 2 players for 1.5 hours.

     // Calling the overridden method in the Badminton class (child)
     badmintonGame.play();  // Outputs: Playing Badminton!
     badmintonGame.play(2);  // Outputs: Playing Badminton with 2 players!
     badmintonGame.play(2, 1.5);  // Outputs: Playing Badminton with 2 players for 1.5 hours!
 }
}

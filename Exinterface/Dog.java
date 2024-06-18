package Exinterface;

public class Dog implements Animal, Pet {
 private String name;

 public Dog(String name) {
     this.name = name;
 }

 @Override
 public void eat() {
     System.out.println(name + " is eating.");
 }

 @Override
 public void sleep() {
     System.out.println(name + " is sleeping.");
 }

 @Override
 public void play() {
     System.out.println(name + " is playing.");
 }

 @Override
 public void beFriendly() {
     System.out.println(name + " is being friendly.");
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }
}


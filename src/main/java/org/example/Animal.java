package org.example;

 public class Animal {
        public void eat() {
            System.out.println("This animal eats food.");
        }
    }

    class Dog extends Animal {
        public void bark() {
            System.out.println("The dog barks.");
        }

        public static void main(String[] args) {
            Dog dog = new Dog();
            dog.eat();  // Inherited method
            dog.bark(); // Method of Dog class
        }
    }



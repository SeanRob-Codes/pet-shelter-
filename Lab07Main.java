/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab07;

import java.util.ArrayList;
import java.util.Random;

// Lab07Main.java
// Sean Robinson
// Lab 07: Pet Shelter Program using Inheritance
// This program creates and displays random Pet objects (Dogs, Cats, Birds).

public class Lab07Main {
    public static void main(String[] args) {
        System.out.println("Pet Shelter Program\n");

        ArrayList<Pet> petShelter = new ArrayList<>();
        Random rand = new Random();

        // Create 30 random pets
        for (int i = 0; i < 30; i++) {
            int num = 1 + rand.nextInt(10);
            if (num % 3 == 0)
                petShelter.add(new Dog());
            else if (num % 2 == 0)
                petShelter.add(new Cat());
            else
                petShelter.add(new Bird());
        }

        int dogCount = 0, catCount = 0, birdCount = 0;

        System.out.println("=== Pet Shelter Information ===");
        for (Pet p : petShelter) {
            p.displayInfo();
            System.out.println("----------------------");

            if (p instanceof Dog) dogCount++;
            if (p instanceof Cat) catCount++;
            if (p instanceof Bird) birdCount++;
        }

        System.out.println("Dogs: " + dogCount + ", Cats: " + catCount + ", Birds: " + birdCount);

        // Dog details
        System.out.println("\nCat-Chasing Dogs:");
        for (Pet p : petShelter) {
            if (p instanceof Dog && ((Dog)p).isCatChaser())
                System.out.println(p.getPetID());
        }

        // Cat details
        System.out.println("\nCats older than 10:");
        for (Pet p : petShelter) {
            if (p instanceof Cat && p.getAge() > 10)
                System.out.println(p.getPetID());
        }

        // Bird details
        System.out.println("\nMulticolor Birds:");
        for (Pet p : petShelter) {
            if (p instanceof Bird && ((Bird)p).getColor().equals("MULTICOLOR"))
                System.out.println(p.getPetID());
        }
    }
}

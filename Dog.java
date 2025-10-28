/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab07;

import java.util.Random;

// Dog.java
// Sean Robinson
// Lab 07: Dog
// Extends Pet with dog-specific traits.

public class Dog extends Pet {
    private double barkVolume;
    private double growlVolume;
    private boolean catChaser;

    public Dog() {
        super("DOG");  // ✅ This line fixes your constructor error
        Random rand = new Random();

        setAge(rand.nextInt(30));                // 0–29
        setHeight(4 + rand.nextDouble() * 36);   // 4–40
        setWeight(1 + rand.nextDouble() * 342);  // 1–343
        barkVolume = rand.nextDouble() * 113.1;  // 0–113.1
        growlVolume = barkVolume / 2;
        catChaser = rand.nextBoolean();
    }

    public double getBarkVolume() { return barkVolume; }
    public double getGrowlVolume() { return growlVolume; }
    public boolean isCatChaser() { return catChaser; }

    public void setBarkVolume(double barkVolume) { this.barkVolume = barkVolume; }
    public void setGrowlVolume(double growlVolume) { this.growlVolume = growlVolume; }
    public void setCatChaser(boolean catChaser) { this.catChaser = catChaser; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bark Volume: " + barkVolume);
        System.out.println("Growl Volume: " + growlVolume);
        System.out.println("Cat Chaser: " + catChaser);
    }
}

    
package lab07;

import java.util.Random;

// Cat.java
// Sean Robinson
// Lab 07: Cat
// Extends Pet with cat-specific traits.

public class Cat extends Pet {
    private double purrVolume;
    private double meowVolume;

    public Cat() {
        super("CAT");  // ✅ Calls Pet(String type)
        Random rand = new Random();

        // Inherited Pet attributes
        setAge(rand.nextInt(39));             // 0–38
        setHeight(8 + rand.nextDouble() * 2); // 8–10
        setWeight(6 + rand.nextDouble() * 6); // 6–12

        // Cat-specific
        purrVolume = rand.nextDouble() * 67.8;
        meowVolume = purrVolume * 1.35;
    }

    public double getPurrVolume() { return purrVolume; }
    public double getMeowVolume() { return meowVolume; }
    public void setPurrVolume(double purrVolume) { this.purrVolume = purrVolume; }
    public void setMeowVolume(double meowVolume) { this.meowVolume = meowVolume; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Purr Volume: " + purrVolume);
        System.out.println("Meow Volume: " + meowVolume);
    }
}


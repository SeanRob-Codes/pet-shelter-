/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab07;

/**
 *
 * @author seanb
 */
class Pet {
    private final String petID;
    private String type = "Pet";
    private int age;
    private double height;
    private double weight;
    private static int lastAssignedPetID = 100;

    // Constructor
    public Pet(String type) {
        lastAssignedPetID++;
        this.type = type;
        this.petID = type + lastAssignedPetID;
    }

    // Getters
    public String getPetID() { return petID; }
    public String getType() { return type; }
    public int getAge() { return age; }
    public double getHeight() { return height; }
    public double getWeight() { return weight; }

    // Setters
    public void setType(String type) { this.type = type; }
    public void setAge(int age) { this.age = age; }
    public void setHeight(double height) { this.height = height; }
    public void setWeight(double weight) { this.weight = weight; }

    // Display method (✅ real code, replaces UnsupportedOperationException)
    public void displayInfo() {
        System.out.println(petID + ": " + type);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
    }
}


    
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animal;

/**
 *
 * @author fazad
 */
public class Animal {
   
    private final boolean vegetarian;
    private final String eats;
    private final int noOfLegs;

    // Konstruktor
    public Animal(boolean vegetarian, String eats, int noOfLegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
    }

    // Getter
    public boolean isVegetarian() {
        return vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }
}

// Kelas Rabbit yang merupakan turunan dari Animal
class Rabbit extends Animal {
    private final String color;
    private final String name;

    // Konstruktor
    public Rabbit(String name, boolean veg, String food, int legs, String color) {
        super(veg, food, legs);
        this.name = name;
        this.color = color;
    }

    // Getter
    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}

// Class Main yang terpisah
class Main {
    public static void main(String[] args) {
        // Membuat objek Rabbit
        Rabbit peter = new Rabbit("Peter", false, "grass", 4, "grey");

        // Menampilkan informasi mengenai Rabbit
        System.out.println("Hello, His name is " + peter.getName());
        System.out.println(peter.getName() + " is Vegetarian? " + peter.isVegetarian());
        System.out.println(peter.getName() + " eats " + peter.getEats());
        System.out.println(peter.getName() + " has " + peter.getNoOfLegs() + " legs.");
        System.out.println(peter.getName() + " color is " + peter.getColor());
    }
}
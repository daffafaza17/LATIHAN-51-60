/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan57;

import javax.lang.model.SourceVersion;

/**
 *
 * @author fazad
 */

    public class PBOlat57vehicle {

    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }

   

    
}
   // Membuat interface Vehicle
interface Vehicle {
    void changeGear(int newValue);
    void speedUp(int increment);
    void applyBrakes(int decrement);
}

// Membuat kelas Bicycle
class Bicycle implements Vehicle {
    // Atribut
    private final String brand;
    private final String model;
    private int gearCount;
    private int speed;

    // Konstruktor
    public Bicycle(String brand, String model, int gearCount) {
        this.brand = brand;
        this.model = model;
        this.gearCount = gearCount;
        this.speed = 0;
    }

    // Method
    @Override
    public void changeGear(int newValue) {
        gearCount = newValue;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getGearCount() {
        return gearCount;
    }

    public int getSpeed() {
        return speed;
    }
}

// Membuat kelas Skateboard
class Skateboard implements Vehicle {
    // Atribut
    private final String brand;
    private final String model;
    private final int boardLength;
    private int speed;

    // Konstruktor
    public Skateboard(String brand, String model, int boardLength) {
        this.brand = brand;
        this.model = model;
        this.boardLength = boardLength;
        this.speed = 0;
    }

    // Method
    @Override
    public void changeGear(int newValue) {
        // Tidak ada gear pada skateboard
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getBoardLength() {
        return boardLength;
    }

    public int getSpeed() {
        return speed;
    }
}

    class main {

        public main() {
        }
    }

// Membuat kelas utama
class PBOlat57Vehicle {
    public static void main(String[] args) {
        // Membuat objek bicycle
        Bicycle bicycle = new Bicycle("Trek Bike", "7.4FX", 23);
        // Menampilkan informasi bicycle
        System.out.println("Bicycle");
        System.out.println("Brand: " + bicycle.getBrand());
        System.out.println("Model: " + bicycle.getModel());
        System.out.println("Jumlah Gear: " + bicycle.getGearCount());
        System.out.println("Kecepatan: " + bicycle.getSpeed());
        // Memanggil method changeGear, speedUp, dan applyBrakes dari kelas Bicycle
        bicycle.changeGear(24);
        bicycle.speedUp(10);
        bicycle.applyBrakes(5);
        // Menampilkan informasi bicycle setelah perubahan
        System.out.println("Bicycle");
        System.out.println("Brand: " + bicycle.getBrand());
        System.out.println("Model: " + bicycle.getModel());
        System.out.println("Jumlah Gear: " + bicycle.getGearCount());
        System.out.println("Kecepatan: " + bicycle.getSpeed());
        System.out.println(); // Membuat baris baru

        // Membuat objek skateboard
        Skateboard skateboard = new Skateboard("Ally Skate", "Rocket", 54);
        // Menampilkan informasi skateboard
        System.out.println("Skateboard");
        System.out.println("Brand: " + skateboard.getBrand());
        System.out.println("Model: " + skateboard.getModel());
        System.out.println("Panjangnya Board: " + skateboard.getBoardLength());
        System.out.println("Kecepatan: " + skateboard.getSpeed());
        // Memanggil method speedUp dan applyBrakes dari kelas Skateboard
        skateboard.speedUp(15);
        skateboard.applyBrakes(10);
        // Menampilkan informasi skateboard setelah perubahan
        System.out.println("Skateboard");
        System.out.println("Brand: " + skateboard.getBrand());
        System.out.println("Model: " + skateboard.getModel());
        System.out.println("Panjangnya Board: " + skateboard.getBoardLength());
        System.out.println("Kecepatan: " + skateboard.getSpeed());
    }
}
    
    


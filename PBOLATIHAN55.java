/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan55;

/**
 *
 * @author fazad
 */
class PBOLATIHAN55 {
    
     private final String manufaktur = "Poco F3";
    private final String os = "Android";
    private final String model = "Grand";
    private final int harga = 3000000;
    private final String androidKeyStore = "234ibfd3840fo";

    public void displayProduct() {
        System.out.println("Manufaktur: " + manufaktur);
        System.out.println("OS: " + os);
        System.out.println("Model: " + model);
        System.out.println("Harga: " + harga);
        System.out.println("Android Key Store: " + androidKeyStore);
    }

    public static void main(String[] args) {
        PBOLATIHAN55 hp = new PBOLATIHAN55();
        hp.displayProduct();
    }
}


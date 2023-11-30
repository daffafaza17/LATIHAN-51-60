/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan51;

import java.util.Scanner;

/**
 *FAZA DAFFA HAIDAR
 * 22166032
 * SISTEM INFORMASI
 * @author fazad
 */
public class LATIHAN51 {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==== Program Perhitungan Gaji Karyawan ====");
        System.out.print("Masukkan NIK: ");
        String nik = input.nextLine();

        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Golongan (1/2/3): ");
        int golongan = input.nextInt();

        System.out.print("Masukkan Jabatan (Manager/Kabag): ");
        input.nextLine(); // Membuang newline
        String jabatan = input.nextLine();

        System.out.print("Masukkan Jumlah Kehadiran : ");
        int kehadiran = input.nextInt();

        double tunjanganGolongan = 0;
        switch (golongan) {
            case 1 -> tunjanganGolongan = 500000;
            case 2 -> tunjanganGolongan = 1000000;
            case 3 -> tunjanganGolongan = 1500000;
            default -> {
        }
        }

        double tunjanganJabatan = 0;
        if (jabatan.equalsIgnoreCase("Manager")) {
            tunjanganJabatan = 2000000;
        } else if (jabatan.equalsIgnoreCase("Kabag")) {
            tunjanganJabatan = 1000000;
        }

        double tunjanganKehadiran = kehadiran * 10000;

        double gajiTotal = tunjanganGolongan + tunjanganJabatan + tunjanganKehadiran;

        System.out.println("\nHasil Perhitungan----");
        System.out.println("NIK          : " + nik);
        System.out.println("NAMA         : " + nama);
        System.out.println("GOLONGAN     : " + golongan);
        System.out.println("JABATAN      : " + jabatan);
        System.out.println("TUNJANGAN GOLONGAN  : " + tunjanganGolongan);
        System.out.println("TUNJANGAN JABATAN   : " + tunjanganJabatan);
        System.out.println("TUNJANGAN KEHADIRAN : " + tunjanganKehadiran);
        System.out.println("GAJI TOTAL   : " + gajiTotal);

  }
}
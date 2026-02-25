/*
Nama: Zalikhah Khairunnisa
NIM: D1041241018
Tanggal: 25/02/2026

Sumber: https://www.youtube.com/watch?v=h5O4TDUUZSs
*/
package Pertemuan7.Latihan123dan4_Pertemuan7;
import java.util.Scanner;

public class LatihanValidasi {
    public static void main(String[] args) {
        System.out.println("=== VALIDASI NILAI UJIAN ===");
        System.out.println();
        int nilai; // Deklarasi nilai untuk diinputkan user
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Percobaan input: ");
            nilai = input.nextInt(); // Melakukan input dari user
            
            if (nilai >= 0 && nilai <= 100) { // Cek apakah nilai valid atau tidak
                System.out.println("Nilai valid: " + nilai);
                System.out.println();
            } else {
                System.out.println("Error: Nilai harus antara 0-100!");
                System.out.println();
            }
        } while (nilai >= 0 || nilai <= 100);
    }
}
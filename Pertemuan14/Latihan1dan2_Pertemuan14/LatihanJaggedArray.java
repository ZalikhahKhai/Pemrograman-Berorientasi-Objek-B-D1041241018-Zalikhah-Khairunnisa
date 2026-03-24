/*
Nama: Zalikhah Khairunnisa
NIM: D1041241018
Tanggal: 24/03/2026  
*/
package Pertemuan14.Latihan1dan2_Pertemuan14;

public class LatihanJaggedArray {
    public static void main(String[] args) {
        // Inisialisasi jagged array
        int[][] data = {
            {10, 20}, // Masing-masing baris memiliki jumlah kolom yang berbeda
            {30, 40, 50, 60},
            {70, 80, 90}
        };

        System.out.println("=== JAGGED ARRAY ===");
        for (int i = 0; i < data.length; i++) { // Loop pertama mengakses jumlah baris
            System.out.print("Baris " + i + " (" + data[i].length + " elemen): ");
            for (int j = 0; j < data[i].length; j++) { // Loop kedua mengakses jumlah kolom dalam baris
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}

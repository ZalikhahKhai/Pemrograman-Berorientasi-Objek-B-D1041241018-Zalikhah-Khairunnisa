/*
Nama: Zalikhah Khairunnisa
NIM: D1041241018
Tanggal: 24/03/2026  
*/
package Pertemuan14.Latihan1dan2_Pertemuan14;

public class LatihanArray2DSederhana {
    public static void main(String[] args) {
        // Inisialisasi array dua dimensi
        int[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("=== TABEL 3x3 ===");
        for (int i = 0; i < data.length; i++) { // Loop pertama mengakses jumlah baris 
            for (int j = 0; j < data[i].length; j++) { // Loop kedua mengakses jumlah kolom dalam baris
                System.out.print(data[i][j] + "      ");
            }
            System.out.println();
        }
    }
}

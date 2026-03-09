/*
Nama: Zalikhah Khairunnisa
NIM: D1041241018
Tanggal: 09/03/2026  
*/
package Pertemuan9.Latihan12dan3_Pertemuan9;

class Persegi {
    // Atribut yang digunakan untuk class Persegi
    int sisi;
    int luas;
    int keliling;

    // Method yang digunakan untuk menghitung luas Persegi
    public void hitungLuas() {
        luas = sisi * sisi;
    }
    
    // Method yang digunakan untuk menghitung keliling Persegi
    public void hitungKeliling() {
        keliling = 4 * sisi;
    }
    
    // Method yang digunakan untuk menampilkan hasil perhitungan Persegi
    public void tampilkanHasil() {
        System.out.println("=== PERSEGI ===");
        System.out.println();
        System.out.println("Sisi    : " + sisi + " cm");
        System.out.println();
        System.out.println("Luas    : " + luas + " cm2");
        System.out.println();
        System.out.println("Keliling: " + keliling + " cm");
        System.out.println();
    }
}

public class ClassPersegi {
    public static void main (String[] args) {
        // Membuat data persegi ke-1
        Persegi hitungPersegi = new Persegi();
        hitungPersegi.sisi = 5;

        // Menghitung luas persegi
        hitungPersegi.hitungLuas();
        // Menghitung keliling persegi
        hitungPersegi.hitungKeliling();
        // Menampilkan hasil perhitungan persegi sekarang
        hitungPersegi.tampilkanHasil();
    }
}
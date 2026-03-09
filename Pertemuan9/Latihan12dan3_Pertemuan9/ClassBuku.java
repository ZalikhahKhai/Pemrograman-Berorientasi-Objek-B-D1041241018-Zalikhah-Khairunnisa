/*
Nama: Zalikhah Khairunnisa
NIM: D1041241018
Tanggal: 09/03/2026  
*/
package Pertemuan9.Latihan12dan3_Pertemuan9;

class Buku {
    // Atribut yang digunakan untuk class Buku
    String nama;
    String pengarang;
    int harga;

    // Method yang digunakan untuk class Buku
    public void tampilkanInfo() {
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println();
        System.out.println("Judul       : " + nama);
        System.out.println();
        System.out.println("Pengarang   : " + pengarang);
        System.out.println();
        System.out.println("Harga       : Rp " + harga);
        System.out.println();
    }
}

public class ClassBuku {
    public static void main(String[] args) {
        // Membuat data buku ke-1
        Buku bk1 = new Buku();
        bk1.nama = "Pemrograman Java";
        bk1.pengarang = "Budi Raharjo";
        bk1.harga = 125000;

        // Membuat data buku ke-2
        Buku bk2 = new Buku();
        bk2.nama = "Algoritma dan Struktur Data";
        bk2.pengarang = "Rinaldi Munir";
        bk2.harga = 150000;

        // Menampilkan informasi data buku ke-1 dan ke-2
        bk1.tampilkanInfo();
        System.out.println();
        bk2.tampilkanInfo();
    }
}
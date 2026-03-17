/*
Nama: Zalikhah Khairunnisa
NIM: D1041241018
Tanggal: 17/03/2026  
*/
package Pertemuan11.Latihan12dan3_Pertemuan11;

class Produk {
    // Atribut yang digunakan untuk class Produk
    String namaProduk;
    int harga;
    int stok;

    // Constructor 1, parameter hanya nama dan harga
    public Produk(String namaProduk, int harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        stok = 0;
    }

    // Constructor 2, dengan semua parameter
    public Produk(String namaProduk, int harga, int stok) {
       this.namaProduk = namaProduk;
       this.harga = harga;
       this.stok = stok;
    }

    // Method untuk menampilkan informasi produk
    public void tampilkanInfo() {
        System.out.println("=== INFORMASI PRODUK ===");
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga       : Rp " + harga);
        System.out.println("Stok        : " + stok);
        System.out.println();
    }
}

public class LatihanProdukOverloading {
    public static void main(String[] args) {
        // Object 1, isi dengan nama dan harga >> constructor ke-1
        Produk produk1 = new Produk("Laptop ASUS", 8500000);
        produk1.tampilkanInfo();

        // Object 2, isi dengan semua parameter >> constructor ke-2
        Produk produk2 = new Produk("Mouse Logitech", 250000, 50);
        produk2.tampilkanInfo();
    }
}

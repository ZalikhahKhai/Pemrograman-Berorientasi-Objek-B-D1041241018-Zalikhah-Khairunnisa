/*
Nama: Zalikhah Khairunnisa
NIM: D1041241018
Tanggal: 17/03/2026  
*/
package Pertemuan11.Latihan12dan3_Pertemuan11;

class PersegiPanjang {
    // Atribut yang digunakan untuk class PersegiPanjang
    int panjang;
    int lebar;
    int luas;
    int keliling;

    // Constructor 1, parameter hanya menggunakan sisi (inisialisasi saat membuat parameter)
    public PersegiPanjang(int sisi) {
        this.panjang = sisi;
        this.lebar = sisi;
        this.luas = panjang * lebar;
        this.keliling = 2 * (panjang + lebar);
    }

    // Constructor 2, parameter menggunakan panjang dan lebar
    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.luas = panjang * lebar;
        this.keliling = 2 * (panjang + lebar);
    }

    // Method untuk menampilkan persegi
    public void tampilkanInfo() {
        System.out.println("=== PERSEGI ===");
        System.out.println("Panjang : " + panjang + " cm");
        System.out.println("Lebar   : " + lebar + " cm");
        System.out.println("Luas    : " + luas + " cm2");
        System.out.println("Keliling: " + keliling + " cm");
        System.out.println();
    }
}

public class LatihanPersegiOverloading {
    public static void main(String[] args) {
        // Object 1, isi dengan sisi >> constructor ke-1
        PersegiPanjang persegi1 = new PersegiPanjang(5);
        persegi1.tampilkanInfo();

        // Object 2, isi dengan panjang dan lebar >> constructor ke-2
        PersegiPanjang persegi2 = new PersegiPanjang(8, 4);
        persegi2.tampilkanInfo();
    }
}

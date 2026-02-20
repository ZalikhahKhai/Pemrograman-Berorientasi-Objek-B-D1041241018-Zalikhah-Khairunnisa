/*
Nama: Zalikhah Khairunnisa
NIM: D1041241018
Tanggal: 20/02/2026  
*/
package Pertemuan9;

class Mobil {
        String nama;
        String warna;
        int tahun;
        int kecepatan;

        public void percepat() {
            System.out.println("Kecepatan   : " + kecepatan);
        }

        public void tampilkanInfo() {
            System.out.println("Nama        : " + nama);
            System.out.println("Warna       : " + warna);
            System.out.println("Tahun       : " + tahun);
            System.out.println("Kecepatan   : " + kecepatan);
        }
    }

public class ObjectdanClass {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        mobil1.nama = "Kijang";
        mobil1.warna = "Hijau";
        mobil1.tahun = 1990;
        mobil1.kecepatan = 80;
        
        mobil1.tampilkanInfo();
    }
}


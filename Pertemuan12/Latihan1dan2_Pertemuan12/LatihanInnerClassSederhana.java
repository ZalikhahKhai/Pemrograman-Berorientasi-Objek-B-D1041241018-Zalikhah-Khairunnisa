/*
Nama: Zalikhah Khairunnisa
NIM: D1041241018
Tanggal: 23/03/2026  
*/
package Pertemuan12.Latihan1dan2_Pertemuan12;

class Sekolah {
    // Membuat atribut untuk outer class yang berisi nama sekolah
    String namaSekolah;

    Sekolah(String namaSekolah) {
        this.namaSekolah = namaSekolah;
    }

    class Kelas {
        // Membuat atribut untuk inner class yang berisi nama kelas
        String namaKelas;

        Kelas(String namaKelas) {
            this.namaKelas = namaKelas;
        }

        // Method untuk menampilkan nama sekolah dan nama kelas
        void info() {
            System.out.println("Sekolah : " + namaSekolah);
            System.out.println("Kelas   : " + namaKelas);
        }
    }
}

public class LatihanInnerClassSederhana {
    public static void main(String[] args) {
        // Awali dengan membuat object dari outer class
        Sekolah skl = new Sekolah("SMA Negeri 1");

        // Dilanjutkan dengan membuat object dari inner class 
        // yang membutuhkan object dari outer class
        Sekolah.Kelas kls = skl.new Kelas("X-A");

        // Menampilkan output nama sekolah dan nama kelas
        kls.info();
        System.out.println();
    }
}

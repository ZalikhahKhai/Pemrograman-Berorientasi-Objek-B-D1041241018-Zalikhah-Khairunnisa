/*
Nama: Zalikhah Khairunnisa
NIM: D1041241018
Tanggal: 23/03/2026  
*/
package Pertemuan12.Latihan1dan2_Pertemuan12;

class Mahasiswa {
    static int jumlahMahasiswa = 0; // Static attribute 
    String nama; // Non-static attribute

    // Construct untuk menambah jumlah mahasiswa setiap ada object yang baru dibuat
    public Mahasiswa(String nama) {
        this.nama = nama;
        jumlahMahasiswa++;
        System.out.println("Mahasiswa dibuat: " + nama);
    }

    // Static method yang digunakan untuk mengembalikan jumlah mahasiswa
    static int getJumlah() {
        return jumlahMahasiswa;
    }
}

public class LatihanStaticCounter {
    public static void main(String[] args) {
        // Menambahkan object mahasiswa ke-1, ke-2, dan ke-3
        Mahasiswa mhs1 = new Mahasiswa("Andi");
        Mahasiswa mhs2 = new Mahasiswa("Budi");
        Mahasiswa mhs3 = new Mahasiswa("Citra");

        System.out.println();
        // Mengeluarkan output sesuai dengan jumlah object yang telah ditambahkan
        System.out.println("Total Mahasiswa: " + Mahasiswa.getJumlah());
    }
}

/*
Nama: Zalikhah Khairunnisa
NIM: D1041241018
Tanggal: 13/02/2026  
*/
package Pertemuan3.Latihan1dan2_Pertemuan3;

public class LatihPerhitungan {
    public static void main(String[] args) {
        int saldo = 1000000;
        System.out.println("Saldo Awal          : " + saldo);
        int setoran = 500000;
        System.out.println("Setoran             : " + setoran);
        saldo += setoran;
        System.out.println("Saldo Setelah Setor : " + saldo);
        int penarikan = 250000;
        System.out.println("Penarikan           : " + penarikan);
        saldo -= penarikan;
        System.out.println("Saldo Akhir         : " + saldo);
    }
}
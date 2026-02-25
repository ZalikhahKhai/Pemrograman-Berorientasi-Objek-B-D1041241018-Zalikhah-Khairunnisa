/*
Nama: Zalikhah Khairunnisa
NIM: D1041241018
Tanggal: 25/02/2026  
*/
package Pertemuan6.Latihan12dan3_Pertemuan6;

public class LatihanRestoran {
    public static void main(String[] args) {
        System.out.println("=== MENU RESTORAN ===");
        int menuCode = 1; // Deklarasi dan inisialisasi kode menu
        int quantity = 2; // Deklarasi dan inisialisasi jumlah pesanan
        int hargaMenu; // Deklarasi harga menu

        System.out.println("Kode Menu: " + menuCode);
        System.out.println("Jumlah: " + quantity);
        System.out.println();
        System.out.println("Pesanan Anda:");

        switch (menuCode) {
            case 1:
                hargaMenu = 15000; // Harga menu yang berbeda pada setiap case
                System.out.println("Nama Menu: Nasi Goreng");
                System.out.println("Harga Satuan: Rp " + hargaMenu);
                System.out.println("Jumlah: " + quantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp " + hargaMenu * quantity);
                break;
            case 2:
                hargaMenu = 12000;
                System.out.println("Nama Menu: Mie Ayam");
                System.out.println("Harga Satuan: Rp " + hargaMenu);
                System.out.println("Jumlah: " + quantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp " + hargaMenu * quantity);
                break;
            case 3:
                hargaMenu = 10000;
                System.out.println("Nama Menu: Bakso");
                System.out.println("Harga Satuan: Rp " + hargaMenu);
                System.out.println("Jumlah: " + quantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp " + hargaMenu * quantity);
                break;
            case 4:
                hargaMenu = 13000;
                System.out.println("Nama Menu: Soto Ayam");
                System.out.println("Harga Satuan: Rp " + hargaMenu);
                System.out.println("Jumlah: " + quantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp " + hargaMenu * quantity);
                break;
            case 5:
                hargaMenu = 3000;
                System.out.println("Nama Menu: Es Teh");
                System.out.println("Harga Satuan: Rp " + hargaMenu);
                System.out.println("Jumlah: " + quantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp " + hargaMenu * quantity);
                break;
            default: // Digunakan untuk validasi
                System.out.println("Menu tidak tersedia!");
                break;
        }
    }
}

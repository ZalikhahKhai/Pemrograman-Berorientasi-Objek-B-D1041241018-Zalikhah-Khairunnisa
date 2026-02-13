/*
Nama: Zalikhah Khairunnisa
NIM: D1041241018
Tanggal: 13/02/2026  
*/
package Pertemuan4;

public class p042OperatorAritmatika {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println();

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        double hasil = (double) a / b;
        System.out.println("a / b (desimal) = " + hasil);
    }
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9;

/**
 *
 * @author 
 * Nama : Zidane Saeful Budiman
 * Kelas : TI-1A
 * NIM : A2.1900197
 */
public class Latihan5 {
    int jumlahKambing = 88;


public void getJumlahKambing() {
    System.out.println("Jumlah kambing: " +jumlahKambing);
}

public void tambahKambing() {
    jumlahKambing = jumlahKambing + 5;
    System.out.println("Jumlah kambing setelah ditambah: " +jumlahKambing);
}

public static void main(String[] args) {
    Latihan5 kambingSusu = new Latihan5();
    
    kambingSusu.getJumlahKambing();
    kambingSusu.tambahKambing();
    kambingSusu.getJumlahKambing();
    
    }
}


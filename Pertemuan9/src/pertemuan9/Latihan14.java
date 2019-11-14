/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9;

/**
 *
 * @author
 * Nama : Zidane Saeful Budiman
 * Kelas : TI - 1A
 * NIM : A2.1900197
 */
public class Latihan14 {
    public static void main(String[] args){
    int a = 60;
    int b = 13;
    int c = 0;
    c = a & b;
    System.out.println("a & b = " + c);
    
    c = a | b;
    System.out.println("a | b = " + c);
    
    c = a ^ b;
    System.out.println("a ^ b = " + c);
    
    c = ~a;
    System.out.println("~a = " + c);
    
    c = a << 2;
    System.out.println("a << 2 = " + c);
    
    c = a >> 2;
    System.out.println("a >> 2 = " + c);
    }
}

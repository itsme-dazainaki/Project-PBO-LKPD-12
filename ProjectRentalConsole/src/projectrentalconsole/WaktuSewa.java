/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrentalconsole;
import java.util.Scanner;
/**
 *
 * @author Radaza Putri
 */
public class WaktuSewa {
    int tglpinjam, blnpinjam, thnpinjam; 
    int tglkembali, blnkembali, thnkembali;
    Scanner input = new Scanner(System.in);
    
    void pinjam(){
        System.out.println();
        System.out.print("Masukkan Tanggal Peminjaman (Tanggal 1-31)   : ");
        tglpinjam = input.nextInt();
        System.out.print("Masukkan Bulan Peminjaman (Bulan 1 -12)      : ");
        blnpinjam= input.nextInt();
        System.out.print("Masukkan Tahun Peminjaman (YYYY)             : ");
        thnpinjam = input.nextInt();
    }
    
    void kembali(){
        System.out.println();
        System.out.print("Masukkan Tanggal Pengembalian (Tanggal 1-31) : ");
        tglkembali = input.nextInt();
        System.out.print("Masukkan Bulan Pengembalian (Bulan 1 -12)    : ");
        blnkembali= input.nextInt();
        System.out.print("Masukkan Tahun Pengembalian (YYYY)           : ");
        thnkembali = input.nextInt();
    }
}

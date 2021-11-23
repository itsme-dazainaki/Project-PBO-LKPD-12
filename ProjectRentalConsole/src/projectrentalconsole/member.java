/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrentalconsole;

/**
 *
 * @author Radaza Putri
 */
public class member {
    //deklarasikan attribut
    String idMember, namaMember, jenisMember;
    
    //untuk menampung id, nama, jenis member
    member(String id, String nama, String jenis){
        this.idMember = id;
        this.namaMember = nama;
        this.jenisMember = jenis;
    }
    
    //method untuk menampilkan data dari member
    void print(){
        System.out.println();
        System.out.println("+---------------- Data Member ----------------+");
        System.out.println("ID Member            : " + this.idMember);
        System.out.println("Nama Member          : " + this.namaMember);
        System.out.println("Jenis Member         : " + this.jenisMember);
    }
}

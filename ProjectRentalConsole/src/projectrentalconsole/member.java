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
    String idMember, namaMember, jenisMember;
    
    member(String id, String nama, String jenis){
        this.idMember = id;
        this.namaMember = nama;
        this.jenisMember = jenis;
    }
    
    void print(){
        System.out.println();
        System.out.println("+---------------- Data Member ----------------+");
        System.out.println("ID Member            : " + this.idMember);
        System.out.println("Nama Member          : " + this.namaMember);
        System.out.println("Jenis Member         : " + this.jenisMember);
    }
}

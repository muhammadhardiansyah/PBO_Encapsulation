/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newrentalconsole;

/**
 *
 * @author asus
 */
import java.util.ArrayList;
public class Member {
    //atribut
    protected String IDMember, Nama, JenisMember;
    
    //konstruktor
    Member(String ID, String nama, String jenis){
        this.IDMember = ID;
        this.Nama = nama;
        this.JenisMember = jenis;
    }
    
    //method untuk menampilkan object
    public void print(){
        System.out.println("ID Member               : " + this.IDMember);
        System.out.println("Nama Member             : " + this.Nama);
        System.out.println("Jenis Member            : " + this.JenisMember);
    }
}

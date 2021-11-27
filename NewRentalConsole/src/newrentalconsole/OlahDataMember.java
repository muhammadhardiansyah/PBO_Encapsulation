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
public class OlahDataMember {
    //atribut untuk melakukan operasi
    //Instansiasi arraylist
    ArrayList<Member> dataMember = new ArrayList<Member>();
    
    //menambahkan 
    public void setMember(Member Data) {
        this.dataMember.add(Data);
    }
    
    //Cek ID Member
    public boolean getID(String ID){
        boolean founded = false;
        int index = -1;
        for (int i=0; i<this.dataMember.size();i++){
            if (this.dataMember.get(i).IDMember.equals(ID)){
                index = i;
                founded = true;
            }
        }
        return founded;
    }
    
    
    //cari member
    public void getMember(String ID){
        boolean founded = false;
        int index = -1;
        for (int i=0; i<this.dataMember.size();i++){
            if (this.dataMember.get(i).IDMember.equals(ID)){
                index = i;
                founded = true;
            }
        }
        if (founded = true){
            this.dataMember.get(index).print();
        } else {
            System.out.println("Data Member tidak ditemukan");
        }
    }
    
    public int getIndex(String ID){
        int index = -1;
        for (int i=0; i<this.dataMember.size();i++){
            if (this.dataMember.get(i).IDMember.equals(ID)){
                index = i;
            }
        }
        return index;
    }
            
}

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
import java.util.Scanner;
public class NewRentalConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instansiasi olahdatamember dan menambahkan member sekaligus
        OlahDataMember olah = new OlahDataMember();
        olah.setMember(new Member("M001","Mr.X","Silver"));
        olah.setMember(new Member("M002","Mr.Y","Gold"));
        olah.setMember(new Member("M003","Mr.Z","Platinum"));

        //instansiasi input
        InputTime time = new InputTime();
        
        //perulangan jika hasil ID salah
        String IDMember;
        while (true){
            String ID = time.setID();
            boolean cek = olah.getID(ID);
            if (cek == true){
                IDMember = ID;
                break;
            } else {
                System.out.println(ID + " tidak ditemukan. Masukan lagi.");
            }
        }
        //set Lama Sewa
        time.setLamaSewa();
        
        //Output ID
        System.out.println("");
        olah.getMember(IDMember);
        //Output waktu
        time.getWaktuSewa();
        
        //Output biaya
        String jenis = olah.dataMember.get(olah.getIndex(IDMember)).JenisMember;
        switch (jenis) {
            case "Silver":
                BenefitSilver silver = new BenefitSilver();
                silver.getBiaya(time.getLamaSewa());
                break;
            case "Gold":
                BenefitGold gold = new BenefitGold();
                gold.getBiaya(time.getLamaSewa());
                break;
            case "Platinum":
                BenefitPlatinum plat = new BenefitPlatinum();
                plat.getBiaya(time.getLamaSewa());
        }
        
    }
    
    
}

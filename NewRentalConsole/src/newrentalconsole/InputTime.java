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
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
public class InputTime{
    //instansiasi scanner
    Scanner input = new Scanner(System.in);
    //instansiasi olahdata
    OlahDataMember olah = new OlahDataMember();
    //pembatas jika salah
    private void br(){
        System.out.println("---------------------------------");
    }
    //ID Member
    protected String setID(){
        System.out.print("Masukan ID                    : ");
        String ID = input.nextLine();
        return ID;     
    }
    private int setTglPinjam(){
        int TglPinjam;
        while (true){
            System.out.print("Masukan Tanggal Pinjam (1-31) : ");
            Integer TglPinjm = input.nextInt();
            if (TglPinjm < 1){
                this.br();
                System.out.println("Tanggal salah. Masukan kembali.");
                this.br();
            }
            else if (TglPinjm > 31){
                this.br();
                System.out.println("Tanggal salah. Masukan kembali.");
                this.br();
            }
            else {
               TglPinjam = TglPinjm;
               break;
            }
        }
        return TglPinjam;
    }
    private int setBulanPinjam(){
        int BulanPinjam;
        while (true){
            System.out.print("Masukan Bulan Pinjam (1-12)   : ");
            Integer inputBulan = input.nextInt();
            if (inputBulan < 1){
                this.br();
                System.out.println("Bulan salah. Masukan kembali.");
                this.br();
            } else if (inputBulan > 12) {
                this.br();
                System.out.println("Bulan salah. Masukan kembali.");
                this.br();
            } else {
                BulanPinjam = inputBulan;
                break;
            }
        }
        return BulanPinjam;  
    }
    private int setTahunPinjam(){
        int TahunPinjam;
        while (true) {
            System.out.print("Masukan Tahun Pinjam          : ");
            TahunPinjam = input.nextInt();
            if (TahunPinjam > 0){
                break;
            } else {
                this.br();
                System.out.println("Tahun pinjam tidak valid.");
                this.br();
            }
        }
        
        return TahunPinjam;
    }
    private int setTanggalKembali(){
        int TanggalKembali;
        while (true){
            System.out.print("Masukan tanggal kembali (1-31): ");
            Integer inputTgl = input.nextInt();
            if (inputTgl < 1){
                this.br();
                System.out.println("Tanggal salah. Masukan kembali.");
                this.br();
            } else if (inputTgl > 31){
                this.br();
                System.out.println("Tanggal salah. Masukan kembali.");
                this.br();
            } else {
                TanggalKembali = inputTgl;
                break;
            }
        }
        return TanggalKembali;
    }
    private int setBulanKembali (){
        int BulanKembali;
        while (true){
            System.out.print("Masukan bulan kembali (1-12)  : ");
            Integer inputBln = input.nextInt();
            if (inputBln < 1 | inputBln>31){
                this.br();
                System.out.println("Bulan salah. Masukan kembali.");
                this.br();
            } else if (inputBln > 31){
                this.br();
                System.out.println("Bulan salah. Masukan kembali.");
                this.br();
            } else {
                BulanKembali = inputBln;
                break;
            }
        }
        return BulanKembali;
    }
    private int setTahunKembali(){
        int TahunKembali;
        while (true) {
            System.out.print("Masukan Tahun Pinjam          : ");
            TahunKembali = input.nextInt();
            if (TahunKembali > 0){
                break;
            } else {
                this.br();
                System.out.println("Tahun kembali tidak valid.");
                this.br();
            }
        }
        return TahunKembali;
    }
    
    private LocalDate waktuPinjam, waktuKembali;
    private int lamaSewa;
    public void setLamaSewa(){
        while (true){
            int tglPinjam = this.setTglPinjam();
            int blnPinjam = this.setBulanPinjam();
            int thnPinjam = this.setTahunPinjam();
            this.waktuPinjam = LocalDate.of(thnPinjam, blnPinjam, tglPinjam);

            int tglKembali = this.setTanggalKembali();
            int blnKembali = this.setBulanKembali();
            int thnKembali = this.setTahunKembali();
            this.waktuKembali = LocalDate.of(thnKembali, blnKembali, tglKembali);

            this.lamaSewa = (int) ChronoUnit.DAYS.between(this.waktuPinjam, this.waktuKembali);
            if (this.lamaSewa < 1){
                this.br();
                System.out.println("Waktu peminjaman tidak valid. Pinjam minimal 1 hari.");
                this.br();
            } else {
                break;
            }
        }
        
    }
    
    public int getLamaSewa(){
        return this.lamaSewa;
    }
    
    public void getWaktuSewa(){
        System.out.println("");
        System.out.println("Tanggal Pinjam          : " + this.waktuPinjam );
        System.out.println("Tanggal Kembali         : "  + this.waktuKembali);
        System.out.println("Lama Sewa               : "  + this.lamaSewa + " hari");
        System.out.println("");
    }
}

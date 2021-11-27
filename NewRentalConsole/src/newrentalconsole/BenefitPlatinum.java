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
public final class BenefitPlatinum extends BenefitGold{
    private double biayaSewa = 45000; 
    private double diskon = 3;
    private int point = 10;
    private int cashback = 10000;
    private int pulsa = 5000;
    
    protected double biayasewa(int lamaSewa){
        this.biayaSewa *= lamaSewa;
        return biayaSewa;
    }
    
    protected double diskon(){
        double disc = (this.diskon/100) * this.biayaSewa;
        this.biayaSewa -= disc;
        return  this.biayaSewa; 
    }
    
    protected int point(int lamaSewa){ 
        this.point *= lamaSewa; 
        return this.point; //perhari
    }
    
    protected int bonusPulsa(int lamaSewa){
        this.pulsa *= lamaSewa;
        return this.pulsa;
    }
    
    public void getBiaya(int lamaSewa){
        this.biayasewa(lamaSewa);
        this.biayaSewa = this.diskon();
        int point = this.point(lamaSewa);
        this.pulsa = this.bonusPulsa(lamaSewa);
        System.out.println("Total Sewa              : Rp. " + this.biayaSewa);
        System.out.println("Jumlah Poin             : " + point);
        System.out.println("Jumlah Cashback         : Rp. " + this.cashback);
        System.out.println("Bonus Pulsa             : Rp. " + this.pulsa);
    }
}

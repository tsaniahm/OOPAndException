/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPAndException123190095;

/**
 *
 * @author ASUS
 */
public class Segitiga extends BangunDatar{
    int alas,tinggi,sisi,sisi2,c;

    public Segitiga(int alas, int tinggi, int sisi, int sisi2) {
       
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
        this.sisi2 = sisi2;
  
    }
   
    @Override
    double luas(){
        return 0.5*alas*tinggi;
    }
   
    @Override
    double keliling(){
        
        return alas+sisi+sisi2;
    }
}

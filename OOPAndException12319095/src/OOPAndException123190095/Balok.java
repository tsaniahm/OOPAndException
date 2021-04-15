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
public class Balok extends BangunRuang{
     int panjang,lebar, tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    
    
    @Override
    double luas(){
        return panjang*lebar;
    }
    
    @Override
    double keliling(){
        return 2*(panjang*lebar);
    }
    
    @Override
    double volume(){
        return panjang*lebar*tinggi;
    }
    
    @Override
    double luaspermukaan(){
        return 2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
    }
    
}

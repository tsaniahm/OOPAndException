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
public class Kubus extends BangunRuang{
    int sisi;

    public Kubus(int sisi) {
        this.sisi = sisi;
    }
    
    @Override
    double luas(){
        return sisi*sisi;
    }
    
    @Override
    double keliling(){
        return sisi*4;
    }
    
    @Override
    double volume(){
        return sisi*sisi*sisi;
    }
    
    @Override
    double luaspermukaan(){
        return sisi*sisi*6;
    }
   
}

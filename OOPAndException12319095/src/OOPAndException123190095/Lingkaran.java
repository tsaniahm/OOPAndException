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
public class Lingkaran extends BangunDatar{
    int r;

    public Lingkaran(int r) {
        this.r = r;
    }
    
    @Override
   double luas(){
       return Math.PI*r*r;
   }
   
    @Override
   double keliling(){
       return Math.PI*r*2;
   }
}

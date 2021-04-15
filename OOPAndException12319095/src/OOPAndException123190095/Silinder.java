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
public class Silinder extends BangunRuang{
    int r, t;

    public Silinder(int r, int t) {
        this.r = r;
        this.t = t;
    }
    
    @Override
    double luas(){
        return Math.PI*r*r;
    }

    @Override
    double keliling(){
        return Math.PI*r*2;
    }
    
    @Override
    double volume(){
        return Math.PI*r*r*t;
    }
    
    @Override
    double luaspermukaan(){
        return Math.PI*r*2*t;
    }
    
}

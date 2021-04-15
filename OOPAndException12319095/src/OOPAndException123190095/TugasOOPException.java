/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPAndException123190095;

import static java.lang.System.exit;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class TugasOOPException {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TSANIAH MUNFIDAH
        //123190095
        
        Scanner input = new Scanner(System.in);
        char loop;
        
        do{
        int choose = 0;
        System.out.println("Menu");
        System.out.println("1. Persegi");
        System.out.println("2. Lingkaran");
        System.out.println("3. Persegi Panjang");
        System.out.println("4. Segitiga");
        System.out.println("5. Kubus");
        System.out.println("6. Silinder");
        System.out.println("7. Balok");
        System.out.println("8. Sudahi Saja");
        System.out.print("Pilih : ");
        try{
        choose = input.nextInt();
        }catch(InputMismatchException error){
            System.out.println("ERROR, INPUTAN YANG ANDA MASUKKAN BUKAN BERUPA ANGKA!!");
             loop = input.next().charAt(0);
        }finally{
       
        switch (choose){
            case 1 -> persegi();
            case 2 -> lingkaran();
            case 3 -> persegiPanjang();
            case 4 -> segitiga();
            case 5 -> kubus();
            case 6 -> silinder();
            case 7 -> balok();
            case 8 -> exit(0);
            
        }
         System.out.print("\nMau Ulang? (y/n)  ");
         loop = input.next().charAt(0);
        }
        
        }while(loop == 'y' || loop == 'Y');
    }
    
    public static void persegi(){
        Scanner input = new Scanner(System.in);
        int sisi = 0;
        
        try{
            System.out.print("Masukkan sisi : ");
            sisi = input.nextInt();
        }catch(InputMismatchException error){
            System.out.println("ERROR, INPUTAN YANG ANDA MASUKKAN BUKAN BERUPA ANGKA!!");
        }
        finally{
            BangunDatar Persegi = new Persegi(sisi);
            System.out.println(" -luas Persegi     = " + Persegi.luas());
            System.out.println(" -Keliling Persegi = " + Persegi.keliling());
        }
        
    }
    
    public static void lingkaran(){
        Scanner input = new Scanner(System.in);
        int jari = 0;
        
        try{
            System.out.print("Masukkan Jari-Jari : ");
            jari = input.nextInt();
        }catch(InputMismatchException error){
            System.out.println("ERROR, INPUTAN YANG ANDA MASUKKAN BUKAN BERUPA ANGKA!!");
        }finally{
            BangunDatar Lingkaran = new Lingkaran(jari);
            System.out.println(" -Luas Lingkaran     = " + Lingkaran.luas());
            System.out.println(" -Keliling Lingkaran = " + Lingkaran.keliling());
        }
        
        
    }
    
    public static void persegiPanjang(){
        Scanner input = new Scanner(System.in);
        int panjang = 0,lebar = 0;
        
        try{
            System.out.print("Masukkan Panjang : ");
            panjang = input.nextInt();
            System.out.print("Masukkan Lebar   : ");
            lebar = input.nextInt();
        }catch (InputMismatchException error){
            System.out.println("ERROR, INPUTAN YANG ANDA MASUKKAN BUKAN BERUPA ANGKA!!");
        }finally{
            BangunDatar PersegiPanjang = new PersegiPanjang(panjang,lebar);
            System.out.println(" -Luas Persegi Panjang     = " + PersegiPanjang.luas());
            System.out.println(" -Keliling Persegi Panjang = " + PersegiPanjang.keliling());
        }
    }
    
    public static void segitiga(){
        Scanner input = new Scanner(System.in);
        int panjang = 0, tinggi = 0, sisi = 0, sisi2 = 0;
        
        try{
            System.out.print("Masukkan Alas   : ");
            panjang = input.nextInt();
            System.out.print("Masukkan tinggi : ");
            tinggi = input.nextInt();
            System.out.print("Masukkan Sisi kiri  : ");
            sisi = input.nextInt();
            System.out.print("Masukkan Sisi kanan : ");
            sisi2 = input.nextInt();
        }catch (InputMismatchException error){
            System.out.println("ERROR, INPUTAN YANG ANDA MASUKKAN BUKAN BERUPA ANGKA!!");
        }finally{
            BangunDatar Segitiga = new Segitiga(panjang, tinggi, sisi, sisi2);
            System.out.println(" -Luas Segitiga dengan panjang Alas " + panjang + " dan tinggi "+ tinggi +"  = " + Segitiga.luas());
            System.out.println(" -Keliling Segitiga sisi "+ panjang +" , " + sisi + " , " + sisi2 +" = " + Segitiga.keliling());
        }
    }
    
    public static void kubus(){
        Scanner input = new Scanner(System.in);
        int sisi = 0;
        
        try{
            System.out.print("Masukkan sisi : ");
            sisi = input.nextInt();
        }catch (InputMismatchException error){
            System.out.println("ERROR, INPUTAN YANG ANDA MASUKKAN BUKAN BERUPA ANGKA!!");
        }finally{
            BangunRuang Kubus = new Kubus(sisi);
            System.out.println(" -luas Alas Kubus      = " + Kubus.luas());
            System.out.println(" -Keliling Alas Kubus  = " + Kubus.keliling());
            System.out.println(" -luas Permukaan Kubus = " + Kubus.luaspermukaan());
            System.out.println(" -Volume Kubus         = " + Kubus.volume());
        }
    }
    
    public static void silinder(){
        Scanner input = new Scanner(System.in);
        int jari = 0, tinggi = 0;
        
        try{
            System.out.print("Msukkan Jari-jari : ");
            jari = input.nextInt();
            System.out.print("Masukkan tinggi   : ");
            tinggi = input.nextInt();
        }catch (InputMismatchException error){
            System.out.println("ERROR, INPUTAN YANG ANDA MASUKKAN BUKAN BERUPA ANGKA!!");
        }finally{
            BangunRuang Silinder = new Silinder(jari,tinggi);
            System.out.println(" -Luas Alas Silinder      = " + Silinder.luas());
            System.out.println(" -Keliling Alas Silinder  = " + Silinder.keliling());
            System.out.println(" -Volume Silinder         = " + Silinder.volume());
            System.out.println(" -Luas Permukaan Silinder = " + Silinder.luaspermukaan());
        }
    } 
    
    public static void balok(){
        Scanner input = new Scanner(System.in);
        int panjang = 0, lebar = 0, tinggi = 0;
        
        try{
            System.out.print("Masukkan Panjang : ");
            panjang = input.nextInt();
            System.out.print("Masukkan Lebar   : ");
            lebar = input.nextInt();
            System.out.print("Masukkan Tinggi  : ");
            tinggi = input.nextInt();
        }catch (InputMismatchException error){
            System.out.println("ERROR, INPUTAN YANG ANDA MASUKKAN BUKAN BERUPA ANGKA!!");
        }finally{
            BangunRuang Balok = new Balok(panjang,lebar,tinggi);
            System.out.println(" -Luas Alas Balok      = " + Balok.luas());
            System.out.println(" -Keliling Alas Balok  = " + Balok.keliling());
            System.out.println(" -Luas Permukaan Balok = " +Balok.luaspermukaan());
            System.out.println(" -Volume Balok         = " + Balok.volume());
        }
    }
    
    
}

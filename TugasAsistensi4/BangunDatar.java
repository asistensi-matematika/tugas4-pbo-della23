/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasAsistensi4;

import java.text.DecimalFormat;

/**
 *
 * @author user
 */
public class BangunDatar {
    protected String jenis;
    protected int pilihan;
    
    public void view(){
        System.out.println("Pilih bangun datar yang diinginkan");
        System.out.println("1. Persegi");
        System.out.println("2. Lingkaran");
        System.out.println("3. Segitiga");
        System.out.print("Masukkan pilihan anda : ");
    }
}

class Persegi extends BangunDatar{
    protected double sisi;
    
    public void setSisi(double sisi){
        this.sisi = sisi;
    }
    public double getSisi(){
        return sisi;
    }
    public double Luas(double sisi){
       double  l = getSisi()*getSisi();
       return l;
    }
    public double Keliling(double sisi){
        double k = 4*getSisi();
        return k;
    }
    public void view(){
        System.out.println("Nama bangun datar adalah persegi");
        System.out.println("Luasnya adalah "+Luas(sisi)+"cm^2");
        System.out.println("Keliling adalah "+Keliling(sisi)+"cm");
    }
}

class Segitiga extends BangunDatar{
    protected double alas, tinggi;
    
    public void setAlas(double alas){
        this.alas = alas;
    }
    public double getAlas(){
        return alas;
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public double getTinggi(){
        return tinggi;
    }
    public double Luas(double alas, double tinggi){
        double l = (getAlas()*getTinggi())/2;
        return l;
    }
    public void view(){
        System.out.println("Nama bangun datar adalah segitiga");
        System.out.println("luas segitiga adalah "+Luas(alas,tinggi));
    }
}

class JenisSegitiga extends Segitiga{
    
    public double SisiMiring(double alas, double tinggi){
        double m = Math.sqrt(alas*alas+tinggi*tinggi);
        return m;
    }
    public double Keliling(double alas){
        double k = 3 * alas;
        return k;
    }
    public double Keliling(double alas, double tinggi){
        double k = alas+tinggi+SisiMiring(alas,tinggi);
        return k;
    }
    public void view(double alas){
        System.out.println("Jenis segitiga adalah Segitiga Sama sisi");
        System.out.println("Keliling segitiga adalah "+Keliling(alas));
    }
    public void view(double alas, double tinggi){
        System.out.println("Jenis segitiga adalah Segitiga Siku-siku");
        System.out.println("Keliling segitiga adalah "+Keliling(alas,tinggi));
    }
}

class Lingkaran extends BangunDatar{
    protected double r;
    
    public void setR(double r){
        this.r = r;
    }
    public double getR(){
        return r;
    }
    public double Keliling(double r){
        double k = 2* Math.PI * this.r;
        return k;
    }
    public double Luas(double r){
        double l = Math.PI * this.r * this.r;
        return l;
    }
    public void view(){
        System.out.println("Nama bangun datar adalah lingkaran");
        System.out.println("luas lingkaran adalah "+Luas(r));
        System.out.println("keliling lingkaran adalah "+Keliling(r));
    }
}

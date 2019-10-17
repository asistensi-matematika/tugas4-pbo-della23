/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasAsistensi4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class BangunDatarMain {
    public static void main(String[] args){
        
        int pilihan;   
        Scanner baca = new Scanner(System.in);
        BangunDatar b = new BangunDatar();
        b.view();
        pilihan = baca.nextInt();
        while(pilihan !=1 && pilihan !=2 && pilihan !=3){
            System.out.println("Tidak ada dalam pilihan");
            b.view();
            pilihan = baca.nextInt();
        }
        
        Persegi p = new Persegi();
        Lingkaran l = new Lingkaran();
        Segitiga s = new Segitiga();
        
        if(pilihan == 1){
            double inputSisi;
            System.out.print("Masukkan panjang sisi : ");
            inputSisi = baca.nextDouble();
            p.setSisi(inputSisi);
            p.view();
        }
        else if(pilihan == 2){
            double inputJari;
            System.out.print("Masukkan panjang jari-jari : ");
            inputJari = baca.nextDouble();
            l.setR(inputJari);
            l.Keliling(70);
            l.view();
        }else{
            int pilihanSegitiga;
            System.out.println("Pilih Segitiga yg diinginkan ");
            System.out.println("1. Segitiga Siku - siku");
            System.out.println("2. Segitiga sama sisi");
            System.out.print("Masukkan pilihan anda : ");
            pilihanSegitiga = baca.nextInt();
            while(pilihanSegitiga != 1 && pilihanSegitiga != 2){
            System.out.println("Tidak ada dalam pilihan");
            System.out.print("Masukkan pilihan anda : ");
            pilihanSegitiga = baca.nextInt();
            }
            
            JenisSegitiga jS = new JenisSegitiga();
                
            if(pilihanSegitiga == 1){
                double inputAlas,inputTinggi;
                System.out.print("Masukkan panjang alas : ");
                inputAlas = baca.nextDouble();
                System.out.print("Masukkan panjang tinggi : ");
                inputTinggi = baca.nextDouble();
                s.setAlas(inputAlas);
                s.setTinggi(inputTinggi);
                s.view();
                jS.view(inputAlas,inputTinggi);
                
            }else{
                double inputAlas,inputTinggi;
                System.out.print("Masukkan panjang alas : ");
                inputAlas = baca.nextDouble();
                System.out.print("Masukkan panjang tinggi : ");
                inputTinggi = baca.nextDouble();
                s.setAlas(inputAlas);
                s.setTinggi(inputTinggi);
                s.view();
                jS.view(inputAlas);
            }
            
        }
    }
}

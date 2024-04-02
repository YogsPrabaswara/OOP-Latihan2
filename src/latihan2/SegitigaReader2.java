/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Yogs
 */
public class SegitigaReader2 {
    public static void main(String[] args){
        BufferedReader dtain = new BufferedReader (new InputStreamReader(System.in));
        //deklarasi variabel 
        Double luas;
        int alas = 0;
        int tinggi = 0;
        String nilaiAlas = "";
        String nilaiTinggi = "";
        double sisimiring = 0.5;
        
        System.out.println("Hitung Luas Segitiga");
        System.out.print("Input Nilai Alas : ");
        try{
            nilaiAlas = dtain.readLine();
            alas = Integer.parseInt(nilaiAlas);
        }catch(IOException e) {
            System.out.println("Error");
        }
        
        System.out.print("Input Nilai Tinggi : ");
        try{
            nilaiTinggi = dtain.readLine();
            tinggi = Integer.parseInt(nilaiTinggi);
        }catch(IOException e) {
            System.out.println("Error");
        }
        
        //proses 
        sisimiring = 0.5;
        luas =  sisimiring * alas * tinggi;
        
        //output 
        System.out.println("luas segitiga adalah : " + luas);
    }
}

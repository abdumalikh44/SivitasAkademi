/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sivitasakademiupi;

/**
 *
 * @author LENOVO
 */
public class Pegawai extends Data{
    private int NilaiGaji;

    public Pegawai(String Nama, String NomorInduk, int Gaji) {
        super(Nama, NomorInduk);
        NilaiGaji = Gaji;
    }
    
    public void setGaji(int value){
        NilaiGaji = value;
    }
    
    public int getGaji(){
        return NilaiGaji;
    }
    
    @Override
    public String toString(){
        String output = super.toString() + "\n" + "Gaji: " + NilaiGaji;
        return output;
    }
    
   
    
    
}

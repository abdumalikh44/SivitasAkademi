/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sivitasakademiupi;

/**
 *
 * @author LENOVO
 */
public class Mahasiswa extends Data{
    private double NilaiIPK;

    Mahasiswa(String NomorInduk, String Nama, double IPK) {
        super(NomorInduk, Nama);
        NilaiIPK = IPK;
    }
    
    public void setIPK(double value){
        NilaiIPK = value;
    }
    
    public double getIPK(){
        return NilaiIPK;
    }
   
    @Override
    public String toString(){
        String output = super.toString() + "\n" + "IPK: " + NilaiIPK;
        return output;
    }
    
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sivitasakademiupi;

/**
 *
 * @author LENOVO
 */
public class Data {
    private String NomorInduk;
    private String Nama;
    

    public Data(String NomorInduk, String Nama) {
        this.NomorInduk = NomorInduk;
        this.Nama = Nama;
    }
    
    public void setNomorInduk(String No){
        this.NomorInduk = No;
    }
    
    public void setNama(String name){
        this.Nama = name;
    }
    
    @Override
    public String toString(){
        String output = "Nomor Induk: " + NomorInduk + "Nama: " + Nama;
        return output;
    }
   
    
}

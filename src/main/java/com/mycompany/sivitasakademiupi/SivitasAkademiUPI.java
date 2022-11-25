/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sivitasakademiupi;

/**
 *
 * @author LENOVO
 */
public class SivitasAkademiUPI {

    public static void main(String[] args) {
        Mahasiswa angga = new Mahasiswa("2101414", "Malik", 3.14);
        angga.setIPK(3.15);
        System.out.println(angga.toString());
        System.out.println("\n");
        Pegawai asri = new Pegawai("21014", "Asri", 20000);
        System.out.println("\n");
        
        System.out.println(asri.toString());
    }
}

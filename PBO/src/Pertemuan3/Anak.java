/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author Nidzzz
 */
public class Anak extends Ayah {

    public void bekerja() {
        System.out.println("Anak");
    }

    public void ceck() {
        bekerja();
        this.bekerja();
        super.bekerja();
        
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

/**
 *
 * @author Nidzzz
 */
public class Utama {

    public static void main(String[] args) {
        System.out.println("CONSTRUCTOR");
        Adik ahmad = new Adik();
        System.out.println("Nama adikku " + ahmad.getNama() + ", uang sakunya " + ahmad.getBeriUangSaku());

        System.out.println("");

        System.out.println("CASTING dan INTERFACE");
        Saya nidzom = (Saya) ahmad;
        nidzom.belajar();
        nidzom.lari();
        nidzom.kePantai();

        System.out.println("");

        System.out.println("SUPER, THIS");
        nidzom.cek();
//        nidzom.setNama("Nidzom");
//        System.out.println("Nama saya " + nidzom.getNama() + ", umur saya " + nidzom.getUmur());
//        System.out.println("Uang saku saya " + nidzom.getBeriUangSaku() + ", serta hobbyku " + nidzom.getHobby());
//
//        Kakek abdul = (Kakek) ahmad;
//        System.out.println("Kakekku bernama " + abdul.getNama() + ", beliau berumur " + abdul.getUmur());
//        System.out.println("");
//
////        Kakak soleh = new Kakak();
//////        Kakak soleh = (Kakak) abdul;
////        System.out.println("Nama Kakakku " + soleh.getNama() + ". Dia berprestasi, salah satunya " + soleh.getPrestasi() + ".");
////        System.out.println("Dia hobinya " + soleh.getMinat() + ", uang sakunya " + soleh.getBeriUangSaku());
//        System.out.println("");
//        System.out.println("---INTERFACE---");
//        Saya nidzom = new Saya();
//        nidzom.Belajar();
//        nidzom.Lari();
//        nidzom.KePantai();
    }
}

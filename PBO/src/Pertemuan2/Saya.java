/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

/**
 *
 * @author Nidzzz
 */
public class Saya extends Ayah implements Kuliah, Liburan, Olahraga {

//    private String hobby;
//    public Saya() {
//        System.out.println("Halo Aku Nidzom");
//        super.setBeriUangSaku(20000);
//        super.setUmur(19);
//        this.setHobby("Tidur");
//        this.setNama("Nidzom");
//    }
    @Override
    public void kePantai() {
        System.out.println("Aku liburan ke pantai Merah");
    }

    @Override
    public void lari() {
        System.out.println("Aku senang olahraga lari");
    }

    @Override
    public void belajar() {
        System.out.println("Aku kuliah belajar coding");
    }

    public void kegiatan() {
        System.out.println("Nidzom Sehari-hari kuliah");
    }

    public void hobi() {
        System.out.println("Nidzom hobinya Olahraga");
    }

    public void cek() {
        super.kegiatan();
        this.kegiatan();
        super.hobi();
        this.hobi();
    }
    /**
     * @return the hobby
     */
//    public String getHobby() {
//        return hobby;
//    }
//
//    /**
//     * @param hobby the hobby to set
//     */
//    public void setHobby(String hobby) {
//        this.hobby = hobby;
//    }
}

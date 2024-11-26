/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

/**
 *
 * @author Nidzzz
 */
public class Ayah extends Kakek {

    private String pekerjaan;
    private int penghasilan;
    private int beriUangSaku;

    public Ayah() {
        System.out.println("Halo dari ayah");
        this.setPekerjaan("Dokter");
        this.setPenghasilan(50000000);
        super.setNama("Mahmud");
        super.setUmur(38);
    }

    /**
     * @return the pekerjaan
     */
    public String getPekerjaan() {
        return pekerjaan;
    }

    /**
     * @param pekerjaan the pekerjaan to set
     */
    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    /**
     * @return the penghasilan
     */
    public int getPenghasilan() {
        return penghasilan;
    }

    /**
     * @param penghasilan the penghasilan to set
     */
    public void setPenghasilan(int penghasilan) {
        this.penghasilan = penghasilan;
    }

    /**
     * @return the beriUangSaku
     */
    public int getBeriUangSaku() {
        return beriUangSaku;
    }

    /**
     * @param beriUangSaku the beriUangSaku to set
     */
    public void setBeriUangSaku(int beriUangSaku) {
        this.beriUangSaku = beriUangSaku;
    }

    public void kegiatan() {
        System.out.println("Ayah Kegiatan Sehari-harinya Mencari uang");
    }

    public void hobi() {
        System.out.println("Ayah suka Mancing saat waktu luang");
    }
}

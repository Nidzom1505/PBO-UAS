/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

/**
 *
 * @author Nidzzz
 */
public class Kakak extends Ayah {

    private String prestasi;
    private String minat;

    public Kakak() {
        System.out.println("Halo dari kakak");
        this.setPrestasi("Juara I Design Web");
        super.setNama("Soleh");
        super.setBeriUangSaku(50000);
        this.setMinat("Progaming");
    }

    /**
     * @return the prestasi
     */
    public String getPrestasi() {
        return prestasi;
    }

    /**
     * @param prestasi the prestasi to set
     */
    public void setPrestasi(String prestasi) {
        this.prestasi = prestasi;
    }

    /**
     * @return the minat
     */
    public String getMinat() {
        return minat;
    }

    /**
     * @param minat the minat to set
     */
    public void setMinat(String minat) {
        this.minat = minat;
    }
}

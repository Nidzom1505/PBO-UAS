/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

/**
 *
 * @author Nidzzz
 */
public class Adik extends Saya {

    private String mainanFav;
    private String citaCita;

    public Adik() {
        System.out.println("Halo dari adik");
        super.setBeriUangSaku(20000);
        super.setNama("Ahmad");
        this.setCitaCita("Masinis");
        this.setMainanFav("Robot");
    }

    /**
     * @return the mainanFav
     */
    public String getMainanFav() {
        return mainanFav;
    }

    /**
     * @param mainanFav the mainanFav to set
     */
    public void setMainanFav(String mainanFav) {
        this.mainanFav = mainanFav;
    }

    /**
     * @return the citaCita
     */
    public String getCitaCita() {
        return citaCita;
    }

    /**
     * @param citaCita the citaCita to set
     */
    public void setCitaCita(String citaCita) {
        this.citaCita = citaCita;
    }
}

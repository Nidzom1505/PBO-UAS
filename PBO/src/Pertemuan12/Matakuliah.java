/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan12;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Nidzzz
 */
@Entity
@Table(name = "matakuliah")
@NamedQueries({
    @NamedQuery(name = "Matakuliah.findAll", query = "SELECT m FROM Matakuliah m"),
    @NamedQuery(name = "Matakuliah.findByKodemk", query = "SELECT m FROM Matakuliah m WHERE m.kodemk = :kodemk"),
    @NamedQuery(name = "Matakuliah.findBySks", query = "SELECT m FROM Matakuliah m WHERE m.sks = :sks"),
    @NamedQuery(name = "Matakuliah.findByNamamk", query = "SELECT m FROM Matakuliah m WHERE m.namamk = :namamk"),
    @NamedQuery(name = "Matakuliah.findBySemesterajar", query = "SELECT m FROM Matakuliah m WHERE m.semesterajar = :semesterajar")})
public class Matakuliah implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kodemk")
    private String kodemk;
    @Basic(optional = false)
    @Column(name = "sks")
    private int sks;
    @Basic(optional = false)
    @Column(name = "namamk")
    private String namamk;
    @Column(name = "semesterajar")
    private String semesterajar;

    public Matakuliah() {
    }

    public Matakuliah(String kodemk) {
        this.kodemk = kodemk;
    }

    public Matakuliah(String kodemk, int sks, String namamk) {
        this.kodemk = kodemk;
        this.sks = sks;
        this.namamk = namamk;
    }

    public String getKodemk() {
        return kodemk;
    }

    public void setKodemk(String kodemk) {
        this.kodemk = kodemk;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public String getNamamk() {
        return namamk;
    }

    public void setNamamk(String namamk) {
        this.namamk = namamk;
    }

    public String getSemesterajar() {
        return semesterajar;
    }

    public void setSemesterajar(String semesterajar) {
        this.semesterajar = semesterajar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodemk != null ? kodemk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Matakuliah)) {
            return false;
        }
        Matakuliah other = (Matakuliah) object;
        if ((this.kodemk == null && other.kodemk != null) || (this.kodemk != null && !this.kodemk.equals(other.kodemk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pertemuan12.Matakuliah[ kodemk=" + kodemk + " ]";
    }
    
}

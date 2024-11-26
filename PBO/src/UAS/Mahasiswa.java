/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS;

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
@Table(name = "mahasiswa")
@NamedQueries({
    @NamedQuery(name = "Mahasiswa.findAll", query = "SELECT m FROM Mahasiswa m"),
    @NamedQuery(name = "Mahasiswa.findByNim", query = "SELECT m FROM Mahasiswa m WHERE m.nim = :nim"),
    @NamedQuery(name = "Mahasiswa.findByNama", query = "SELECT m FROM Mahasiswa m WHERE m.nama = :nama"),
    @NamedQuery(name = "Mahasiswa.findByAlamat", query = "SELECT m FROM Mahasiswa m WHERE m.alamat = :alamat"),
    @NamedQuery(name = "Mahasiswa.findByAsalsma", query = "SELECT m FROM Mahasiswa m WHERE m.asalsma = :asalsma"),
    @NamedQuery(name = "Mahasiswa.findByNamaortu", query = "SELECT m FROM Mahasiswa m WHERE m.namaortu = :namaortu")})
public class Mahasiswa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nim")
    private String nim;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @Column(name = "alamat")
    private String alamat;
    @Basic(optional = false)
    @Column(name = "asalsma")
    private String asalsma;
    @Basic(optional = false)
    @Column(name = "namaortu")
    private String namaortu;

    public Mahasiswa() {
    }

    public Mahasiswa(String nim) {
        this.nim = nim;
    }

    public Mahasiswa(String nim, String nama, String alamat, String asalsma, String namaortu) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.asalsma = asalsma;
        this.namaortu = namaortu;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAsalsma() {
        return asalsma;
    }

    public void setAsalsma(String asalsma) {
        this.asalsma = asalsma;
    }

    public String getNamaortu() {
        return namaortu;
    }

    public void setNamaortu(String namaortu) {
        this.namaortu = namaortu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nim != null ? nim.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mahasiswa)) {
            return false;
        }
        Mahasiswa other = (Mahasiswa) object;
        if ((this.nim == null && other.nim != null) || (this.nim != null && !this.nim.equals(other.nim))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UAS.Mahasiswa[ nim=" + nim + " ]";
    }
    
}

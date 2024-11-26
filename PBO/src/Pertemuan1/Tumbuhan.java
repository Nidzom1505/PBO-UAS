/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan1;

/**
 *
 * @author Nidzzz
 */
public class Tumbuhan extends MakhlukHidup {

    private String warnaDaun;
    private String arahDaun;
    private int jumlahMesofil;
    private int jumlahBiji;
    private int jumlahKelopakBunga;
    private String bentukAkar;
    private char berkambium;

    /**
     * @return the warnaDaun
     */
    public String getWarnaDaun() {
        return warnaDaun;
    }

    /**
     * @param warnaDaun the warnaDaun to set
     */
    public void setWarnaDaun(String warnaDaun) {
        this.warnaDaun = warnaDaun;
    }

    /**
     * @return the arahDaun
     */
    public String getArahDaun() {
        return arahDaun;
    }

    /**
     * @param arahDaun the arahDaun to set
     */
    public void setArahDaun(String arahDaun) {
        this.arahDaun = arahDaun;
    }

    /**
     * @return the jumlahMesofil
     */
    public int getJumlahMesofil() {
        if (jumlahMesofil == 1) {
            System.out.println(jumlahMesofil + " adalah jumlah mesofil dari monokotil");
        } else if (jumlahMesofil == 2) {
            System.out.println(jumlahMesofil + " adalah jumlah mesofil dari dikotil");
        } else {
            System.out.println("Tidak tersedia");
        }
        return jumlahMesofil;
    }

    /**
     * @param jumlahMesofil the jumlahMesofil to set
     */
    public void setJumlahMesofil(int jumlahMesofil) {
        this.jumlahMesofil = jumlahMesofil;
    }

    /**
     * @return the jumlahBiji
     */
    public int getJumlahBiji() {
        if (jumlahBiji == 1) {
            Monokotil obj = new Monokotil();
            System.out.print("Biji " + jumlahBiji);
            obj.BijiMo();
        } else {
            Dikotil obj = new Dikotil();
            System.out.print("Biji " + jumlahBiji);
            obj.BijiDi();
        }
        return jumlahBiji;
    }

    /**
     * @param jumlahBiji the jumlahBiji to set
     */
    public void setJumlahBiji(int jumlahBiji) {
        this.jumlahBiji = jumlahBiji;
    }

    /**
     * @return the jumlahKelopakBunga
     */
    public int getJumlahKelopakBunga() {
        if (jumlahKelopakBunga % 3 == 0) {
            Monokotil obj = new Monokotil();
            System.out.print("Jika Jumlah " + jumlahKelopakBunga);
            obj.BungaMo();
        } else if (jumlahKelopakBunga % 2 == 0 || jumlahKelopakBunga % 4 == 0 || jumlahKelopakBunga % 5 == 0) {
            Dikotil obj = new Dikotil();
            System.out.print("Jika Jumlah kelopak bunga " + jumlahKelopakBunga);
            obj.BungaDi();
        } else {
            System.out.println("Tidak tau");
        }
        return jumlahKelopakBunga;
    }

    /**
     * @param jumlahKelopakBunga the jumlahKelopakBunga to set
     */
    public void setJumlahKelopakBunga(int jumlahKelopakBunga) {
        this.jumlahKelopakBunga = jumlahKelopakBunga;
    }

    /**
     * @return the bentukAkar
     */
    public String getBentukAkar() {
        if (bentukAkar == "Tunggang") {
            Dikotil obj = new Dikotil();
            System.out.print("Bentuk akar " + bentukAkar);
            obj.AkarDi();
        } else {
            Monokotil obj = new Monokotil();
            System.out.print("Bentuk akar " + bentukAkar);
            obj.AkarMo();
        }
        return bentukAkar;
    }

    /**
     * @param bentukAkar the bentukAkar to set
     */
    public void setBentukAkar(String bentukAkar) {
        this.bentukAkar = bentukAkar;
    }

    /**
     * @return the berkambium
     */
    public char getBerkambium() {
        if (berkambium == 'Y' || berkambium == 'y') {
            Dikotil obj = new Dikotil();
            System.out.print("Jika Berkambium ");
            obj.BatangDi();
        } else {
            Monokotil obj = new Monokotil();
            System.out.print("Jika tidak berkambium ");
            obj.BatangMo();
        }
        return berkambium;
    }

    /**
     * @param Berkambium the berkambium to set
     */
    public void setBerkambium(char Berkambium) {
        this.berkambium = Berkambium;
    }
}

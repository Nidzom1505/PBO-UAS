/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan1;

/**
 *
 * @author Nidzzz
 */
public class Utama {

    public static void main(String[] args) {

        System.out.println("-----CONTOH DARI CLASS IKAN-----");
        Pisces lele = new Pisces();
        System.out.print("Lele ");
        lele.bernafas();
        lele.setJumInsang(4);
        lele.setJenAir("Air Tawar");
        lele.setWarnaIkan("Hitam");
        System.out.println("Jumlah insang lele ada " + lele.getJumInsang());
        System.out.println("Warnanya " + lele.getWarnaIkan() + ", dan hidup di " + lele.getJenAir());

        System.out.println("");

        System.out.println("-----CONTOH DARI CLASS AMFIBI-----");
        Amfibi frog = new Amfibi();
        System.out.print("Katak juga ");
        frog.bernafas();
        System.out.print(" dan ");
        frog.tumbuh();
        frog.setRuangJantung(3);
        frog.setMetamorfosis("Sempurna");
        frog.setReproduksi("Bertelur");
        System.out.println("Katak mengalami metamorfosis " + frog.getMetamorfosis() + ", serta berkembangbiak secara " + frog.getReproduksi());

        System.out.println("");

        System.out.println("-----CONTOH DARI CLASS REPTIL-----");
        Reptil python = new Reptil();
        python.setJenkulit("Bersisik");
        python.setJumRuangJantung(3);
        System.out.println("Python adalah ular yang " + python.getJenkulit() + " dan memiliki " + python.getJumRuangJantung() + " Ruang jantung");

        System.out.println("");

        System.out.println("-----CONTOH DARI CLASS BURUNG-----");
        Aves beo = new Aves();
        System.out.print("Burung beo ");
        beo.bernafas();
        System.out.print(" dan juga ");
        beo.tumbuh();
        beo.setJenBulu("Sekunder");
        beo.setStrukturParuh("Melengkung");
        beo.setHabitat("Hutan");
        System.out.println("Burung beo mempunyai bulu yang berjenis " + beo.getJenBulu() + ", paruh yang berbentuk " + beo.getStrukturParuh() + " serta habitatnya di " + beo.getHabitat());

        System.out.println("");

        System.out.println("-----CONTOH DARI CLASS MAMALIA-----");
        Mamalia kuda = new Mamalia();
        System.out.print("Kuda ");
        kuda.bernafas();
        System.out.print(" dan ");
        kuda.tumbuh();
        kuda.setTipeMakan("Herbivora");
        kuda.setSistemKomunikasi("Vokal dan bahasa tubuh ");
        System.out.println("Kuda adalah hewan yang jenis " + kuda.getTipeMakan() + ", dan dia berkomunikasi biasanya dengan " + kuda.getSistemKomunikasi());

        System.out.println("");

        System.out.println("-----CONTOH DARI CLASS DIKOTIL-----");
        Tumbuhan mangga = new Tumbuhan();
        mangga.setJumlahBiji(2);
        mangga.setBerkambium('Y');
        mangga.setJumlahKelopakBunga(10);
        mangga.setBentukAkar("Tunggang");
        mangga.getJumlahBiji();
        mangga.getBerkambium();
        mangga.getJumlahKelopakBunga();
        mangga.getBentukAkar();

        System.out.println("");

        System.out.println("-----CONTOH DARI CLASS MONOKOTIL-----");
        Tumbuhan kelapa = new Tumbuhan();
        System.out.print("Pohon kelapa ");
        kelapa.tumbuh();
        kelapa.setJumlahBiji(1);
        kelapa.setBentukAkar("Serabut");
        kelapa.setBerkambium('T');
        kelapa.getJumlahBiji();
        kelapa.getBerkambium();
        kelapa.getBentukAkar();

        //        Hewan sapi = new Hewan();
//        System.out.println("Sapi adalah Hewan yang");
//        sapi.bernafas();
//        sapi.tumbuh();
//        System.out.println("");
//        Tumbuhan pepaya = new Tumbuhan();
//        System.out.println("Pepaya adalah tumbuhan yang");
//        pepaya.setWarnaDaun("Hijau");
//        pepaya.setArahDaun("Barat");
//        pepaya.bernafas();
//        pepaya.tumbuh();
//        pepaya.setJumlahMesofil(2);
//        pepaya.setJumlahBiji(2);
//        pepaya.setJumlahKelopakBunga(10);
//        System.out.println("Pepaya adalah pohon yang daunnya berwarna " + pepaya.getWarnaDaun() + ", dan arah daunnya saat sore adalah " + pepaya.getArahDaun());
//        pepaya.getJumlahMesofil();
//        pepaya.getJumlahBiji();
//        pepaya.getJumlahKelopakBunga();
//        System.out.println("");
    }
}

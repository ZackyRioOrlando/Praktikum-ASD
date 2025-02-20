public class MataKuliah27 {
    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;

    void tampilkanInformasi () {
        System.out.println("Nama             : " + nama);
        System.out.println("Kode mata kuliah : " + kodeMk);
        System.out.println("SKS              : " + sks);
        System.out.println("Jumlah Jam       : " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        System.out.println("SKS diubah menjadi: " + sks + " SKS");
    }

    void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Total jam setelah ditambah : " + jumlahJam + " jam");
    }

    void kurangiJam(int jam) {
        if (jam > this.jumlahJam) {
            System.out.println("Pengurangan tidak dapat dilakukan");
        } else {
            this.jumlahJam -= jam;
            System.out.println("Total jam setelah dikurangi: " + jumlahJam + " jam");
        }
    }

    
    public MataKuliah27() {
    }

    public MataKuliah27(String nama, String kodeMK, int sks, int jumlahJam) {
        this.nama = nama;
        this.kodeMk = kodeMK;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}

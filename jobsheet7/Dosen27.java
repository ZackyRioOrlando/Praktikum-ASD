public class Dosen27 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    Dosen27() {
    }

    Dosen27(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        usia = age;
        this.jenisKelamin = jk;
    }

    void tampil() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia: " + usia);
        System.out.println("------------------------");
    }
}

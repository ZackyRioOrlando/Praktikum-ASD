import java.util.Scanner;
public class Dosen27 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;
    int nomor;

    public Dosen27(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public void tampilkanInfo(int nomor) {
        System.out.println(" Data dosen ke- " + nomor);
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + usia);
        System.out.println("-------------------------");
    }
}

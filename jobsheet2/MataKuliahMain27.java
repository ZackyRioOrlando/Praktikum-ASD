public class MataKuliahMain27 { 
    public static void main(String[] args) {
        MataKuliah27 mhs1 = new MataKuliah27();
        System.out.println("---Data Mahasiswa 1---");
        mhs1.nama = "Zacky";
        mhs1.kodeMk = "BIG01";
        mhs1.sks = 1;
        mhs1.jumlahJam = 2;
        mhs1.tampilkanInformasi();
        mhs1.ubahSKS(3);
        mhs1.tambahJam(2);
        mhs1.kurangiJam(1);
        System.out.println("Perubahan Data Informasi Mahasiswa");
        mhs1.tampilkanInformasi();

        MataKuliah27 mhs2 = new MataKuliah27("Rio Orlando", "ASD01", 3, 6);
        System.out.println("---Data Mahasiswa 2---");
        mhs2.tampilkanInformasi();
        mhs2.ubahSKS(4);
        mhs2.tambahJam(3);
        mhs2.kurangiJam(1);
        System.out.println("Perubahan Data Informasi Mahasiswa");
        mhs2.tampilkanInformasi();
    }
}

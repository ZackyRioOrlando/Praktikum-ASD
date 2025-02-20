public class DosenMain27 {
    public static void main(String[] args) {
        Dosen27 dsn1 = new Dosen27();
        dsn1.nama = "Vivi Nur Wijayaningrum, S.kom., M.kom.";
        dsn1.idDosen = "VNV";
        dsn1.tahunBergabung = 2000;
        System.out.println("Data Dosen 1:");
        dsn1.bidangKeahlian = "Dasar Pemrograman";
        dsn1.setStatusAktif(true);
        dsn1.tampilInformasi();
        dsn1.ubahKeahlian("Algoritma dan Struktur Data");

        Dosen27 dsn2 = new Dosen27("ZRO", "Zacky Rio Orlando, S.kom., M.kom.", false, 2024, "Rekayasa Perangkat Lunak");
        System.out.println("Data Dosen 2:");
        dsn2.tampilInformasi();
        dsn2.setStatusAktif(true);
        dsn2.ubahKeahlian("Rekayasa Artificial Intelligence");
    }
}

public class DataDosen27 {
    public static void dataSemuaDosen(Dosen27[] arrayOfDosen) {
        System.out.println("===== Data Semua Dosen =====");
        int nomor = 1;
        for (Dosen27 dosen : arrayOfDosen) {
            dosen.tampilkanInfo(nomor);
            nomor++;
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen27[] arrayOfDosen) {
        int jumlahDosenPria = 0, jumlahDosenWanita = 0;
        for (Dosen27 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                jumlahDosenPria++;
            } else {
                jumlahDosenWanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria    : " + jumlahDosenPria);
        System.out.println("Jumlah Dosen Wanita  : " + jumlahDosenWanita);
        System.out.println("-------------------------");
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen27[] arrayOfDosen) {
        int totalUsiaDosenPria = 0, totalUsiaDosenWanita = 0;
        int jumlahDosenPria = 0, jumlahDosenWanita = 0;

        for (Dosen27 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaDosenPria += dosen.usia;
                jumlahDosenPria++;
            } else {
                totalUsiaDosenWanita += dosen.usia;
                jumlahDosenWanita++;
            }
        }

        double rataPria = (jumlahDosenPria > 0) ? (double) totalUsiaDosenPria / jumlahDosenPria : 0;
        double rataWanita = (jumlahDosenWanita > 0) ? (double) totalUsiaDosenWanita / jumlahDosenWanita : 0;

        if (jumlahDosenPria == 0) {
            System.out.println("Tidak ada dosen pria.");
        } else {
            System.out.println("Rata-rata usia Dosen Pria   : " + rataPria);
        }

        if (jumlahDosenWanita == 0) {
            System.out.println("Tidak ada dosen wanita.");
        } else {
            System.out.println("Rata-rata usia Dosen Wanita : " + rataWanita);
        }
        System.out.println("-------------------------");
    }

    public static void infoDosenPalingTua(Dosen27[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) {
            System.out.println("Tidak ada data dosen.");
            return;
        }

        Dosen27 tertua = arrayOfDosen[0];
        for (Dosen27 dosen : arrayOfDosen) {
            if (dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }

        System.out.println("===== Dosen Paling Tua =====");
        tertua.tampilkanInfo(1);
    }

    public static void infoDosenPalingMuda(Dosen27[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) {
            System.out.println("Tidak ada data dosen.");
            return;
        }

        Dosen27 termuda = arrayOfDosen[0];
        for (Dosen27 dosen : arrayOfDosen) {
            if (dosen.usia < termuda.usia) {
                termuda = dosen;
            }
        }

        System.out.println("===== Dosen Paling Muda =====");
        termuda.tampilkanInfo(1);
    }
}

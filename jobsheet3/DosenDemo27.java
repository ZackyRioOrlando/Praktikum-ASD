import java.util.Scanner;

public class DosenDemo27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine();  

        Dosen27[] informasiDosen = new Dosen27[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));

            System.out.print("Kode          : ");
            String kode = sc.nextLine();

            System.out.print("Nama          : ");
            String nama = sc.nextLine();

            String jKelamin;
            do {
            System.out.print("Jenis Kelamin : ");
            jKelamin = sc.nextLine();

                if (!jKelamin.equalsIgnoreCase("Pria") && !jKelamin.equalsIgnoreCase("Wanita")) {
                    System.out.println("Input tidak valid! Masukkan 'Pria' atau 'Wanita'.");
                }
            } while (!jKelamin.equalsIgnoreCase("Pria") && !jKelamin.equalsIgnoreCase("Wanita"));

            Boolean jenisKelamin = jKelamin.equalsIgnoreCase("Pria");

            int usia;
            do {
                System.out.print("Usia          : ");
                usia = sc.nextInt();
                sc.nextLine();
                if (usia <= 0) {
                    System.out.println("Usia harus lebih dari 0!");
                }
            } while (usia <= 0);

            informasiDosen[i] = new Dosen27(kode, nama, jenisKelamin, usia);
            System.out.println("-------------------------");
        }

        int nomor = 1;
        for (Dosen27 dosen : informasiDosen) {
            dosen.tampilkanInfo(nomor);
            nomor++;
        }

        DataDosen27.dataSemuaDosen(informasiDosen);
        DataDosen27.jumlahDosenPerJenisKelamin(informasiDosen);
        DataDosen27.rerataUsiaDosenPerJenisKelamin(informasiDosen);
        DataDosen27.infoDosenPalingTua(informasiDosen);
        DataDosen27.infoDosenPalingMuda(informasiDosen);
    }
}

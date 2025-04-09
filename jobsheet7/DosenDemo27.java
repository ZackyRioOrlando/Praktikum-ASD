import java.util.Scanner;

public class DosenDemo27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen27 data27 = new DataDosen27();
        int pilihan;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting Usia (ASC)");
            System.out.println("4. Sorting Usia (DSC)");
            System.out.println("5. Cari Nama Dosen (Sequential)");
            System.out.println("6. Cari Usia Dosen (Binary)");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Kode Dosen: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan Nama Dosen: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Jenis Kelamin: ");
                    String inputJK = sc.nextLine();
                    boolean jk = inputJK.equalsIgnoreCase("laki-laki");
                    System.out.print("Masukkan Usia: ");
                    int usia = sc.nextInt();
                    sc.nextLine();
                    data27.tambah(new Dosen27(kode, nama, jk, usia));
                    break;
                case 2:
                    data27.tampil();
                    break;
                case 3:
                    data27.sortingASC();
                    System.out.println("Data telah diurutkan dari termuda ke tertua.");
                    break;
                case 4:
                    data27.sortingDSC();
                    System.out.println("Data telah diurutkan dari tertua ke termuda.");
                    break;
                case 5:
                    System.out.print("Masukkan nama yang dicari: ");
                    String namaCari = sc.nextLine();
                    data27.pencarianDataSequential27(namaCari);
                    break;
                case 6:
                    System.out.print("Masukkan usia yang dicari: ");
                    int usiaCari = sc.nextInt();
                    data27.pencarianDataBinary27(usiaCari);
                    break;
                case 7:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 7);
    }
}

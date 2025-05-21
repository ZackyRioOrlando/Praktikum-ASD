import java.util.Scanner;
public class AntrianKRSMain {
    public static void menu() {
        System.out.println("\n=== MENU ANTRIAN KRS ===");
        System.out.println("1. Tambah Mahasiswa ke Antrian");
        System.out.println("2. Panggil 2 Mahasiswa untuk Proses KRS");
        System.out.println("3. Lihat 2 Antrian Terdepan");
        System.out.println("4. Lihat Antrian Paling Belakang");
        System.out.println("5. Tampilkan Semua Antrian");
        System.out.println("6. Cek Jumlah Antrian");
        System.out.println("7. Cek Jumlah Mahasiswa yang Sudah Proses KRS");
        System.out.println("8. Cek Jumlah Mahasiswa yang Belum Proses KRS");
        System.out.println("9. Kosongkan Antrian");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayanan antrian = new AntrianLayanan(10);
        int pilihan;

        do {
            menu();
            pilihan = sc.nextInt(); 
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.panggilKRS();
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.lihatAkhir();
                    break;
                case 5:
                    antrian.tampilkanSemua();
                    break;
                case 6:
                    System.out.println("Jumlah antrian saat ini: " + antrian.getJumlahAntrian());
                    break;
                case 7:
                    System.out.println("Jumlah mahasiswa yang sudah diproses KRS: " + antrian.getSudahDiproses());
                    break;
                case 8:
                    System.out.println("Jumlah mahasiswa yang belum diproses KRS: " + antrian.getBelumDiproses());
                    break;
                case 9:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}

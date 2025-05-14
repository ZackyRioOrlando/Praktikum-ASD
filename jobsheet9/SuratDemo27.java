import java.util.Scanner;

public class SuratDemo27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackSurat27 stack = new StackSurat27(10);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat berdasarkan Nama");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = scan.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi Izin (hari): ");
                    int durasi = scan.nextInt();
                    scan.nextLine(); 
                    Surat27 surat = new Surat27(id, nama, kelas, jenis, durasi);
                    stack.push(surat);
                    break;

                case 2:
                    Surat27 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat berikut:");
                        diproses.tampilkan();
                    }
                    break;

                case 3:
                    Surat27 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir yang diterima:");
                        terakhir.tampilkan();
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cariNama = scan.nextLine();
                    stack.cariSurat(cariNama);
                    break;

                case 0:
                    System.out.println("Terima kasih.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
    }
}

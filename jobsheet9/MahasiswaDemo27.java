import java.util.Scanner;

public class MahasiswaDemo27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilih;
        StackTugasMahasiswa27 stack = new StackTugasMahasiswa27(5);

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Lihat Jumlah Tugas yang Terkumpul");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa27 mhs = new Mahasiswa27(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa27 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        int nilai;
                        do {
                            System.out.print("Masukkan nilai (0-100): ");
                            nilai = scan.nextInt();
                            if (nilai < 0 || nilai > 100) {
                                System.out.println("Nilai tidak valid. Harus antara 0 hingga 100.");
                            }
                        } while (nilai < 0 || nilai > 100);
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;
                case 3 : 
                    Mahasiswa27 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4 :
                    System.out.println("==================================");
                    System.out.println("Daftar Semua Tugas yang Terkumpul:");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    Mahasiswa27 terbawah = stack.bottom();
                    if (terbawah != null) {
                    System.out.println("Tugas pertama dikumpulkan oleh " + terbawah.nama);
                    }
                    break;
                case 6:
                    int jumlah = stack.jumlahTugas();
                    System.out.println("Jumlah tugas yang sudah dikumpulkan: " + jumlah);
                    break;
                default : 
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 6);
    }
}

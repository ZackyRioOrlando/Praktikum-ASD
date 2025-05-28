import java.util.Scanner;

public class MainTugas27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueTugas27 antrian = new QueueTugas27(10);

        int pilihan;
        do {
            System.out.println("\n--- MENU LAYANAN UNIT KEMAHASISWAAN ---");
            System.out.println("1. Tambah Antrian Mahasiswa");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Cek Antrian Kosong");
            System.out.println("4. Cek Antrian Penuh");
            System.out.println("5. Tampilkan Antrian Terdepan");
            System.out.println("6. Tampilkan Antrian Terakhir");
            System.out.println("7. Tampilkan Jumlah Antrian");
            System.out.println("8. Tampilkan Semua Antrian");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    antrian.enqueue(new MahasiswaTugas27(nim, nama, prodi));
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    System.out.println("Antrian kosong: " + antrian.isEmpty());
                    break;
                case 4:
                    System.out.println("Antrian penuh: " + antrian.isFull());
                    break;
                case 5:
                    antrian.peekFront();
                    break;
                case 6:
                    antrian.peekRear();
                    break;
                case 7:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.getSize());
                    break;
                case 8:
                    antrian.printQueue();
                    break;
                case 9:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Menu tidak tersedia.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}

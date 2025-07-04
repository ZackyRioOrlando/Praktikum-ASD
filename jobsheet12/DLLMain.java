import java.util.Scanner;
public class DLLMain {
    public static Mahasiswa27 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM: ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = scan.nextDouble(); 
        scan.nextLine();
        return new Mahasiswa27(nim, nama, kelas, ipk);
    }
    public static void main(String[] args) {
        DoubleLinkedList27 list = new DoubleLinkedList27();
        Scanner scan = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus di awal");
            System.out.println("4. Hapus di akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("7. Sisipkan setelah NIM tertentu");
            System.out.println("8. Tambah data pada indeks tertentu");
            System.out.println("9. Hapus node setelah NIM tertentu");
            System.out.println("10. Hapus data pada indeks tertentu");
            System.out.println("11. Tampilkan data pertama");
            System.out.println("12. Tampilkan data terakhir");
            System.out.println("13. Tampilkan data pada indeks tertentu");
            System.out.println("14. Lihat jumlah data (size)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1 -> {
                Mahasiswa27 mhs = inputMahasiswa(scan);
                list.addFirst(mhs);
                }
                case 2 -> {
                    Mahasiswa27 mhs = inputMahasiswa(scan);
                    list.addLast(mhs);
                }
                case 3 -> list.removeFirst();
                case 4 -> list.removeLast();
                case 5 -> list.print();
                case 6 -> {
                    System.out.println("Masukkan NIM yang dicari: ");
                    String nim = scan.nextLine();
                    Node27 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan:");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                }
                case 7 -> {
                    System.out.print("Masukkan NIM setelah node yang ingin disisipkan: ");
                    String keyNim = scan.nextLine();
                    System.out.println("Masukkan data mahasiswa yang akan disisipkan:");
                    Mahasiswa27 mhs = inputMahasiswa(scan);
                    list.inserAfter(keyNim, mhs);
                }
                case 8 -> {
                    System.out.print("Masukkan indeks: ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    Mahasiswa27 mhs = inputMahasiswa(scan);
                    list.add(index, mhs);
                }
                case 9 -> {
                    System.out.print("Masukkan NIM setelah node yang akan dihapus: ");
                    String keyNim = scan.nextLine();
                    list.removeAfter(keyNim);
                }
                case 10 -> {
                    System.out.print("Masukkan indeks yang akan dihapus: ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    list.remove(index);
                }
                case 11 -> list.getFirst();
                case 12 -> list.getLast();
                case 13 -> {
                    System.out.print("Masukkan indeks: ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    list.getIndex(index);
                }
                case 14 -> {
                    System.out.println("Jumlah data dalam linked list: " + list.getSize());
                }
                case 0 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        scan.close();
    }
}

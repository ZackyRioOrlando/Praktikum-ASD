import java.util.Scanner;

public class Tugas327 {
    static Scanner input = new Scanner(System.in);
    
    static String[] namaMataKuliah;
    static int[] sks;
    static int[] semester;
    static String[] hariKuliah;
    static int jumlahMK;

    public static void main(String[] args) {
        inputDataMataKuliah();
        menu();
    }

    static void inputDataMataKuliah() {
        System.out.print("Masukkan jumlah mata kuliah: ");
        jumlahMK = input.nextInt();
        input.nextLine();

        namaMataKuliah = new String[jumlahMK];
        sks = new int[jumlahMK];
        semester = new int[jumlahMK];
        hariKuliah = new String[jumlahMK];

        for (int i = 0; i < jumlahMK; i++) {
            System.out.println("\nMasukkan data mata kuliah ke-" + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            namaMataKuliah[i] = input.nextLine();
            System.out.print("SKS: ");
            sks[i] = input.nextInt();
            System.out.print("Semester: ");
            semester[i] = input.nextInt();
            input.nextLine();
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = input.nextLine();
        }
    }

    static void menu() {
        int pilihan;
        do {
            System.out.println("\n==========================");
            System.out.println("======= JADWAL KULIAH ======");
            System.out.println("==========================");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal berdasarkan hari");
            System.out.println("3. Tampilkan jadwal berdasarkan semester");
            System.out.println("4. Cari mata kuliah");
            System.out.println("5. Keluar");
            System.out.println("==========================");
            System.out.print("Pilih menu (1-5): ");
            pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    seluruhJadwal();
                    break;
                case 2:
                    jadwalBerdasarkanHari();
                    break;
                case 3:
                    jadwalBerdasarkanSemester();
                    break;
                case 4:
                    cariMataKuliah();
                    break;
                case 5:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih kembali.");
            }
        } while (pilihan != 5);
    }

    static void seluruhJadwal() {
        System.out.println("\n===== JADWAL SELURUH MATA KULIAH =====");
        for (int i = 0; i < jumlahMK; i++) {
            System.out.println(namaMataKuliah[i] + " | " + sks[i] + " SKS | Semester " + semester[i] + " | Hari: " + hariKuliah[i]);
        }
    }

    static void jadwalBerdasarkanHari() {
        System.out.print("\nMasukkan hari kuliah yang ingin ditampilkan: ");
        String hariCari = input.nextLine();
        boolean ditemukan = false;

        System.out.println("\n===== JADWAL KULIAH HARI " + hariCari.toUpperCase() + " =====");
        for (int i = 0; i < jumlahMK; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hariCari)) {
                System.out.println(namaMataKuliah[i] + " | " + sks[i] + " SKS | Semester " + semester[i] + " | Hari: " + hariKuliah[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah pada hari " + hariCari);
        }
    }

    static void jadwalBerdasarkanSemester() {
        System.out.print("\nMasukkan semester yang ingin ditampilkan: ");
        int semesterCari = input.nextInt();
        boolean ditemukan = false;

        System.out.println("\n===== JADWAL KULIAH SEMESTER " + semesterCari + " =====");
        for (int i = 0; i < jumlahMK; i++) {
            if (semester[i] == semesterCari) {
                System.out.println(namaMataKuliah[i] + " | " + sks[i] + " SKS | Semester " + semester[i] + " | Hari: " + hariKuliah[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah untuk semester " + semesterCari);
        }
    }

    static void cariMataKuliah() {
        System.out.print("\nMasukkan nama mata kuliah yang ingin dicari: ");
        String namaCari = input.nextLine();
        boolean ditemukan = false;

        System.out.println("\n===== HASIL PENCARIAN MATA KULIAH =====");
        for (int i = 0; i < jumlahMK; i++) {
            if (namaMataKuliah[i].equalsIgnoreCase(namaCari)) {
                System.out.println("Nama Mata Kuliah: " + namaMataKuliah[i]);
                System.out.println("SKS: " + sks[i]);
                System.out.println("Semester: " + semester[i]);
                System.out.println("Hari Kuliah: " + hariKuliah[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah dengan nama \"" + namaCari + "\" tidak ditemukan.");
        }
    }
}

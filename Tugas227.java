import java.util.Scanner;

public class Tugas227 {
    static double rumusVolume(double s) {
        return s * s * s;
    }

    static double rumusLuasPermukaan(double s) {
        return 6 * s * s;
    }

    static double rumusKeliling(double s) {
        return 12 * s;
    }

    static void menu() {
        System.out.println("==============================");
        System.out.println("====== Menghitung Kubus ======");
        System.out.println("==============================");
        System.out.println("1. Hitung Volume Kubus");
        System.out.println("2. Hitung Luas Permukaan Kubus");
        System.out.println("3. Hitung Keliling Kubus");
        System.out.println("4. Keluar");
        System.out.println("===========================");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        
        do {
            menu();
            System.out.print("Pilih menu (1-4): ");
            pilihan = input.nextInt();

            if (pilihan >= 1 && pilihan <= 3) {
                System.out.print("Masukkan panjang sisi kubus: ");
                double sisi = input.nextDouble();

                if (sisi <= 0) {
                    System.out.println("Panjang sisi harus lebih dari 0!");
                } else {
                    switch (pilihan) {
                        case 1:
                            System.out.println("Volume Kubus: " + rumusVolume(sisi));
                            break;
                        case 2:
                            System.out.println("Luas Permukaan Kubus: " + rumusLuasPermukaan(sisi));
                            break;
                        case 3:
                            System.out.println("Keliling Kubus: " + rumusKeliling(sisi));
                            break;
                    }
                }
            } else if (pilihan == 4) {
                System.out.println("Terima Kasih");
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }

            System.out.println();
        } while (pilihan != 4);

    }
}


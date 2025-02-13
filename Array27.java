import java.util.Scanner;

public class Array27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] mataKuliah = {
            "MK Pancasila",
            "MK Konsep Teknologi Informasi",
            "MK Critical Thinking dan Problem Solving",
            "MK Matematika Dasar",
            "MK Bahasa Inggris",
            "MK Dasar Pemrograman",
            "MK Praktikum Dasar Pemrograman",
            "MK Keselamatan dan Kesehatan Kerja"
        };

        double[] nilaiAngka = new double[mataKuliah.length];
        String[] nilaiHuruf = new String[mataKuliah.length];
        double[] bobotNilai = new double[mataKuliah.length];

        System.out.println("======================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("======================");

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai Angka untuk " + mataKuliah[i] + " : ");
            nilaiAngka[i] = input.nextDouble();

            if (nilaiAngka[i] >= 80) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.00;
            } else if (nilaiAngka[i] >= 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.50;
            } else if (nilaiAngka[i] >= 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.00;
            } else if (nilaiAngka[i] >= 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.50;
            } else if (nilaiAngka[i] >= 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.00;
            } else if (nilaiAngka[i] >= 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.00;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.00;
            }
        }

        System.out.println("======================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("======================");
        System.out.printf("%-40s %-15s %-15s %-15s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        double totalBobot = 0;
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("%-40s %-15.2f %-15s %-15.2f\n", mataKuliah[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
            totalBobot += bobotNilai[i];
        }

        double ip = totalBobot / mataKuliah.length;

        System.out.println("======================");
        System.out.printf("IP : %.2f\n", ip);

    }
}


import java.util.Scanner;
public class MataKuliahDemo27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String kode, nama, dummy;
        int sks, jumlahJam;

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = sc.nextInt();
        sc.nextLine();

        MataKuliah27[] arrayOfMataKuliah = new MataKuliah27[jumlahMataKuliah];

        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah[i] = new MataKuliah27("", "", 0, 0);
            arrayOfMataKuliah[i].tambahData();
        }

        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
                arrayOfMataKuliah[i].cetakInfo();
        }
    }
}


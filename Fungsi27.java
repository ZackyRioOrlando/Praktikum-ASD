import java.util.Scanner;

public class Fungsi27 {
    static int[][] stokBunga;
    static int[] hargaBunga = {75000, 50000, 60000, 10000};
    static String[] cabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        stokBunga = new int[cabang.length][4];

        System.out.println("=========================");
        System.out.println("Input Stok Bunga per Cabang");
        System.out.println("=========================");
        for (int i = 0; i < cabang.length; i++) {
            System.out.println("Cabang: " + cabang[i]);
            System.out.print("Aglonema: ");
            stokBunga[i][0] = input.nextInt();
            System.out.print("Keladi: ");
            stokBunga[i][1] = input.nextInt();
            System.out.print("Alocasia: ");
            stokBunga[i][2] = input.nextInt();
            System.out.print("Mawar: ");
            stokBunga[i][3] = input.nextInt();
            System.out.println();
        }

        tampilkanPendapatan();
        tampilkanTotalStok();
        kurangiStokBunga();
        tampilkanStokSetelahPengurangan();

        input.close();
    }

    static void tampilkanPendapatan() {
        System.out.println("=========================");
        System.out.println("Pendapatan setiap cabang jika semua bunga terjual:");
        for (int i = 0; i < stokBunga.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stokBunga[i].length; j++) {
                pendapatan += stokBunga[i][j] * hargaBunga[j];
            }
            System.out.println(cabang[i] + " : Rp " + pendapatan);
        }
        System.out.println();
    }

    static void tampilkanTotalStok() {
        int[] totalStok = new int[4];
        for (int i = 0; i < stokBunga.length; i++) {
            for (int j = 0; j < stokBunga[i].length; j++) {
                totalStok[j] += stokBunga[i][j];
            }
        }

        System.out.println("=========================");
        System.out.println("Total stok bunga di semua cabang:");
        System.out.println("Aglonema : " + totalStok[0]);
        System.out.println("Keladi   : " + totalStok[1]);
        System.out.println("Alocasia : " + totalStok[2]);
        System.out.println("Mawar    : " + totalStok[3]);
        System.out.println();
    }

    static void kurangiStokBunga() {
        int[] bungaMati = {-1, -2, 0, -5};
        for (int i = 0; i < stokBunga.length; i++) {
            for (int j = 0; j < stokBunga[i].length; j++) {
                stokBunga[i][j] += bungaMati[j];
            }
        }
    }

    static void tampilkanStokSetelahPengurangan() {
        System.out.println("=========================");
        System.out.println("Stok bunga setelah pengurangan karena ada yang mati:");
        for (int i = 0; i < stokBunga.length; i++) {
            System.out.println(cabang[i] + " - Aglonema: " + stokBunga[i][0] +
                ", Keladi: " + stokBunga[i][1] +
                ", Alocasia: " + stokBunga[i][2] +
                ", Mawar: " + stokBunga[i][3]);
        }
    }
}

public class SLLMain27 {
    public static void main(String[] args) {
        SingleLinkedList27 sll = new SingleLinkedList27();

        Mahasiswa27 mhs1 = new Mahasiswa27("21212203", "Dirga", "4D", 3.6);
        Mahasiswa27 mhs2 = new Mahasiswa27("22212202", "Cintia", "3C", 3.5);
        Mahasiswa27 mhs3 = new Mahasiswa27("23212201", "Bimon", "2B", 3.8);
        Mahasiswa27 mhs4 = new Mahasiswa27("24212200", "Alvaro", "1A", 4.0);

        sll.print();
        sll.addFirst(mhs1);
        sll.print();
        sll.addLast(mhs4);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(1, mhs2);
        sll.print();

        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}

/* import java.util.Scanner;

public class SLLMain27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SingleLinkedList27 sll = new SingleLinkedList27();
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Data mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = input.nextLine();
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Kelas: ");
            String kelas = input.nextLine();
            System.out.print("IPK: ");
            double ipk = input.nextDouble();
            input.nextLine();

            Mahasiswa27 mhs = new Mahasiswa27(nim, nama, kelas, ipk);
            sll.addLast(mhs);
        }

        System.out.println("\nData mahasiswa dalam linked list:");
        sll.print();
    }
} */
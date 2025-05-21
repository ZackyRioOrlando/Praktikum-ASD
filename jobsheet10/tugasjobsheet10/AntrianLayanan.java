public class AntrianLayanan {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int sudahDiproses;

    public AntrianLayanan(int n) {
        max = n;
        data = new Mahasiswa[max];
        size = 0;
        front = 0;
        rear = -1;
        sudahDiproses = 0;
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    public boolean IsFull() {
        return size == max;
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh!");
        } else {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
        }
    }

    public void panggilKRS() {
        if (size < 2) {
            System.out.println("Jumlah antrian kurang dari 2.");
        } else {
            System.out.println("Mahasiswa dipanggil untuk proses KRS:");
            for (int i = 0; i < 2; i++) {
                System.out.print((i + 1) + ". ");
                data[front].tampilkanData();
                front = (front + 1) % max;
                size--;
                sudahDiproses++;
            }
        }
    }

    public void lihatTerdepan() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("2 Antrian terdepan:");
            for (int i = 0; i < Math.min(2, size); i++) {
                int index = (front + i) % max;
                System.out.print((i + 1) + ". ");
                data[index].tampilkanData();
            }
        }
    }

    public void lihatAkhir() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian paling belakang:");
            data[rear].tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Seluruh Mahasiswa dalam Antrian:");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                System.out.print((i + 1) + ". ");
                data[index].tampilkanData();
            }
        }
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        sudahDiproses = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getSudahDiproses() {
        return sudahDiproses;
    }

    public int getBelumDiproses() {
        return 30 - sudahDiproses;
    }
}
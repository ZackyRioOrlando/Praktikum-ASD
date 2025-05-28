public class QueueTugas27 {
    NodeTugas27 front, rear;
    int size, max;

    public QueueTugas27(int max) {
        this.max = max;
        this.size = 0;
        front = rear = null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(MahasiswaTugas27 mhs) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh!");
            return;
        }
        NodeTugas27 newNode = new NodeTugas27(mhs);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang bisa dipanggil.");
            return;
        }
        System.out.println("Memanggil mahasiswa:");
        front.data.tampil();
        front = front.next;
        size--;
        if (front == null) rear = null;
    }

    public void peekFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa di depan antrian:");
            front.data.tampil();
        }
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa di akhir antrian:");
            rear.data.tampil();
        }
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Isi antrian:");
        NodeTugas27 temp = front;
        while (temp != null) {
            temp.data.tampil();
            temp = temp.next;
        }
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public int getSize() {
        return size;
    }
}

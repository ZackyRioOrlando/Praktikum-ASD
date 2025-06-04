public class DoubleLinkedList27 {
    Node27 head;
    Node27 tail;
    int size;

    public DoubleLinkedList27() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa27 data) {
        Node27 newNode27 = new Node27(data);
        if (isEmpty()) {
            head = tail = newNode27;
        } else {
            newNode27.next = head;
            head.prev = newNode27;
            head = newNode27;
        }
        size++;
    }

    public void addLast(Mahasiswa27 data) {
        Node27 newNode27 = new Node27(data);
        if (isEmpty()) {
            head = tail = newNode27;
        } else {
            tail.next = newNode27;
            newNode27.prev = tail;
            tail = newNode27;
        }
        size++;
    }

    public void inserAfter(String keyNim, Mahasiswa27 data) {
        Node27 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }
        Node27 newNode27 = new Node27(data);
        if (current == tail) {
            current.next = newNode27;
            newNode27.prev = current;
            tail = newNode27;
        } else {
            newNode27.next = current.next;
            newNode27.prev = current;
            current.next.prev = newNode27;
            current.next = newNode27;
        }
        size++;
        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak ada data yang ditampilkan.");
        } else {
            Node27 current = head;
            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        } 
        Mahasiswa27 removeData = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
        removeData.tampil();
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List Kosong, tidak bisa dihapus.");
            return;
        }
        Mahasiswa27 removeData = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
        removeData.tampil();
    }

    public Node27 search(String nim) {
        Node27 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void add(int index, Mahasiswa27 data) {
        if (index < 0) {
            System.out.println("Indeks tidak boleh negatif.");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node27 current = head;
        int count = 0;
        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }
        if (current == null) {
            System.out.println("Indeks melebihi panjang list. Data akan ditambahkan di akhir.");
            addLast(data);
            return;
        }
        Node27 newNode = new Node27(data);
        newNode.next = current.next;
        newNode.prev = current;
        if (current.next != null) {
            current.next.prev = newNode;
        } else {
            tail = newNode;
        }
        current.next = newNode;
        System.out.println("Data berhasil ditambahkan pada indeks ke-" + index);
        }

    public void removeAfter(String keyNim) {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada yang bisa dihapus.");
            return;
        }
        Node27 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }
        if (current.next == null) {
            System.out.println("Tidak ada node setelah NIM " + keyNim + " untuk dihapus.");
            return;
        }
        Node27 nodeToRemove = current.next;
        Mahasiswa27 removeData = nodeToRemove.data;
        if (nodeToRemove == tail) {
            tail = current;
            current.next = null;
        } else {
            current.next = nodeToRemove.next;
            nodeToRemove.next.prev = current;
        }
        System.out.println("Data sudah berhasil dihapus setelah NIM " + keyNim + ". Data yang terhapus adalah:");
        removeData.tampil();
    }

    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        if (index < 0) {
            System.out.println("Indeks tidak boleh negatif.");
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        Node27 current = head;
        int count = 0;
        while (current != null && count < index) {
            current = current.next;
            count++;
        }
        if (current == null) {
            System.out.println("Indeks melebihi panjang list, tidak ada data yang dihapus.");
            return;
        }
        if (current == tail) {
            removeLast();
            return;
        }
        Mahasiswa27 removeData = current.data;
        current.prev.next = current.next;
        current.next.prev = current.prev;
        System.out.println("Data sudah berhasil dihapus pada indeks ke-" + index + ". Data yang terhapus adalah:");
        removeData.tampil();
    }

    public void getFirst() {
    if (isEmpty()) {
        System.out.println("List kosong. Tidak ada data di awal.");
    } else {
        System.out.println("Data pada node pertama:");
        head.data.tampil();
    }
}

    public void getLast() {
        if (isEmpty()) {
            System.out.println("List kosong. Tidak ada data di akhir.");
        } else {
            System.out.println("Data pada node terakhir:");
            tail.data.tampil();
        }
    }

    public void getIndex(int index) {
        if (isEmpty()) {
            System.out.println("List kosong. Tidak ada data.");
            return;
        }
        if (index < 0) {
            System.out.println("Indeks tidak boleh negatif.");
            return;
        }
        Node27 current = head;
        int count = 0;
        while (current != null && count < index) {
            current = current.next;
            count++;
        }
        if (current == null) {
            System.out.println("Indeks melebihi panjang list.");
        } else {
            System.out.println("Data pada indeks ke-" + index + ":");
            current.data.tampil();
        }
    }

    public int getSize() {
        return size;
    }
}

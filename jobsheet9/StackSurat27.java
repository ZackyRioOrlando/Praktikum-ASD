public class StackSurat27 {
    Surat27[] stack;
    int top;
    int size;

    public StackSurat27(int size) {
        this.size = size;
        stack = new Surat27[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat27 surat) {
        if (!isFull()) {
            stack[++top] = surat;
            System.out.println("Surat berhasil ditambahkan.");
        } else {
            System.out.println("Stack penuh. Tidak bisa menambahkan surat.");
        }
    }

    public Surat27 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong. Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat27 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong. Tidak ada surat terakhir.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                stack[i].tampilkan();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat dengan nama " + nama + " tidak ditemukan.");
        }
    }
}

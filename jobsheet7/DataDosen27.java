public class DataDosen27 {
    Dosen27[] dataDosen27 = new Dosen27[10];
    int idx = 0;

    void tambah(Dosen27 dsn) {
        if (idx < dataDosen27.length) {
            dataDosen27[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data penuh!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen27[i].tampil();
        }
    }

    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen27[j].usia > dataDosen27[j + 1].usia) {
                    Dosen27 temp = dataDosen27[j];
                    dataDosen27[j] = dataDosen27[j + 1];
                    dataDosen27[j + 1] = temp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen27[j].usia > dataDosen27[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen27 temp = dataDosen27[maxIdx];
            dataDosen27[maxIdx] = dataDosen27[i];
            dataDosen27[i] = temp;
        }
    }

    void pencarianDataSequential27(String namaCari) {
        int jumlahTemuan = 0;
        for (int i = 0; i < idx; i++) {
            if (dataDosen27[i].nama.equalsIgnoreCase(namaCari)) {
                dataDosen27[i].tampil();
                jumlahTemuan++;
            }
        }
        if (jumlahTemuan == 0) {
            System.out.println("Data dosen dengan nama \"" + namaCari + "\" tidak ditemukan.");
        } else if (jumlahTemuan > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan nama \"" + namaCari + "\".");
        }
    }

    void pencarianDataBinary27(int usiaCari) {
        sortingASC();
        int left = 0;
        int right = idx - 1;
        int jumlahTemuan = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (dataDosen27[mid].usia == usiaCari) {
                int i = mid;
                while (i >= 0 && dataDosen27[i].usia == usiaCari) {
                    dataDosen27[i].tampil();
                    jumlahTemuan++;
                    i--;
                }
                i = mid + 1;
                while (i < idx && dataDosen27[i].usia == usiaCari) {
                    dataDosen27[i].tampil();
                    jumlahTemuan++;
                    i++;
                }
                break;
            } else if (dataDosen27[mid].usia > usiaCari) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (jumlahTemuan == 0) {
            System.out.println("Data dosen dengan usia " + usiaCari + " tidak ditemukan.");
        } else if (jumlahTemuan > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan usia " + usiaCari + ".");
        }
    }
}

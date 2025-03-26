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
}


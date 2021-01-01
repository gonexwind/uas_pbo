package soal_satu.agregasi;

import java.util.List;

public class Jurusan {
    private String nama;
    List<Dosen> dosenList;

    public Jurusan(String nama, List<Dosen> dosenList) {
        this.nama = nama;
        this.dosenList = dosenList;
    }

    void getInfo() {
        System.out.println("Jurusan : " + this.nama);
        System.out.println("List Dosen :");
        for (Dosen dosen: dosenList) {
            System.out.println(dosen.getNama());
        }
    }

}

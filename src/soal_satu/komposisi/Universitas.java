package soal_satu.komposisi;

import java.util.ArrayList;
import java.util.List;

public class Universitas {
    private String nama;
    private List<Jurusan> jurusanList;

    public Universitas(String nama) {
        this.nama = nama;
    }

    void buatJurusan() {
        Jurusan ti = new Jurusan("Teknik Informatika");
        Jurusan si = new Jurusan("Sistem Informasi");
        jurusanList = new ArrayList<Jurusan>();
        jurusanList.add(ti);
        jurusanList.add(si);
    }

    void getInfo() {
        System.out.println("Nama Universitas : " + nama);
        System.out.println("Jurusan : ");
        for (Jurusan jurusan : jurusanList) {
            jurusan.getNama();
        }
    }
}

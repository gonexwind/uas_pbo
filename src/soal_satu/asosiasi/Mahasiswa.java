package soal_satu.asosiasi;

public class Mahasiswa {
    private String nama;
    private Dosen dosen;

    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    void getNama() {
        System.out.println("Nama Mahasiswa : " + this.nama);
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }

    void getInfo() {
        System.out.println("Nama Mahasiswa : " + this.nama);
        this.dosen.getNama();
        System.out.println("====================================");
    }
}

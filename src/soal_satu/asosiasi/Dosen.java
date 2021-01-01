package soal_satu.asosiasi;

public class Dosen {
    private String nama;
    private Mahasiswa mahasiswa;

    public Dosen(String nama) {
        this.nama = nama;
    }

    void getNama() {
        System.out.println("Nama Dosen : " + this.nama);
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    void getInfo() {
        System.out.println("Nama Dosen : " + this.nama);
        this.mahasiswa.getNama();
        System.out.println("====================================");
    }
}

package soal_satu.asosiasi;

public class Main {
    public static void main(String[] args) {
        Dosen kakashi = new Dosen("Kakashi");
        Mahasiswa fikky = new Mahasiswa("Fikky");
        Mahasiswa jisoo = new Mahasiswa("Jisoo");

        kakashi.setMahasiswa(jisoo);
        kakashi.getInfo();

        kakashi.setMahasiswa(fikky);
        kakashi.getInfo();

        fikky.setDosen(kakashi);
        fikky.getInfo();

        jisoo.setDosen(kakashi);
        jisoo.getInfo();
    }
}

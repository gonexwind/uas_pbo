package soal_empat;

public class Main {
    public static void main(String[] args) {
        // 201851136 - Fikky Ardianto
        MataKuliah pbo = new MataKuliah("Pemrograman Berorientasi Objek", "MTI504", 2);
        MataKuliah ppbo = new MataKuliah("Praktikum Pemrograman Berorientasi Objek", "MTI504", 1);
        Mahasiswa amanda = new Mahasiswa("Amanda Manopo", pbo);
        Mahasiswa billy = new Mahasiswa("Billy Syahputra", ppbo);

        amanda.getInfo();
        billy.getInfo();


    }
}

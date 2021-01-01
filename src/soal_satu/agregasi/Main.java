package soal_satu.agregasi;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dosen konohamaru = new Dosen("Konohamaru");
        Dosen shikamaru = new Dosen("Shikamaru");

        List<Dosen> dosenList = new ArrayList<>();
        dosenList.add(konohamaru);
        dosenList.add(shikamaru);

        Jurusan ti = new Jurusan("Teknik Informatika", dosenList);
        ti.getInfo();
    }
}

package pbo2.pkg10119073.latihan52.siapakamu;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk menampilkan status dosen dan mahasiswa
 * dengan konsep pewarisan class
 *
 */

public class PBO210119073Latihan52SiapaKamu {

    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.setNip("41227829930");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        System.out.println("NIP DOSEN : "+dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();
        
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("10119073");
        mahasiswa.setNama("Aghnia Dewi Mahiranie");
        mahasiswa.setUmur(18);
        mahasiswa.setKelas("PBO2");
        System.out.println("");
        System.out.println("\nNIM MAHASISWA: "+mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
        System.out.println("");
    }
    
}

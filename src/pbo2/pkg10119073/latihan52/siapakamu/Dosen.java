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

public class Dosen extends Manusia{
    private String nip, mataKuliah;
    
    public String getNip(){
        return nip;
    }
    
    public void setNip(String nip){
        this.nip = nip;
    }
    
    public String getMataKuliah(){
        return mataKuliah;
    }
    
    public void setMataKuliah(String mataKuliah){
        this.mataKuliah = mataKuliah;
    }
    
    public void mengajarApa(){
        System.out.print("Saya "+nama+" umur "+umur+" tahun sedang mengajar matakuliah "+mataKuliah);
    }
    
    public void siapaKamu(){
        System.out.println("Saya Dosen");
    }
}

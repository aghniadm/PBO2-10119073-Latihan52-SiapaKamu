/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10119073.latihan52.siapakamu;

/**
 *
 * @author ACER
 */
public class Mahasiswa extends Manusia{
    private String nim, kelas;
    
    public String getNim(){
        return nim;
    }
    
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public String getKelas(){
        return kelas;
    }
    
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    
    public void kelasApa(){
        System.out.print("Saya "+nama+" umur "+umur+" tahun sedang belajar di kelas "+kelas);
    }
    
    public void siapaKamu(){
        System.out.println("Saya Mahasiswa");
    }
}

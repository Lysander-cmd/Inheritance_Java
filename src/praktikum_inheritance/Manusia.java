/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum_inheritance;

/**
 *
 * @author USER
 */
public class Manusia {

    private String nama;
    private String NIK;
    boolean jenisKelamin;
    private boolean menikah;

    public Manusia(String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.NIK = NIK;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public boolean getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public boolean isMenikah() {
        return menikah;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public double getTunjangan() {
        if (menikah) {
           return jenisKelamin ? 25 : 20;
       } else {
           return 15;
       }
    }
    public double getPendapatan(){
        return getTunjangan();
        
    }
    public String toString() {
  String jk = jenisKelamin ? "Laki-laki" : "Perempuan";
  return "Nama : " + nama + "\n" +
         "NIK : " + NIK + "\n" +
         "Jenis Kelamin : " + jk + "\n" +
         "Pendapatan : " + getPendapatan() + "$";
}

}

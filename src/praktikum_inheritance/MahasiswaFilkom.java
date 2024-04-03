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
public class MahasiswaFilkom extends Manusia{
    private static int totalMahasiswa = 0;

    
    private String NIM;
    private double IPK;

    public MahasiswaFilkom(String nama, String NIK, boolean jenisKelamin, boolean menikah, String NIM, double IPK) {
       super(nama, NIK, jenisKelamin, menikah);
       this.NIM = NIM;
       this.IPK = IPK;
       totalMahasiswa++;
   }
    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }
    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public double getIPK() {
        return IPK;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }
    
    public String getStatus(){
        int angkatan = Integer.parseInt(NIM.substring(0, 2));
       int prodi = Integer.parseInt(NIM.substring(6, 7));
       String prodiStr = "";
       switch (prodi) {
           case 2:
               prodiStr = "Teknik Meniup Gelembung";
               break;
           case 3:
               prodiStr = "Teknik Berburu Ubur Ubur";
               break;
           case 4:
               prodiStr = "Sistem Perhamburgeran";
               break;
           case 6:
               prodiStr = "Pendidikan Chum Bucket";
               break;
           case 7:
               prodiStr = "Teknologi Telepon Kerang";
               break;
       }
       return prodiStr + ", " + 20+angkatan;
   }
    
    public double getBeasiswa(){
        if (IPK >= 3.5) {
           return 75;
       } else if (IPK >= 3.0) {
           return 50;
       } else {
           return 0;
       }
    }
    @Override
    public double getPendapatan() {
    return super.getPendapatan() + getBeasiswa();
}
    public String toString() {
       return "mahasiswa :\n" +
                super.toString() + "\n" +
                "IPK : " + IPK + "\n" +
                "NIM : " + NIM + "\n" +
                "Status : " + getStatus();
   }
    
    
   
    
    
    
}

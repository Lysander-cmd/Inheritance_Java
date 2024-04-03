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
public class Manager extends Pekerja{
    private static int totalManager = 0;
    
     private int lamaKerja;

    public Manager(int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin, boolean menikah, int lamaKerja) {
        super(jamKerja, hariKerja, NIP, nama, NIK, jenisKelamin, menikah);
        this.lamaKerja = lamaKerja ;
        totalManager++;
    }
public static int getTotalManager() {
        return totalManager;
    }
   public int getLamaKerja() {
       return lamaKerja;
   }

   public void setLamaKerja(int lamaKerja) {
       this.lamaKerja = lamaKerja ;
   }



   @Override
   public double getPendapatan() {
    double bonusManager = super.getBonus() * 0.3; // 30% dari pendapatan

    // Hitung pendapatan total
    double pendapatan = super.getGaji() + super.getBonus()+bonusManager + super.getTunjangan()+15; // Pendapatan sebelum penambahan bonus

    

    return pendapatan;
   }
   

   @Override
   public String toString() {
       return "Data Diri Manajer\n" +
                "Nama : " + super.getNama() + "\n" +
                "NIK : " + super.getNIK() + "\n" +
                "Jenis Kelamin : " + (super.jenisKelamin ? "Laki-laki" : "Perempuan") + "\n" +
                "Pendapatan : " + getPendapatan() + "\n" +
                "Bonus : " + getBonus()*1.3 + "\n" +
                "Gaji : " + getGaji() + "\n" +
                "Status : " + getStatus() + "\n" +
                "Lama Kerja : " + lamaKerja;
    }
    
}

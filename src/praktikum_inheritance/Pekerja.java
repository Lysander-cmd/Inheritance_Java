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
public class Pekerja extends Manusia{
    
   private double gaji;
   private double bonus;
   private int jamKerja;
   private int hariKerja;
   
   private String NIP;
   
     public Pekerja(int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        super(nama, NIK, jenisKelamin, menikah);
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.NIP = NIP;
        this.gaji = hitungGaji();
        this.bonus = hitungBonus();
    }
    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }
     public String getStatus() {
       int cabang = Integer.parseInt(NIP.substring(0, 1));
       int cabangKe = Integer.parseInt(NIP.substring(2, 3));
       int departemen = Integer.parseInt(NIP.substring(6, 7));
       String cabangStr = "";
       String departemenStr = "";
       switch (cabang) {
           case 1:
               cabangStr = "Mondstadt";
               break;
           case 2:
               cabangStr = "Liyue";
               break;
           case 3:
               cabangStr = "Inazuma";
               break;
           case 4:
               cabangStr = "Sumeru";
               break;
           case 5:
               cabangStr = "Fontaine";
               break;
           case 6:
               cabangStr = "Natlan";
               break;
           case 7:
               cabangStr = "Snezhnaya";
               break;
       }
       switch (departemen) {
           case 1:
               departemenStr = "Pemasaran";
               break;
           case 2:
               departemenStr = "Humas";
               break;
           case 3:
               departemenStr = "Riset";
               break;
           case 4:
               departemenStr = "Teknologi";
               break;
           case 5:
               departemenStr = "Personalia";
               break;
           case 6:
               departemenStr = "Akademik";
               break;
           case 7:
               departemenStr = "Administrasi";
               break;
           case 8:
               departemenStr = "Operasional";
               break;
           case 9:
               departemenStr = "Pembangunan";
               break;
       }
       return departemenStr + ", " + cabangStr + " cabang " + cabangKe;
   }
     
     private double hitungGaji() {
        double gajiNormal = 0;
        for (int i = 0; i < hariKerja; i++) {
            int jamLembur = jamKerja > 7 ? jamKerja - 7 : 0;
            gajiNormal += 7 * 15; // Gaji untuk 7 jam pertama
            gajiNormal += jamLembur * 15; // Gaji untuk jam lembur
        }
        return gajiNormal;
    }

    private double hitungBonus() {
        double bonusLibur = 0;
        double bonusLembur = 0;
        int jumlahMinggu = hariKerja / 7;
        int sisaHari = hariKerja % 7;
        int jumlahHariLibur = jumlahMinggu * 2;
        if (sisaHari > 5) {
            jumlahHariLibur += 1;
        }
        if (jamKerja > 5) {
            bonusLembur = (hariKerja - jumlahHariLibur) * (jamKerja - 7) * 7;
        }
        bonusLibur = jumlahHariLibur * jamKerja * 20;
        bonus = bonusLibur + bonusLembur;
        return bonus;
    }
    public double getPendapatan() {
  return gaji + bonus;
}

  public String toString() {
  String jk = jenisKelamin ? "Laki-laki" : "Perempuan";
  return "pekerja :\n" +
         super.toString() + "\n" +
         "Bonus : " + bonus + "$\n" +
         "Gaji : " + gaji + "$\n" +
         "Status : " + getStatus();
}
}

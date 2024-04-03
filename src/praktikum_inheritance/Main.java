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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Objek Pekerja
        Pekerja pekerja1 = new Pekerja(8, 20, "123456789", "John Doe", "1234567890", true, false);
        Pekerja pekerja2 = new Pekerja(7, 22, "987654321", "Jane Smith", "0987654321", false, true);
        Pekerja pekerja3 = new Pekerja(9, 18, "567890123", "Michael Johnson", "5678901234", true, true);

        // Objek Manajer
        Manager manager1 = new Manager(9, 20, "204837283728", "Lyra Hertin", "351707384392", false, false, 1500);
        Manager manager2 = new Manager(8, 21, "192837465728", "Ethan Brown", "123456789012", true, true, 1800);
        Manager manager3 = new Manager(7, 19, "382910475628", "Sophia Lee", "098765432109", false, true, 2000);

        // Objek Mahasiswa
        MahasiswaFilkom mhs1 = new MahasiswaFilkom("I Putu Yoga", "351923848239", false, false, "235150601111018", 3.70);        
        MahasiswaFilkom mhs2 = new MahasiswaFilkom("Ni Luh Made", "351923848240", false, true, "225150601111019", 3.85);
        MahasiswaFilkom mhs3 = new MahasiswaFilkom("Komang Bagus", "351923848241", true, false, "215150601111020", 3.65);

        // Objek Manusia
        Manusia manusia1 = new Manusia("John", "123456789", true, false);
        Manusia manusia2 = new Manusia("Jane", "987654321", false, true);
        Manusia manusia3 = new Manusia("Michael", "567890123", true, true);

        // Menampilkan informasi objek
        System.out.println("Objek Pekerja:");
        System.out.println(pekerja1+"\n");
        System.out.println(pekerja2+"\n");
        System.out.println(pekerja3+"\n");

        System.out.println("\nObjek Manajer:");
        System.out.println(manager1+"\n");
        System.out.println(manager2+"\n");
        System.out.println(manager3+"\n");

        System.out.println("\nObjek Mahasiswa:");
        System.out.println(mhs1+"\n");
        System.out.println(mhs2+"\n");
        System.out.println(mhs3+"\n");

        System.out.println("\nObjek Manusia:");
        System.out.println(manusia1+"\n");
        System.out.println(manusia2+"\n");
        System.out.println(manusia3+"\n");

    }
    
}

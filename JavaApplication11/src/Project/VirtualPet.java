/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

/**
 *
     * @author User
 */
import java.util.Scanner;

public class VirtualPet {
        
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean run;
        boolean regis = true;
        String namaPet;
        int aksi = 0;
        int statStamina = 1;
        int statMakan = 1;
        int statMood = 1;
        int statFisik = 1;

        

        while (regis = true) {
            cetak("Selamat Datang Di Virtual Pet Naga");
            System.out.print("Masukkan Nama Pet yang Anda Inginkan : ");
            namaPet = in.nextLine();
            cetak("=======================================================");
            cetak("Nama Peliharan anda adalah " + namaPet);
            cetak("=======================================================");
            run = true;
            
            while (run=true) {
                cetak("1.Bermain \n2.Makan \n3.Tidur \n4.Mandi \n5.Status Pet \n6.Keluar Virtual Pet");
                System.out.print("Silahkan Pilih Aksi : ");
                aksi = in.nextInt();
                cetak("");
                cetak("=======================================================");
                cetak("");

                switch (aksi) {
                    case 1:
                        bermain(statStamina, statMakan, statFisik, statMood);
                        break;
                    case 2:
                        makan(statMakan);
                        break;
                    case 3:
                        tidur(statStamina);
                        break;
                    case 4:
                        mandi(statFisik);
                        break;
                    case 5:
                        status(statStamina, statMakan, statFisik, statMood);
                        break;
                    case 6 : 
                        run=false;

                }

            }
        }

    }

    public static void status(int statStamina, int statMakan, int statMood, int statFisik) {
        cetak("~Status Pet Anda~");
        cetak("Stamina :" + statStamina);
        cetak("Tingkat Kekenyangan" + makan(statMakan));
        cetak("Suasana Hati : " + statMood);
        cetak("Kondisi Tubuh : " + statFisik);
        cetak("");
        cetak("=======================================================");
    }

    public static void cetak(Object x) {
        System.out.println(x);
    }

    public static int bermain(int statStamina, int statMakan, int statMood, int statFisik) {
        if (statMakan >= 2 && statFisik >= 2 && statStamina >= 2) {
            System.out.println("Pet Sedang Bermain");
            statMood++;
            statMakan--;
            statFisik--;
            statStamina--;

        } else if (statMakan >= 0 && statFisik >= 0 && statStamina >= 0) {
            System.err.println("Kondisi Tidak Mencukupi");
        } else {
            System.err.println("Pet Telah Mati");
        }
        cetak("");
        cetak("=======================================================");
        cetak("");
        return statMood;
    }

    public static int makan(int statMakan) {
           statMakan++;
        if (statMakan >= 3) {
            cetak("Peliharaan sudah anda kenyang");
        } else if (statMakan >= 0 && statMakan <=2) {
            cetak("Peliharaan sedang makan");
        } else {
            System.err.println("Pet Telah Mati");
            
        }
        cetak("");
        cetak("=======================================================");
        cetak("");
        return statMakan;

    }

    public static int tidur(int statStamina) {
        if (statStamina >= 3) {
            cetak("Peliharaan terlalu banyak tidur");
            statStamina++;
 
        } else if (statStamina >= 0) {
            cetak("Peliharaan tidur");
            statStamina++;

        } else {
            System.err.println("Pet Telah Mati");
        }
        cetak("");
        cetak("=======================================================");
        cetak("");
        return statStamina;

    }

    public static int mandi(int statFisik) {
        if (statFisik >= 3) {
            cetak("Peliharaan terlalu banyak mandi");
            statFisik++;
        } else if (statFisik >= 0) {
            cetak("Peliharaan Mandi");
            statFisik++;
        } else {
            System.err.println("Pet Telah Mati");
        }
        cetak("");
        cetak("=======================================================");
        cetak("");
        return statFisik;
    }
}

package ProjectVirtual;

import java.util.Scanner;

/**
 *
 * @MuhammadHananAbabil
 */
public class VirtualPet {

    public static String nama, aksi;
    public static int state;
    static Scanner input = new Scanner(System.in);
    static final int bosan = 1;
    static final int lapar = 2;
    static final int kenyang = 3;
    static final int lelah = 4;
    static final int senang = 5;
    static final int hilang = 6;
    static final int marah = 7;
    static final int quit = 9;

    public static void main(String[] args) throws InterruptedException {
        VirtualPet run = new VirtualPet();
        run.main();
    }

    public void main() throws InterruptedException {
        kucing();
        intro();
        while (state != quit) {
            switch (state) {
                case bosan:
                    Bosan();
                    break;
                case lapar:
                    Lapar();
                    break;
                case kenyang:
                    Kenyang();
                    break;
                case lelah:
                    Lelah();
                    break;
                case senang:
                    Senang();
                    break;
                case hilang:
                    Hilang();
                    break;
                case marah:
                    Marah();
            }
        }
    }

    public void Menu() {
        System.out.println("Lakukan Sesuatu : ");
        System.out.println("1. Beri Makan");
        System.out.println("2. Ajak Main");
        System.out.println("3. Suruh Tidur");
        System.out.println("4. Cari");
        System.out.println("5. Diamkan");
        System.out.println("6. Keluar Program");
        System.out.print("Masukan Pilihan Anda : ");
    }

    public void garis() {
        System.out.println("==========================================");
    }

    public void Bosan() throws InterruptedException {
        int action;
        do {
            garis();
            System.out.println(nama + ", Terlihat Bosan..");
            System.out.println(nama + ", Sedang Duduk termenung tanpa melakukan Apa-Apa....");
            Menu();
            action = input.nextInt();
            garis();
            if (action == 1) {
                aksi = "makan";
                state = kenyang;
            } else if (action == 2) {
                aksi = "main";
                state = senang;
            } else if (action == 3) {//tidur
                state = lapar;
                aksi = "tidur";
            } else if (action == 4) {//cari
                aksi = "dicari";
                state = bosan;
            } else if (action == 5) {//diamkan
                state = marah;
                aksi = "didiamkan";
            } else if (action == 6) {//keluar
                System.err.println("TERIMA KASIH TELAH BERMAIN");
                System.err.println("~~~~KELUAR GAME~~~~");
                state = quit;
            } else {
                System.out.println("Input anda Salah");
                garis();
            }
            if (action >= 1 && action <= 5) {
                System.out.println(nama + " Sedang " + aksi);

            }
            for (int i = 0; i <= 30; i++) {
                System.out.print('\u1219');
                Thread.sleep(120);
            }
            System.out.println();
        } while (action < 1 || action > 6);
    }

    public void Lapar() throws InterruptedException {
        int action;
        do {
            garis();
            System.out.println("Perut " + nama + " Mengeluarkan bunyi yang aneh!!");
            System.out.println(nama + " Sesekali Melirik Kearah Makanan ");
            Menu();
            action = input.nextInt();
            garis();
            if (action == 1) {//Makan
                state = kenyang;
                aksi = "makan";
            } else if (action == 2) {//Main
                state = lelah;
                aksi = "main";
            } else if (action == 3) {//tidur
                state = lapar;
                aksi = "tidur";
            } else if (action == 4) {//cari
                state = lapar;
                aksi = "dicari";
            } else if (action == 5) {//diamkan
                state = marah;
                aksi = "Didiamkan";
            } else if (action == 6) {//keluar
                System.err.println("TERIMA KASIH TELAH BERMAIN");
                System.err.println("~~~~KELUAR GAME~~~~");
                state = quit;
            } else {
                System.out.println("Input anda Salah");
            }
            if (action >= 1 && action <= 5) {
                System.out.println(nama + " Sedang " + aksi);

            }
            for (int i = 0; i <= 30; i++) {
                System.out.print('\u1219');
                Thread.sleep(120);
            }
            System.out.println();
        } while (action < 1 || action > 6);
    }

    public void Kenyang() throws InterruptedException {
        int action;
        do {
            garis();
            System.out.println(nama + ", Kekenyangan");
            System.out.println(nama + ", Duduk dan sekekali menguap...");
            Menu();
            action = input.nextInt();
            garis();
            if (action == 1) {//makan
                state = kenyang;
                aksi = "makan";
            } else if (action == 2) {//Main
                state = lelah;
                aksi = "main";
            } else if (action == 3) {//tidur
                state = senang;
                aksi = "tidur";
            } else if (action == 4) {//cari
                state = kenyang;
                aksi = "Dicari";
            } else if (action == 5) {//diamkan
                state = bosan;
                aksi = "Didiamkan";
            } else if (action == 6) {//keluar
                System.err.println("TERIMA KASIH TELAH BERMAIN");
                System.err.println("~~~~KELUAR GAME~~~~");
                state = quit;
            } else {
                System.out.println("Input anda Salah");
                garis();
            }
            if (action >= 1 && action <= 5) {
                System.out.println(nama + " Sedang " + aksi);

            }
            for (int i = 0; i <= 30; i++) {
                System.out.print('\u1219');
                Thread.sleep(120);
            }
            System.out.println();
        } while (action < 1 || action > 6);
    }

    public void Lelah() throws InterruptedException {
        int action;
        do {
            garis();
            System.out.println(nama + ", Kelelahan..");
            System.out.println(nama + ", Terlihat ngosngosan dan menjulurkan lidahnya");
            Menu();
            action = input.nextInt();
            garis();
            if (action == 1) {//makan
                state = kenyang;
                aksi = "makan";
            } else if (action == 2) {//Main
                state = marah;
                aksi = "main";
            } else if (action == 3) {//tidur
                state = senang;
                aksi = "tidur";
            } else if (action == 4) {//cari
                state = lelah;
                aksi = "Dicari";
            } else if (action == 5) {//diamkan
                state = marah;
                aksi = "didiamkan";
            } else if (action == 6) {//keluar
                System.err.println("TERIMA KASIH TELAH BERMAIN");
                System.err.println("~~~~KELUAR GAME~~~~");
                state = quit;
            } else {
                System.out.println("Input anda Salah");
                garis();
            }
            if (action >= 1 && action <= 5) {
                System.out.println(nama + " Sedang " + aksi);

            }
            for (int i = 0; i <= 30; i++) {
                System.out.print('\u1219');
                Thread.sleep(120);;
            }
            System.out.println();
        } while (action < 1 || action > 6);
    }

    public void Senang() throws InterruptedException {
        int action;
        do {
            garis();
            System.out.println(nama + ", Terlihat sangat senang");
            Menu();
            action = input.nextInt();
            garis();
            if (action == 1) {//makan
                state = kenyang;
                aksi = "makan";
            } else if (action == 2) {//Main
                state = lapar;
                aksi = "main";
            } else if (action == 3) {//tidur
                state = bosan;
                aksi = "tidur";
            } else if (action == 4) {//cari
                state = senang;
                aksi = "Dicari";
            } else if (action == 5) {//diamkan
                state = bosan;
                aksi = "Didiamkan";
            } else if (action == 6) {//keluar
                System.err.println("TERIMA KASIH TELAH BERMAIN");
                System.err.println("~~~~KELUAR GAME~~~~");
                state = quit;
            } else {
                System.out.println("Input anda Salah");
                garis();
            }
            if (action >= 1 && action <= 5) {
                System.out.println(nama + " Sedang " + aksi);

            }
            for (int i = 0; i <= 30; i++) {
                System.out.print('\u1219');
                Thread.sleep(120);
            }
            System.out.println();

        } while (action < 1 || action > 6);
    }

    public void Hilang() throws InterruptedException {
        int action;
        do {
            garis();
            System.out.println("Tidakkkk.... " + nama + " tidak ada dirumah..");
            System.out.println(nama + " Telah Hilang!!!!");
            Menu();
            action = input.nextInt();
            garis();
            if (action == 1) {//makan
                state = hilang;
                aksi = "makan";
            } else if (action == 2) {//Main
                state = hilang;
                aksi = "main";
            } else if (action == 3) {//tidur
                state = hilang;
                aksi = "tidur";
            } else if (action == 4) {//cari
                state = lelah;
                aksi = "Dicari";
            } else if (action == 5) {//diamkan
                state = hilang;
                aksi = "Didiamkan";
            } else if (action == 6) {//keluar
                System.err.println("TERIMA KASIH TELAH BERMAIN");
                System.err.println("~~~~KELUAR GAME~~~~");
                state = quit;
            } else {
                System.out.println("Input anda Salah");
                garis();
            }
            if (action >= 1 && action <= 5) {
                System.out.println(nama + " Sedang " + aksi);

            }
            for (int i = 0; i <= 30; i++) {
                System.out.print('\u1219');
                Thread.sleep(120);
            }
            System.out.println();
        } while (action < 1 || action > 6);
    }

    public void Marah() throws InterruptedException {
        int action;
        do {
            garis();
            System.out.println(nama + ", Marah kepada anda!!");
            System.out.println(nama + ", Mengeluarkan taringnya!!!");
            Menu();
            action = input.nextInt();
            garis();
            if (action == 1) {//makan
                state = senang;
            } else if (action == 2) {//Main
                state = marah;
            } else if (action == 3) {//tidur
                state = senang;
            } else if (action == 4) {//cari
                state = marah;
            } else if (action == 5) {//diamkan
                state = hilang;
            } else if (action == 6) {//keluar
                System.err.println("TERIMA KASIH TELAH BERMAIN");
                System.err.println("~~~~KELUAR GAME~~~~");
                state = quit;
            } else {
                System.out.println("Input anda Salah");
                garis();
            }
        } while (action < 1 || action > 6);
    }

    public void kucing() {
        System.out.println("____________________________________$$$$\n"
                + "__________________________________$$____$\n"
                + "_________________________________$_______$\n"
                + "___$$$$_________________________$_________$\n"
                + "__$____$$______________________$____$_____$\n"
                + "_$_______$$___________________$____$$$____$\n"
                + "_$_________$$_____$$$$_$$$___$____$$$$$___$\n"
                + "$____________$_$$$__$$$__$$_$____$$$$$$___$\n"
                + "$____$$_______$_$$__$$$__$$$____$$$$$$$___$\n"
                + "$___$$$$_______$$$$_$$$___$$_____$$$$$$___$\n"
                + "$___$$$$$$_____$$$$_$$$$__$$$______$$$$$__$\n"
                + "$___$$$$$$$____$$$$_$$$$__$$$________$$$__$\n"
                + "$___$$$$$______$$$$_$$$$__$$$$____________$\n"
                + "$___$$$$_______$$$$_$$$$__$$$$____________$\n"
                + "$___$$$________$$$$_$$$$__$$$$____________$\n"
                + "$___$$_________$$$$__$$$__$$$$____________$\n"
                + "$______________$$$___$$$___$$$____________$\n"
                + "$_______________$_____$_____$_____________$\n"
                + "_$_________________________________________$\n"
                + "$________________________________$$$$_______$\n"
                + "$_______________________________$__$$$______$\n"
                + "$__________$$$$________________$$__$$$$_____$\n"
                + "$_________$$$__$_______________$$$$$$$$_____$\n"
                + "$________$$$$__$_______________$$$$$$$$_____$\n"
                + "$________$$$$$$$$______________$$$$$$$$_____$\n"
                + "$________$$$$$$$$_______________$$$$$$______$\n"
                + "$________$$$$$$$$_______$___$____$$$$_______$\n"
                + "$_________$$$$$$_____$__$$_$________________$\n"
                + "$__________$$$$_______$$__$________________$\n"
                + "_$_____________________$__$_______________$\n"
                + "__$_____________________$$_______________$\n"
                + "___$______________________________$$$___$\n"
                + "____$$___________________________$___$_$\n"
                + "______$$$_______________________$_____$\n"
                + "_________$$$$_____________$$$$$$______$\n"
                + "___$$________$$$$$$$$$$$$$____________$\n"
                + "__$__$________$___$_________________$$\n"
                + "__$___$_______$____$_____________$$$\n"
                + "__$___$________$____$___________$$\n"
                + "__$$$$$$_______$____$__________$__$\n"
                + "___$___$$_______$___$_________$____$\n"
                + "___$$$$$$$___$$$_$$$_________$_____$\n"
                + "____$___$$$$$__$_____$_______$_____$\n"
                + "_____$__$______$_____$_______$_____$\n"
                + "______$$$$$$$$$$_____$_______$____$\n"
                + "________________$$$$$_________$$$$\n"
                + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n"
                + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n"
                + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n"
                + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("");
    }

    public void intro() {
        System.out.println((char) 27 + "[01;32m      **SELAMAT DATANG DI VIRTUAL PET**" + (char) 27 + "[00;00m");
        System.out.println((char) 27 + "[01;32m              KUCING ANGGORA      " + (char) 27 + "[00;00m");
        garis();
        System.out.print("Berikan Nama Kucing  Anda : ");
        nama = input.nextLine();
        state = bosan;
        garis();
    }
}

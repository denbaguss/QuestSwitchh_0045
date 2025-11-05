import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner raden = new Scanner(System.in);
        double sData, pbo, bData, algo, rpl;
        String predikat;

        System.out.println("Program Seleksi ASDOS");
        System.out.print("Masukkan nilai Struktur Data: ");
        double strukturData = raden.nextDouble();

        System.out.print("Masukkan nilai Pemrograman Berorientasi Objek: ");
        pbo = raden.nextDouble();

        System.out.print("Masukkan nilai Basis Data: ");
        bData = raden.nextDouble();

        System.out.print("Masukkan nilai Algoritma dan Pemrograman: ");
        algo = raden.nextDouble();

        System.out.print("Masukkan nilai Rekayasa Perangkat Lunak: ");
        rpl = raden.nextDouble();

        double rataRata = (strukturData + pbo + bData + algo + rpl) / 5;
        System.out.println("\nRata-rata nilai Anda: " + rataRata);

    }
}
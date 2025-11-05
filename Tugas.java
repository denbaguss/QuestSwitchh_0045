
import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner raden = new Scanner(System.in);
        String predikat;

        System.out.println("Program Seleksi ASDOS");
        System.out.print("Masukkan nilai Struktur Data: ");
        double strukturData = raden.nextDouble();

        System.out.print("Masukkan nilai Pemrograman Berorientasi Objek: ");
        double pbo = raden.nextDouble();

        System.out.print("Masukkan nilai Basis Data: ");
        double bData = raden.nextDouble();

        System.out.print("Masukkan nilai Algoritma dan Pemrograman: ");
        double algo = raden.nextDouble();

        System.out.print("Masukkan nilai Rekayasa Perangkat Lunak: ");
        double rpl = raden.nextDouble();

        double rataRata = (strukturData + pbo + bData + algo + rpl) / 5;
        System.out.println("\nRata-rata nilai Anda: " + rataRata);

        if (rataRata >= 95) {
            predikat = "A (Sangat Baik)";
        } else if (rataRata >= 90) {
            predikat = "AB (Baik Sekali)";
        } else if (rataRata >= 80) {
            predikat = "B (Baik)";
        } else if (rataRata >= 70) {
            predikat = "BC (Cukup)";
        } else {
            predikat = "C (Kurang)";
        }
        System.out.println("Predikat Anda: " + predikat);

        if (predikat.equals("A (Sangat Baik)") || predikat.equals("AB (Baik Sekali)")) {
            System.out.println("Anda memenuhi syarat untuk mendaftar sebagai Asisten Dosen");
            System.out.println("Pilih mata kuliah yang ingin Anda ajukan:");
            System.out.println("1. Struktur Data");
            System.out.println("2. Pemrograman Berorientasi Objek");
            System.out.println("3. Basis Data");
            System.out.println("4. Algoritma dan Pemrograman");
            System.out.println("5. Rekayasa Perangkat Lunak");
            System.out.print("Masukkan nomor pilihan (1-5): ");

            if (!raden.hasNextInt()) {
                System.out.println("Input tidak valid. Program berakhir.");
                raden.close();
                return;
            }

            int pilihan = raden.nextInt();
            double nilaiPilihan = 0;
            String namaMatkul = "";

            switch (pilihan) {
                case 1:
                    nilaiPilihan = strukturData;
                    namaMatkul = "Struktur Data";
                    break;
                case 2:
                    nilaiPilihan = pbo;
                    namaMatkul = "Pemrograman Berorientasi Objek";
                    break;
                case 3:
                    nilaiPilihan = bData;
                    namaMatkul = "Basis Data";
                    break;
                case 4:
                    nilaiPilihan = algo;
                    namaMatkul = "Algoritma dan Pemrograman";
                    break;
                case 5:
                    nilaiPilihan = rpl;
                    namaMatkul = "Rekayasa Perangkat Lunak";
                    break;
                default:
                    System.out.println("Nomor pilihan tidak valid. Program berakhir.");
                    return;
            }

            System.out.printf("%nNilai Anda di mata kuliah %s adalah: %.2f%n", namaMatkul, nilaiPilihan);
            if (nilaiPilihan >= 75) {
                System.out.println(
                        "SELAMAT! Anda eligible untuk menjadi Asisten Dosen pada mata kuliah " + namaMatkul + ".");
            } else {
                System.out.println("Maaf, nilai Anda di mata kuliah " + namaMatkul + " ("
                        + String.format("%.2f", nilaiPilihan) + ") kurang dari 75.");
                System.out.println("Anda belum memenuhi syarat untuk posisi Asisten Dosen pada mata kuliah ini.");
            }

        } else {
            System.out.println(
                    "Maaf, Anda belum memenuhi syarat untuk mendaftar sebagai Asisten Dosen karena predikat Anda "
                            + predikat + ".");
            System.out.println("Program berakhir");
        }

    }
}
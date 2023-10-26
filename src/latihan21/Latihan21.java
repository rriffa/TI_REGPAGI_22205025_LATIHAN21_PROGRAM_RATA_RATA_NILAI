/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan21;
import java.util.Scanner;
/**
 *
 * @author Lenovo
Nama :Ma'rifatu Khirzah
NIM :22205025
Prodi :Teknik Informatika
 */
public class Latihan21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Banyaknya Mahasiswa: ");
        int jumlahNilai = input.nextInt();

        if (jumlahNilai <= 0) {
            System.out.println("Jumlah nilai harus lebih dari 0.");
            return;
        }

        double total = 0;
        for (int i = 1; i <= jumlahNilai; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            total += nilai;
        }

        double rataRata = total / jumlahNilai;
        System.out.println("Rata-rata nilai adalah: " + rataRata);

        input.close();
    }
    
}

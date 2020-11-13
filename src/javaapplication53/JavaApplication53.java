/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication53;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class JavaApplication53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama , nim ;

        double n_tugas , n_uts , n_kuis , n_uas , n_akhir;

        Scanner input = new Scanner (System.in);

  System.out.println("===== Menghitung Nilai UAS =====");

        System.out.print("Masukan nama : ");

        nama = input.nextLine();

        System.out.print("Masukan NIM : ");

        nim = input.nextLine();

        System.out.print("Nilai UAS MTK : ");

        n_tugas = input.nextInt();

        System.out.print("Nilai UAS KIMIA : ");

        n_kuis = input.nextInt();

        System.out.print("Nilai UAS FISIKA : ");

        n_uts = input.nextInt();

        System.out.print("Nilai B INGGRIS : ");

        n_uas = input.nextInt();

        n_akhir = (0.15 * n_tugas + 0.20 * n_kuis + 0.30 * n_uts + 0.35 * n_uas);

        System.out.println(nama+" memiliki nilai akhir "+n_akhir);

    }

}

   
}

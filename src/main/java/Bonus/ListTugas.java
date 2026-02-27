/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bonus;

/**
 *
 * @author amandaardheliarahmandi
 */

import java.io.*;
import java.util.*;

public class ListTugas {

    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream(
                "/Users/amandaardheliarahmandi/Documents/tugas.txt", true);

            Scanner s = new Scanner(System.in);

            System.out.print("Masukkan Tugas: ");
            String data = s.nextLine();

            os.write((data + "\n").getBytes()); // biar turun baris
            os.flush();
            os.close();

            System.out.println("Tugas berhasil disimpan\n");

        } catch (Exception e) {
            System.err.println("Tugas tidak berhasil disimpan");
        }
    }
}
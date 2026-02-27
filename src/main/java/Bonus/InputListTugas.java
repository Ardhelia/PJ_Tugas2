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

public class InputListTugas {

    public static void main(String[] args) {

        try {
            InputStream ia = new FileInputStream(
                "/Users/amandaardheliarahmandi/Documents/tugas.txt");

            System.out.println("=== DAFTAR TUGAS ===");

            int data = ia.read();

            while (data != -1) {
                System.out.print((char) data);
                data = ia.read();
            }

            ia.close();

        } catch (Exception e) {
            System.out.println("Belum ada data tugas.");
        }
    }
}
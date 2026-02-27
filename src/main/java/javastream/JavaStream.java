/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package javastream;

import java.io.*;
import java.util.*;

/**
 *
 * @author amandaardheliarahmandi
 */
public class JavaStream {

    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("/Users/amandaardheliarahmandi/Documents/praktik1.txt", true);
            Scanner s=new Scanner(System.in);
            System.out.println("Masukkan Kalimat:");
            String data=s.nextLine();
            os.write(data.getBytes());
            os.flush();
            os.close();
            System.out.println("Pengiriman data berhasil");
        } catch (Exception e){
            System.err.println("Pengiriman data tidak berhasil");
        
        }
           
    }
}

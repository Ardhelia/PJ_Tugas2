/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javastream;

import java.io.*;

public class NewInputStream {

    public static void main(String[] args) {

        try {
            InputStream ia = new FileInputStream(
                "/Users/amandaardheliarahmandi/Documents/praktik1.txt");

            int data=ia.read();

           while (data!=-1) {
             System.out.print((char) data);
//             System.out.write(data);
             data=ia.read();
           }
           ia.close();

        } catch (Exception e) {
           
        }
    }
}
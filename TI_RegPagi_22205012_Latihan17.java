/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hello.bagas;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class TI_RegPagi_22205012_Latihan17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=======Program Tunjangan========");
        System.out.print("Berapa gaji pokok anda perbulan?:");
        double gaji = input.nextDouble();
        
        System.out.print("Status Anda? (Menikah/Belum):");
        String status = input.next();
        
        System.out.println("=========Hasil Perhitungan Gaji Anda===========");
        double tunjangan = 0;
        if (status.equalsIgnoreCase("Menikah")) {
           tunjangan = 0.35*gaji;
        } else { 
            tunjangan = 0;
        }
        double totalgaji = gaji + tunjangan;
        System.out.println("Gaji Pokok: "+gaji);
        System.out.println("Tunjangan: "+tunjangan);
        System.out.println("Total gaji: "+totalgaji);
        
    }
    
}

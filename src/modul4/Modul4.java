/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4;
import java.util.Scanner;

/**
 *
 * @author erisa
 */
public class Modul4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String identitas = "Errisa Aura Hidayah/X RPL 1/09";
        System.out.println("Identitas : "+identitas);
        
        System.out.println("\nSaran Resep dari Bahan Milik Anda\n");
        
        Scanner input = new Scanner(System.in);
        System.out.println("Bahan Pertama: ");
        System.out.println("1. Pisang");
        System.out.println("2. Telur");
        System.out.println("Masukkan no pilihan Anda :");
        int bahan1 = input.nextInt();
        int bahan2 = input.nextInt();
        if(bahan1 == 1 || bahan1 == 2)
        {
            System.out.println("Bahan Kedua: ");
            if(bahan1 == 1) {
                System.out.println("1. Susu");
                System.out.println("2. Minyak Goreng");
                System.out.println("3. Tidak ada");
            }else{
                System.out.println("1. Minyak Goreng");
                System.out.println("2. Roti");
                System.out.println("3. Tidak ada");
            }
            System.out.println("Masukkan no pilihan anda: ");
           
        }else
            System.out.println("Mohon maaf, pilihan tidak ditemukan, "+ "tidak dapat memberikan saran resep");
        
        if(bahan1 >= 1 && bahan2 <= 3)
        {
            if(bahan1==1)
                switch(bahan2)
                {
                    case 1: System.out.println("Anda dapat membuat milshake banana"); break;
                    case 2: System.out.println("Anda dapat membuat pisang goreng"); break;
                    case 3: System.out.println("Anda dapat membuat pisang rebus");
                }
            else
                switch(bahan2)
                {
                    case 1: System.out.println("Anda dapat membuat telur mata sapi"); break;
                    case 2: System.out.println("Anda dapat membuat sandwich telur"); break;
                    case 3: System.out.println("Anda dapat membuat telur rebus");
                }
        }else
            System.out.println("Mohon maaf, pilihan tidak ditemukan"+"tidak dapat memberikan saran resep");
            
            
            }
        }
        
        
        
        
    
    


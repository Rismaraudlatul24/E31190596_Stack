/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrukturData;

import java.util.Scanner;

/**
 *
 * @author Rismaaulia
 */
public class Main {
   public static void main(String[] args) {
        //buat dua variabel yaitu pilihan dan data
        int pilihan;
        int data;
        //untuk memanggil dari class lain
        Stack result = new Stack ();
            //buat perulangan do while
            do{
            //Tampilan utuk memilih menu
            System.out.println("1. PUSH");
            System.out.println("2. POP ITEM");
            System.out.println("3. LIHAT ISI DATA");
            System.out.println("4. KELUAR");
            //untuk mengambil input dari keyboard
            Scanner input = new Scanner(System.in);
            pilihan =input.nextInt();
            //buat kondisi
            if (pilihan==1){
                //untuk menampilkan data
                System.out.println("data yang ditambahkan :");
                data=input.nextInt();
                //input dari keyboard memanggil method push
                result.push(data);
            }
            //Deklasikan
            else if (pilihan==2){
                result.pop();
            }
            //Deklasikan
            else if (pilihan==3){
                result.display();
            }else if (pilihan==0){
                System.exit(0);
            }else{
                //untuk menampilkan data
                System.out.println("pilhan tidak ada");
            }
        //mengulang program pilihan sampai nol
        }while(pilihan !=0);
        
    }
}
 
 

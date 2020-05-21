/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrukturData;

/**
 *
 * @author Rismaaulia
 */
public class Stack {
   //membuat variabel empty dan full yang bertipe boolean bertujuan untuk mengecek true atau false
    private boolean empty,full;
    //Untuk menentukan posisi int array
    private int pos;
    //Untuk mengetahui maksimal data di dalam array
    private int max_data = 3;
    //Deklarasikan array
    private int item [] = new int [max_data];
    //Membuat konstraktor untuk mengesave nilai awal dari class stack
    public void  Stack(){
        full = false;
        empty = true;
        pos = 0;
    }
    //Buat method untuk mengecek apakah nilainya penuh 
    public boolean isFull(){
        return (full);
    }
    //Buat method untuk mengecek apakah nilainya kosong
    public boolean isEmpty(){
        return (empty);
    }
    //Buat method untuk menambahkan stack
    public void push (int data){
        //Di cek jika udah penuh maka
        if (!isFull()){
            //menambahkan item pada posisi
            item [pos++] = data;
            empty = false;
            if (pos==max_data){
                full = true;
            }
            //untuk menampilkan hasil output
            System.out.println("data sudah ditambahkan");
        }else{
            //untuk menampilkan hasil output
            System.out.println("stack sudah penuh");
        }
        return;
    }
    //membuat method pop 
    public int pop(){
        //Deklarasikan dulu untuk menampung array dari item
        int x = 0;
        //Apakah array kosong
        if (!isEmpty()){
            x = item [--pos];
            full = false;
            //untuk menampilksn data pada pos adalah item pada index ke berapa
            System.out.println("data yang di pop adalah "+item[pos]);
            System.out.println("");
            item [pos] = 0;
            if (pos==0){
                empty = true;
                //untuk menampilkan data
                System.out.println("stack adalah kosong");
            }else{
                //untuk menampilkan data
                System.out.println("data sudah diambil");
            }
        }else{
            //untuk menampilkan data
            System.out.println("stack masih kosong ! \n");
        }
        return(x);
    }
    //Buat method untuk menampilkan
    public void display(){
        //untuk menampilkan data
        System.out.println("isi stack adalah");
        //Membuat perulangan
        for (int i = 0; i < pos; i++) {
            //untuk menampilkan data
            System.out.println(item[i]+"");
        }
        //untuk menampilkan data
        System.out.println("\n");
    }
}
 


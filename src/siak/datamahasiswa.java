/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siak;

/**
 *
 * @author RIKUN
 */
import java.sql.*;
import java.util.*;

public class datamahasiswa {
    public static void main(String args[])throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_siak", "root", "");
        PreparedStatement smt=con.prepareStatement("insert into tab_mahasiswa(nim,nama,tanggal_lahir,jurusan,alamat)"+"values(?,?,?,?,?)");
        
        
        
        
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Selamat datang di SIAK");
        do {
            System.out.println("Menu :");
            System.out.println("1.Input Data Mahasiswa");
            System.out.println("2.Input Mata Kuliah");
            System.out.println("3.Input Nilai");
            System.out.println("4.Lihat Data");
            System.out.println("5.EXIT");
            System.out.print("Pilih :");
            x = sc.nextInt();
             System.out.println("-----------------------");
            switch (x) {
                case 1:
                    Input_Mahasiswa();
                    break;
                                
                case 5:System.out.println("Bye Bye");
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
            }
        } while (x != 0);
 
        }
static void Input_Mahasiswa() {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Masukan NIM :");
        int nim=sc.nextInt();
        System.out.print("Masukan Nama :");
        String nama=sc.next();
        System.out.print("Masukkan TTL(YYYY-MM-DD: :");
        String tangal_lahir=sc.next();
        System.out.print("Masukan Jurusan :");
        String jurusan=sc.next();
        System.out.print("Alamat :");
        String alamat=sc.next();
  
        System.out.println("Data telah ditambah");
   
        System.out.println("-----------------------");
}
}
    

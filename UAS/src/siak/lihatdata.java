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

public class lihatdata {
    public static void main(String args[])throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_siak", "root", "");
        PreparedStatement smt=con.prepareStatement("insert into tab_nilai(nim,kode_mk,nilai,nilai_hrf)"+"values(?,?,?,?)");
        
        
        
        
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
                case 6:
                    Lihat_Data();
                    break;
                                
                case 5:System.out.println("Bye Bye");
                    break;
                default:
                    System.out.println("Data Tidak Tersedia");
            }
        } while (x != 5 );
 
        }
static void Lihat_Data() {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Nilai :");
        int nim=sc.nextInt();
        System.out.print("Input Nilai :");
        String nilai=sc.next();
        System.out.print("Masukan SKS :");
        String sks=sc.next();
         
  
        System.out.println("Data telah ditambah");
   
        System.out.println("-----------------------");
}
}
    

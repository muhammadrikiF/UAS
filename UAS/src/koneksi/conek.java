/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RIKUN
 */
public class conek {
    public static void main(String[] args)
    {}
    private static Connection koneksi;  
    private static Connection buka_koneksi() {
  if (koneksi==null) {
  try {
  String url="jdbc:mysql://localhost:3306/db_siaak"; 
  String user="root"; 
  String password="";
  DriverManager.registerDriver(new com.mysql.jdbc.Driver());
  koneksi=DriverManager.getConnection(url,user,password);
  }catch (SQLException t) {
  System.out.println("Error membuat koneksi");
  }
  }
 return koneksi;
}
 
}
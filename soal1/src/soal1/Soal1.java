/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal1;

/**
 *
 * @author ASUS
 */

import java.sql.*;

public class Soal1 {

    /**
     * @param args the command line arguments
     */
    
    private Connection con;
    private Statement state;
    private ResultSet rs;
    private ResultSet rs1;
    private Statement stmt;
    
    public static void main(String[] args) {
        Kost kos = new Kost("Raflesia","Sukapura",5);
        Pemilik pl1 =  new Pemilik("Pa Yayat","08222111889");
        Penyewa p1 =  new Penyewa("Thanos","+6282999299999");
        Penyewa p2 =  new Penyewa("Ant Man","+6282979299999");
        Penyewa p3 =  new Penyewa("Iron Man","+6282699299999");
        Penyewa p4 =  new Penyewa("Bat Man","+6282949299999");
        Penyewa p5 =  new Penyewa("Super Man","+6283999299999");
        kos.addPenyewa(p1);
        kos.addPenyewa(p2); 
        kos.addPenyewa(p3);
        kos.addPenyewa(p4);
        kos.addPenyewa(p5);
        
        System.out.println("Nama Kost:"+ kos.getNama());
        System.out.println("Alamat: "+ kos.getAlamat());
        System.out.println("Kode Kost:"+ kos.getNama());
        System.out.println("Nama Pemilik:"+ pl1.getNama());
        System.out.println("NO HP:"+ pl1.getNohp());
        System.out.println("Kelima Penyewa pada Kost Raflesia adalah");
        
         for (int i = 0; i < kos.getPenyewa().length; i++) {
            System.out.println("Penyewa Ke"+ (i+1));
            System.out.println("Nama:"+kos.getPenyewa()[i].getNama());
            System.out.println("No HP:"+kos.getPenyewa()[i].getNohp());
    }
 
         
}
     public void connect() {
        //menghubungkan database dengan project
        try {
      
            String url = "jdbc:mysql://localhost/tesasprak";
            String username ="root";
            String pass = "";
            con = DriverManager.getConnection(url, username, pass);
            state=con.createStatement();
            System.out.println("Connected");
            stmt=con.createStatement();
        }catch (SQLException ex) {
            System.out.println("Error : "+ex.getMessage());
                }
            
    }
    
   
}

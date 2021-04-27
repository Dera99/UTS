    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Administrator
 */
package uts;
import java.sql.Connection;
import java.sql.DriverManager;

public class Koneksi {
    Connection conn = null;
    public static Connection getConnection(){
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/UTS_PemVis","root","1234");
//           JOptionPane.showMessageDialog(null, "Connection Succeed");
           return conn;
       }catch(Exception e){
//           JOptionPane.showMessageDialog(null, "Connection Failed");
           return null;
       }
    }
}

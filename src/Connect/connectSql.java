/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connect;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Suy
 */
public class connectSql {
     public static Connection connection;
    public static synchronized Connection openConnection(){
        if(connection!=null){
            return connection;
        }
        else{
            String url = "jdbc:microsoft://pc_suy:3307\\db";
            String user="sa";
            String pass="1234";
            try {
                    Class.forName("java.sql.DriverManager");
                    connection = (Connection) DriverManager.getConnection(url,user,pass);
                    
            } catch (Exception e){
            e.printStackTrace();
            }
        }
        return connection;
    }
    public static synchronized void closeConnection(){
        if(connection !=null){
            try {
                connection.close();
            } catch(Exception e) {
            }
            finally{
                connection = null;
            }
        }
    }
    public void LoadDataToJTable(DefaultTableModel myModel){
        Connection connection = openConnection();
        String sql = "SELECT * FROM sinhvien";//chuoi tv
        try{
        } catch (Exception e) {
        }
        
    }



}
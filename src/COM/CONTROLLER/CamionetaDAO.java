
package COM.CONTROLLER;

import COM.MODEL.Camioneta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CamionetaDAO {
    
    //Method insert type boolean return true if rows affected or false if rows doesn't affected
    public static boolean insertSuv(Connection con, Camioneta cam){
        int rowsAffected = 0;
        String query = "INSERT INTO camioneta(id,placa,cilindraje,pais,concesionario_id) values"
                + "(?,?,?,?,?)";
        
        try{
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, cam.getId());
            ps.setString(2, cam.getPlaca());
            ps.setInt(3,cam.getCilindraje());
            ps.setString(4, cam.getPais());
            ps.setInt(5, cam.getConcesionarioIdentificacion());
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        if(rowsAffected > 0 ){
            return true;
        }else{
            return true;
        }
    }
    
    //Method Select type list return list 
    public static ArrayList<Camioneta> readCamioneta(Connection con){
        ArrayList<Camioneta> listSuv = new ArrayList<>();
        String query = "SELECT PLACA, CILINDRAJE,PAIS * FROM CAMIONETA";
        
        try{
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet result = ps.executeQuery();
            while(result.next()){
                String placa = result.getString(1);
                int cilindraje = result.getInt(2);
                String pais = result.getString(3);
                Camioneta cam = new Camioneta(placa,cilindraje,pais);
                listSuv.add(cam);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return listSuv;
    }
    
    //Method to update rows
    public static boolean updateSuv(Connection con, Camioneta cam){
        int rowsAffected = 0;
        String query = "Update camioneta set placa = ?, cilindraje = ?, pais = ? where id = ?";
        
        try{
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, cam.getPlaca());
            ps.setInt(2, cam.getCilindraje());
            ps.setString(3, cam.getPais());
            ps.setInt(4, cam.getId());
            
            rowsAffected = ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
        if(rowsAffected > 0){
            return true;
        }else{
            return false;
        }
    }
    
    //Method to deleted rows
    public static boolean deleteSuv(Connection con, int id){
        int rowsAffected = 0;
        String query = "Delete from camioneta where id = ?";
        
        try{
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            
            rowsAffected = ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
        if(rowsAffected > 0){
            return true;
        }else{
           return false; 
        }  
        
    }
    
}

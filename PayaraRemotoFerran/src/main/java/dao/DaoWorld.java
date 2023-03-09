/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import datos.Pais;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class DaoWorld {
  
    public static List<Pais>getPaisesByContinent(String name, Connection con) throws SQLException, Exception{
            ResultSet rs = null;
            //PreparedStatement ps = null;
            ArrayList<Pais> listaPais = new ArrayList<Pais>();
            Statement st = null;

            try {
                //ps = con.prepareStatement(query);
                st = con.createStatement();
                String query = "select code, name, continent, region, population from country where country.continent = '"+name+"';";
                rs = st.executeQuery(query);
                //ps.setString(1, "%" + name + "%");
                //rs = ps.executeQuery(query);
                while (rs.next()) {
                    Pais pais = new Pais();
                    pais.setCode(rs.getString("code"));
                    pais.setName(rs.getString("name"));
                    pais.setContinent(rs.getString("continent"));
                    pais.setRegion(rs.getString("region"));
                    pais.setPoblation(rs.getInt("population"));
                    listaPais.add(pais);
                }
            } catch (SQLException e) {
                e.printStackTrace();
                throw e;
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }finally{
                if (rs!=null)
                    rs.close();
                if(st!=null)
                    st.close();
                if(con!=null)
                    con.close();
            }
            return listaPais;
    }
    
}

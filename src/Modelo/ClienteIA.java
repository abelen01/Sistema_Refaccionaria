
package Modelo;

/**
 *
 * @author bels
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class ClienteIA {
     Conexion con = new Conexion();
    PreparedStatement psql;
    ResultSet rs;

    public int GuardarCliente(String Nombre,String Telefono, String Marca, String Modelo,int Año,String Correo) {
        int resultado = 0;
        Connection cn = null;

        String SentenciaSQL = "INSERT INTO cliente(Nombre_cliente,Telefono,Marca_del_carro,Modelo_del_carro,Año_carro,Correo)"
                + " VALUES (?,?,?,?,?,?)";

        try {
            cn = con.Conectar();
            psql = cn.prepareStatement(SentenciaSQL);
            psql.setString(1,Nombre);
            psql.setString(2, Telefono);
            psql.setString(3, Marca);
            psql.setString(4, Modelo);
            psql.setInt(5, Año);
            psql.setString(6, Correo);
            
            
            
            resultado = psql.executeUpdate();
            if (resultado > 0) { //si resultado es >0 se ejecuto la transaccion correctamente
                JOptionPane.showMessageDialog(null, "Se guardo correctamente el registro");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo guardar el registro");
            }
            psql.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al intentar almacenar guardar un registro:\n"
                    + e, "Error en la operación", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        } finally {
            try {
                if (cn != null) {
                    con.cerrar();
                }
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, "Error al intentar cerrar la conexión:\n"
                        + ex, "Error en la operación", JOptionPane.ERROR_MESSAGE);
            }
        }
        return resultado;
    }
     public ArrayList<Cliente> listClient(){
        ArrayList listaCliente= new ArrayList();
        Cliente cliente;
        
        Connection cn = null;
        String SentenciaSQL = "SELECT * FROM cliente";

        try {
            cn = con.Conectar();
            psql = cn.prepareStatement(SentenciaSQL);
            ResultSet rs=psql.executeQuery();
            while (rs.next()){
                cliente =new Cliente();
                cliente.setNombre_cliente(rs.getString(1));
                cliente.setTelefono(rs.getString(2));
                cliente.setMarca(rs.getString(3));
                cliente.setModelo(rs.getString(4)); 
                cliente.setAño(rs.getInt(5));
                cliente.setCorreo(rs.getString(6));
                listaCliente.add(cliente);                
            }            
        }catch(SQLException e){
            System.err.println(e);            
        }
        finally {
            try {
                if (cn != null) {
                    con.cerrar();
                }
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, "Error al intentar cerrar la conexión:\n"
                        + ex, "Error en la operación", JOptionPane.ERROR_MESSAGE);
            }
        }
        return listaCliente;        
    }
    public int eliminarCliente(String  Nombre_cliente){
        int resultado=0;
        Connection cn = null;

        String SentenciaSQL = "DELETE FROM Cliente WHERE Nombre_cliente=?";
               
        try {
            cn = con.Conectar();
            psql = cn.prepareStatement(SentenciaSQL);
            psql.setString(1,Nombre_cliente);
            
            resultado = psql.executeUpdate();
            if (resultado>0){ //si resultado es >0 se ejecuto la transaccion correctamente
                JOptionPane.showMessageDialog(null, "El registro se eliminó correctamente");
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro");
            }
            psql.close();
        } catch (SQLException e){
            System.err.println(e);
        } 
        return resultado;
    }
}


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
public class ServicioIA {
    Conexion con = new Conexion();
    PreparedStatement psql;
    ResultSet rs;

    public int GuardarServicios(String Fecha,String Nombre_usuario,String Nombre_cliente,
            String Descripcion,String Marca,
            String Modelo,int Año,double Costo, double Total,double Recibido,double Cambio) {
        int resultado = 0;
        Connection cn = null;

        String SentenciaSQL = "INSERT INTO servicio_mecanico(Fecha,Nombre_empleado,Nombre_cliente, Descripcion,Marca_del_Carro,Modelo_del_Carro,Año_Carro,Costo_servicio,Total_pagar,Recibido, Cambio)"
                + " VALUES (?,?,?,?,?,?,?,?,?,?,?)";

        try {
            cn = con.Conectar();
            psql = cn.prepareStatement(SentenciaSQL);
            psql.setString(1,Fecha);
            psql.setString(2,Nombre_usuario);
            psql.setString(3,Nombre_cliente);
            psql.setString(4,Descripcion);
            psql.setString(5,Marca);
            psql.setString(6,Modelo);
            psql.setInt(7,Año); 
            psql.setDouble(8,Costo);
            psql.setDouble(9,Total);
            psql.setDouble(10,Recibido);
            psql.setDouble(11,Cambio);
             
        
            
            
            
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
     public ArrayList<Servicioo> listServicioo(){
        ArrayList listaServicioo= new ArrayList();
       Servicioo Servicioo;
        
        Connection cn = null;
        String SentenciaSQL = "SELECT * FROM servicio_mecanico";

        try {
            cn = con.Conectar();
            psql = cn.prepareStatement(SentenciaSQL);
            ResultSet rs=psql.executeQuery();
            while (rs.next()){
                Servicioo =new Servicioo();
                Servicioo.setidServicio_mecanico(rs.getInt(1));
                Servicioo.setFecha(rs.getString(2));
                Servicioo.setNombre_usuario(rs.getString(3));
                Servicioo.setNombre_cliente(rs.getString(4));
                Servicioo.setDescripcion(rs.getString(5));
                Servicioo.setMarca(rs.getString(6));
                Servicioo.setModelo(rs.getString(7));
                Servicioo.setAño(rs.getInt(8));
                Servicioo.setCosto(rs.getDouble(9));
                Servicioo.setTotal(rs.getDouble(10));
                Servicioo.setRecibido(rs.getDouble(11));
                Servicioo.setCambio(rs.getDouble(12));
                
                 listaServicioo.add(Servicioo);               
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
        return listaServicioo;        
    }
    public int eliminarServicio(String idServicio_mecanico){
        int resultado=0;
        Connection cn = null;

        String SentenciaSQL = "DELETE FROM servicio_mecanico WHERE idServicio_mecanico=?";
               
        try {
            cn = con.Conectar();
            psql = cn.prepareStatement(SentenciaSQL);
            psql.setString (1,idServicio_mecanico);
            
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


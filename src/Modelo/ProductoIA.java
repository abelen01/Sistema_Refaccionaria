
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
public class ProductoIA {
         Conexion con = new Conexion();
    PreparedStatement psql;
    ResultSet rs;
    

    public int GuardarProducto(String Nombre,String Clave,String Marca,String Modelo,double Precio,int Cantidad,String Tipo,String NombreP) {
        int resultado = 0;
        Connection cn = null;

        String SentenciaSQL = "INSERT INTO Producto(Nombre_Producto,Clave,Marca,Modelo,Precio,Cantidad,Tipo,Nombre_Proveedor)"
                + " VALUES (?,?,?,?,?,?,?,?)";

        try {
            cn = con.Conectar();
            psql = cn.prepareStatement(SentenciaSQL);
            psql.setString(1,Nombre);
            psql.setString(2,Clave);
            psql.setString(3,Marca);
            psql.setString(4,Modelo);
            psql.setDouble(5,Precio);
            psql.setInt(6, Cantidad);
            psql.setString(7, Tipo);
            psql.setString(8, NombreP);
            
            
            
            
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
     public ArrayList<Producto> listProduct(){
        ArrayList listaProducto= new ArrayList();
        Producto producto;
        
        Connection cn = null;
        String SentenciaSQL = "SELECT * FROM Producto";

        try {
            cn = con.Conectar();
            psql = cn.prepareStatement(SentenciaSQL);
            ResultSet rs=psql.executeQuery();
            while (rs.next()){
                producto =new Producto();
                producto.setNombre(rs.getString(1));
                producto.setClave(rs.getString(2));
                producto.setMarca(rs.getString(3));
                producto.setModelo(rs.getString(4));
                producto.setPrecio(rs.getDouble(5));
                producto.setCantidad(rs.getInt(6));
                producto.setTipo(rs.getString(7));
                producto.setNombreP(rs.getString(8));
                 listaProducto.add(producto);               
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
        return listaProducto;        
    }
    public int eliminarProducto(String Nombre_Producto){
        int resultado=0;
        Connection cn = null;

        String SentenciaSQL = "DELETE FROM Producto WHERE Nombre_Producto=?";
               
        try {
            cn = con.Conectar();
            psql = cn.prepareStatement(SentenciaSQL);
            psql.setString (1,Nombre_Producto);
            
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
        public void editarProducto(String Nombre,String Clave,String Marca,String Modelo,double Precio,int Cantidad,String Tipo,String NombreP){
        int resultado=0;
        Connection cn = null;

        String SentenciaSQL = "UPDATE Producto SET Nombre_producto=?,Clave=?,Marca=?,Modelo=?,Precio=?,Cantidad=?,Tipo=?,Nombre_Proveedor=? WHERE Nombre_producto=?";
               
        try {
            cn = con.Conectar();
            psql = cn.prepareStatement(SentenciaSQL);
            psql.setString(1,Nombre);
            psql.setString(2, Clave);
            psql.setString(3, Marca);
            psql.setString(4, Modelo);
            psql.setDouble(5, Precio);
            psql.setInt(6, Cantidad);
            psql.setString(7, Tipo);
            psql.setString(8, NombreP);
            resultado = psql.executeUpdate();
            System.out.println("resultdo editado="+resultado);
            if (resultado>0){ //si resultado es >0 se ejecuto la transaccion correctamente
                JOptionPane.showMessageDialog(null, "El registro se actualizó correctamente");
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo actualizar el registro");
            }
            psql.close();
        } catch (SQLException e){
            System.err.println(e);
        } 
        //return resultado;
    }
    
}

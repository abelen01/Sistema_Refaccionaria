
package Modelo;

/**
 *
 * @author bels
 */
public class Inventario {
     private int idInventario;
    private String Fecha;
    private String Nombre_Producto;
    private int Existente;
    
   
    

    public int getidInventario() {
        return idInventario;
    }

    public void setidInventario(int idInventario) {
        this.idInventario= idInventario;
    }
 public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    public String getNombre_Producto() {
        return Nombre_Producto;
    }

    public void setNombre_Producto(String Nombre_Producto) {
        this.Nombre_Producto = Nombre_Producto;
    }

   
     public int getExistente() {
        return Existente;
    }

    public void setExistente(int Existente) {
        this.Existente = Existente;
    }
     
     

}

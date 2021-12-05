
package Modelo;

/**
 *
 * @author bels
 */
public class Producto {
    private String Nombre;
    private String Clave;
    private String Marca;
    private String Modelo;
    private double Precio;
    private int Cantidad;
    String Tipo;
    private String NombreP;
    

  

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }
     public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
     public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
     public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double  Precio) {
        this.Precio = Precio;
    }
     public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    public String getNombreP() {
        return NombreP;
    }

    public void setNombreP(String NombreP) {
        this.NombreP = NombreP;
    }
}

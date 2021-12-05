
package Modelo;

/**
 *
 * @author bels
 */
public class Cliente {
    private String Nombre_cliente;
    private String Telefono;
    private String Marca;
    private String Modelo;
    private int Año;
    private String Correo;
 
    

    

    public String getNombre_cliente() {
        return Nombre_cliente;
    }

    public void setNombre_cliente(String Nombre_cliente) {
        this.Nombre_cliente = Nombre_cliente;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
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
     public int getAño() {
        return Año;
    }

    public void setAño(int  Año) {
        this.Año = Año;
    }
      public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
}
}

package Modelo;

/**
 *
 * @author bels
 */
public class Servicioo {
    
int idServicio_mecanico ;
String Fecha;
String Nombre_usuario;
String Nombre_cliente;
String Descripcion;
String Marca;
String Modelo;
int Año;
double Costo;
double Total;
double Recibido;
double Cambio;
   
    public int getidServicio_mecanico() {
        return idServicio_mecanico;
    }

    public void setidServicio_mecanico(int idServicio_mecanico){ 
        this.idServicio_mecanico= idServicio_mecanico;
    }
    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha){ 
        this.Fecha= Fecha;
    }
 public String getNombre_usuario() {
        return Nombre_usuario;
    }

    public void setNombre_usuario(String Nombre_usuario) {
        this.Nombre_usuario = Nombre_usuario;
    }
    public String getNombre_cliente() {
        return Nombre_cliente;
    }

    public void setNombre_cliente(String Nombre_cliente) {
        this.Nombre_cliente = Nombre_cliente;
    }

   
     public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
       
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

    public void setAño(int Año) {
        this.Año = Año;
    }   
     public double getCosto() {
        return Costo;
    }

    public void setCosto(double Costo) {
        this.Costo = Costo;
       
    }
    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
       
    }
     public double getRecibido() {
        return Recibido;
    }

    public void setRecibido(double Recibido) {
        this.Recibido = Recibido;
       
    }
     public double getCambio() {
        return Cambio;
    }

    public void setCambio(double Cambio) {
        this.Cambio = Cambio;
       
    }
    }


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Arq Guillermo
 */
public class Clientes {
    private String rfc;
    private String nombre;
    private String apellidoP;    
    private String apellidoM;
    
    public Clientes( String RFC){
        rfc=RFC;
        nombre="";
        apellidoP="";
        apellidoM="";
    }
    
    public void setNombre(String nom ){
        nombre=nom;
    }
    
    public void setApellidoP(String apep){
        apellidoP=apep;
    }
    
    public void setApellidoM(String apem){
        apellidoM=apem;
    }
    
    
    public String getRfc(){
        return rfc;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellidoP(){
        return apellidoP;
    }
    public String getApellidoM(){
        return apellidoM;
    }
    
    //Este método permite enviar información de una clase a otra en una variable
    public String DatosCliente(){
        String datosCliente="";
        datosCliente="los datos del cliente son \n "+
        "nombre:  "+getNombre()+"\n"+
        "Apellido paterno "+getApellidoP()+"\n "+
        "Apellido materno "+getApellidoM()+"\n";
        
        return datosCliente;
    }
    
    
    
    
    
    
    
    
    
    
}

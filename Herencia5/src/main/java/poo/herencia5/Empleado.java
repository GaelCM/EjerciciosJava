/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.herencia5;

import java.text.DecimalFormat;

/**
 *
 * @author Arq Guillermo
 */
public class Empleado {
    
    private String nombre;
    private double salario;
    private int nivel;
    Salario objSalario;

    public Empleado(String nombre, double salario, int nivel) {
        this.nombre = nombre;
        this.salario = salario;
        this.nivel = nivel;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    public void CalcularSalario(int mesesTrabajados){
        objSalario=new Salario(3000,0.0,0.0,0.0,mesesTrabajados,0.0);
        objSalario.CalcularSalarioMensual();
        objSalario.CalcularSalarioAnual();
        objSalario.CalcularImpuesto();
        this.salario=objSalario.CalcularSueldoFinal(nivel);
    }
    
    
    public String Nuevos(){
        String datosNuevo;
        datosNuevo=" el nombre es: "+this.nombre+" \n"+
                   " su nivel es: "+"Empleado Nuevo"+"\n"+
                   " su salario anual es de: "+FormatoPesos(objSalario.getSueldloBA())+"\n"+
                   " obtuvo una bonificación de: "+FormatoPesos(objSalario.getTotalBonificacion())+"\n"+
                   " impuestos de 8% al SAT es de: "+FormatoPesos(objSalario.getImpuesto())+"\n"+
                   " Su sueldo final es de: "+FormatoPesos(this.salario);
        
    return datosNuevo;
    }
    
    protected String FormatoPesos(double importe){
       String valor="";
       
       DecimalFormat objDF=new DecimalFormat("$ ###,###.00");
       valor=objDF.format(importe);
       return valor;
     }
}

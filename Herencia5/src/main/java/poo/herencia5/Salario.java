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
public class Salario {
    
    private double sueldoBM;
    private double sueldloBA;
    private double sueldoBase;
    private double impuesto;
    private final double iva=0.08;
    private int mesesTrabajados;
    private double totalBonificacion;
    private double sueldoFinal;

    public Salario(double sueldoBase, double sueldoBM, double sueldloBA, double impuesto, int mesesTrabajados, double totalBonificacion) {
        this.sueldoBase=sueldoBase;
        this.sueldoBM = sueldoBM;
        this.sueldloBA = sueldloBA;
        this.impuesto = impuesto;
        this.mesesTrabajados = mesesTrabajados;
        this.totalBonificacion = totalBonificacion;
    }

    public double getSueldoBM() {
        return sueldoBM;
    }

    public void setSueldoBM(double sueldoBM) {
        this.sueldoBM = sueldoBM;
    }

    public double getSueldloBA() {
        return sueldloBA;
    }

    public void setSueldloBA(double sueldloBA) {
        this.sueldloBA = sueldloBA;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public int getMesesTrabajados() {
        return mesesTrabajados;
    }

    public void setMesesTrabajados(int mesesTrabajados) {
        this.mesesTrabajados = mesesTrabajados;
    }

    public double getTotalBonificacion() {
        return totalBonificacion;
    }

    public void setTotalBonificacion(double totalBonificacion) {
        this.totalBonificacion = totalBonificacion;
    }
    
    
    
    
    
    
    public void  CalcularSalarioMensual(){
        this.sueldoBM=(this.sueldoBase*2);
    }
    
    public void  CalcularSalarioAnual(){
        this.sueldloBA=this.sueldoBM*this.mesesTrabajados;
    }
    
    public void CalcularBonificacion(int nivel){
        Bonificacion objBonificaciones=new Bonificacion();
        this.totalBonificacion=objBonificaciones.CalcularBonificacion(mesesTrabajados, nivel);
    }
    
    
    public void CalcularImpuesto(){
        if(this.sueldloBA+this.totalBonificacion>40000){
            this.impuesto=(this.sueldloBA+this.totalBonificacion)*iva;
        }
    }
    
    public  double CalcularSueldoFinal(int nivel){
        
        switch(nivel){
            
            case 0:{this.sueldoFinal=(this.sueldloBA+this.totalBonificacion)-this.impuesto;};break;
            case 1:{this.sueldoFinal=(this.sueldloBA+this.totalBonificacion)-this.impuesto;};break;
            case 2:{this.sueldoFinal=(this.sueldloBA+this.totalBonificacion)-this.impuesto;};break;
            case 3:{this.sueldoFinal=(this.sueldloBA-this.impuesto);
        }
        }
    return this.sueldoFinal;
    }
    
    
    
} 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.herencia5;

/**
 *
 * @author Arq Guillermo
 */
public class Bonificacion {
    
    private double bDitectivo;
    private double bGerente;
    private double bObrero;
    private double totalBonificacion;
    
    
    public Bonificacion(){
        this.bDitectivo=2500.00;
        this.bGerente=1500.00;
        this.bObrero=100.00;
        this.totalBonificacion=0;
    }

    public double getbDitectivo() {
        return bDitectivo;
    }

    public void setbDitectivo(double bDitectivo) {
        this.bDitectivo = bDitectivo;
    }

    public double getbGerente() {
        return bGerente;
    }

    public void setbGerente(double bGerente) {
        this.bGerente = bGerente;
    }

    public double getbObrero() {
        return bObrero;
    }

    public void setbObrero(double bObrero) {
        this.bObrero = bObrero;
    }

    public double getTotalBonificacion() {
        return totalBonificacion;
    }

    public void setTotalBonificacion(double totalBonificacion) {
        this.totalBonificacion = totalBonificacion;
    }
    
    public double CalcularBonificacion(int mesesTrabajados, int nivel){
        switch(nivel){
            case 0: {
            this.totalBonificacion=(this.bDitectivo*2)*mesesTrabajados;
            };break;
            
            case 1:{
            this.totalBonificacion=(this.bGerente*2)*mesesTrabajados;
            };break;
            
            case 2:{
            this.totalBonificacion=(this.bObrero*2)*mesesTrabajados;
            };break;
            
            case 3:{
            this.totalBonificacion=0.0;
            };break;
        }
        return this.totalBonificacion;
    }
     
}

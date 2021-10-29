/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import javax.swing.JOptionPane;

/**
 *
 * @author Arq Guillermo
 */
public class Movimientos {
    private double saldoInicial;
    private double deposito;
    private double retiro;
    private double saldo;
    private static double retiros;
    private static double depositos;
    private static double totalDepositos;
    private static double totalRetiros;
    
     public Movimientos(){
     saldoInicial=3000.00;
     deposito=0.0;
     retiro=0.0;
     saldo=0.0;
     }
    

    public void setSaldo(double sal){
        saldo=sal;
    }
    
    public void setdepositos(double dep){
        deposito=dep;
        Movimientos.SumaDepositos(deposito);
        
    }
    public void setRetiros(double ret){
        retiro=ret;
        Movimientos.SumaRetiros(retiro);
        }
    
    public double getDepositos(){
        return  deposito;
    }
    
    public double getRetiros(){
        return  retiro;
    }
    public double getsaldo(){
        return  saldo;
    }
    public double getSaldoInicial(){
        return saldoInicial;
    }
    
    public void ActualizarSaldo(int opc){
        
        if(opc==0){
            saldo=saldo+deposito;
        }else{
            saldo=saldo-retiro;
        }
        
    }
    
    private static void SumaDepositos(double suma){
        depositos=suma;
        totalDepositos=totalDepositos+depositos;
        
    }
    private static void SumaRetiros(double suma1){
        retiros=suma1;
        
        totalRetiros=totalRetiros+retiros;    
        }
    
    
    
    
    public static double getSumaDepositos(){
        
        return totalDepositos;
    }
    public static double getSumaRetiros(){
        
        return totalRetiros;
    }
    
}
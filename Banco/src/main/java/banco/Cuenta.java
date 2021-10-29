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
public class Cuenta {
    private int numeroC;
    
    public Cuenta(){
     int numeroC=0;
    }
    
    public void setNumero(int num){
        numeroC=num;
    }
    
    
    public int getNumeroCuenta(){
        return numeroC;
    }
    
    
    //método para genera numero al azar
   public void generarCuenta(){
       numeroC=(int)(100000 * Math.random());
   }
        
    
    
}

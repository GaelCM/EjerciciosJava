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
import javax.swing.JOptionPane;
public class BancoPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String RFC="";
        String nombre="";
        String apellidoP="";
        String apellidoM="";
        int decision=0;
        int seleccion=0;
        double deposito=0.0;
        double retiro=0.0;
        int numeroC=0;
        String edoCuenta="estado de cuenta es: ";
        double saldoI=0.0;
        double saldo=0.0;
        String operacion="";
        boolean bandera=true;
        double sumaDepositos=0.0;
        double sumaRetiros=0.0;
        boolean error=false;
        
        JOptionPane.showMessageDialog(null, "Bienvenido a Banco BBVA Bancomer", "bienvenido", 0);
        decision=JOptionPane.showConfirmDialog(null,"¿desea abrir una cuenta en este banco?","apertura", JOptionPane.YES_NO_OPTION);
        
        
        if(decision==0){
            RFC=JOptionPane.showInputDialog(null, "inserte el RFC del cliente");
            
            do{
                try{
            nombre=JOptionPane.showInputDialog(null, "inserte el nombre");
            error=true;
                }catch(Exception objC){
                    JOptionPane.showMessageDialog(null, "Datos incorrectos");
                    error=false;
                }
                }while(error=false);
            
            
            apellidoP=JOptionPane.showInputDialog(null, "primer apellido");
            
            
            
            apellidoM=JOptionPane.showInputDialog(null, "segundo apellido");
            
            
            
            
            Cuenta objCuenta1=new Cuenta();
            objCuenta1.generarCuenta();
            
            Movimientos objMov1=new Movimientos();
            objMov1.setSaldo(objMov1.getSaldoInicial());
            
            Clientes objClientes1=new Clientes(RFC);
            objClientes1.setNombre(nombre);
            objClientes1.setApellidoP(apellidoP);
            objClientes1.setApellidoM(apellidoM);
            
            
            do{
                
            String[] menu = {"Depósito", "Retiro", "Saldo","Finalizar"};
            seleccion = JOptionPane.showOptionDialog(null, "¿Que operación desea realizar?","Menú de Opciones",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null, menu, menu[0]);
            //esto es para crear un menú en java, defaul_option es para 
            
                switch(seleccion){
                case 0:{
                    do{
                    try{
                    deposito=Double.parseDouble(JOptionPane.showInputDialog(null, "inserte la cantidad de su depósito"));
                    objMov1.setdepositos(deposito);
                    objMov1.ActualizarSaldo(0);
                    saldo=objMov1.getsaldo();
                    operacion+="Depósito*********** $"+ deposito+"********** $"+saldo+ "\n";
                    error=true;
                    }catch(Exception objA){
                        JOptionPane.showMessageDialog(null, "debe insertar un monto");
                        error=false;
                    }
                    }
                    while(error=false);
                    };break;
                
                case 1:{
                    do{
                    try{
                        
                    retiro=Double.parseDouble(JOptionPane.showInputDialog(null, "inserte el monto a retirar"));
                    objMov1.setRetiros(retiro);
                    objMov1.ActualizarSaldo(seleccion);
                    saldo=objMov1.getsaldo();
                    if(saldo>0){
                    operacion+="Retiros*********** $"+ retiro+"*************** $"+saldo+ "\n";
                    error=true;
                    
                    }else{
                    retiro=0;
                    JOptionPane.showMessageDialog(null, "error saldo insuficiente");
                    error=false;
                    }
                    
                      }catch(Exception objB){
                    JOptionPane.showMessageDialog(null, "debe insertar un monto");
                     error=false;
                    }
                    
                    }
                    
                    while(error=false);
                    }
                    ;break;//sirve para cerrar el proceso 
                
                case 2:{
                    nombre=objClientes1.getNombre();
                    apellidoP=objClientes1.getApellidoP();
                    apellidoM=objClientes1.getApellidoM();
                    numeroC=objCuenta1.getNumeroCuenta();
                    saldoI=objMov1.getSaldoInicial();
                    sumaDepositos=Movimientos.getSumaDepositos();
                    sumaRetiros=Movimientos.getSumaRetiros();
                    
                    
                    edoCuenta="cuenta: "+ numeroC+"\n"+
                            "nombre del cliente  "+ nombre+" "+ apellidoP+ " "+ apellidoM+ "\n"+
                            "*****************DETALLE DE MOVIMIENTOS*****\n"+
                            "Operación*************Importe*********Disponiilidad \n"+
                            "Depóstio*************$ "+ saldoI+ "*************** $"+ saldoI;
                    
                            JOptionPane.showMessageDialog(null, edoCuenta+"\n "+operacion+"\n\n "+"importe total de depositos $"+ sumaDepositos+ " \n\n "+
                            "importe total de retiros $"+ sumaRetiros+" \n\n"+ "tu saldo al corte el dia es $"+ saldo);
                };break;
                
                case 3:{
                    bandera=false;
                    JOptionPane.showMessageDialog(null, "ES un placer atenderle");
                }
            }
            }while(bandera);
        }
        else{
              JOptionPane.showMessageDialog(null, "Es un placer entenderle, Buen dia");
        }
            
        }
    
    
}

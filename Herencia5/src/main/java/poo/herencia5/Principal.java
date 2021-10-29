/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.herencia5;

import javax.swing.JOptionPane;

/**
 *
 * @author Arq Guillermo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     String nombre;
     int nivel;
     String datos;
     int mesesTrabajados; 
     boolean bandera=false;
     int seleccion;
     int seleccion2;
     JOptionPane.showMessageDialog(null, "Bienvenido a MICROSOFT");
     
     do{
     
     String[] menu={"Directivo", "Gerente","Obrero","Nuevo","salir"};
        seleccion = JOptionPane.showOptionDialog(null, "¿Seleccione su nivel en la empresa?","Menú de Opciones",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null, menu, menu[0]);
     
     switch(seleccion){
         case 0:{
         do{
         try{
         JOptionPane.showMessageDialog(null, "Bienvenido al sistema de nomina de directivos");
         nombre=JOptionPane.showInputDialog(null, "Porfavor introduzca su nombre completo");
         mesesTrabajados=Integer.parseInt(JOptionPane.showInputDialog(null, "introduzca sus meses trabajados en la empresa"));
         Directivo objDirectivo=new Directivo(0,nombre,0,seleccion);
         objDirectivo.CalcularSalario(mesesTrabajados);
         datos=objDirectivo.Nuevos();
         JOptionPane.showMessageDialog(null, datos);
         bandera=false;
         
         }catch(Exception objB){JOptionPane.showMessageDialog(null, "error datos incorrectos");bandera=true;}
         }while(bandera==true);
         };break;
         
         case 1:{
         do{
         try{
         JOptionPane.showMessageDialog(null, "Bienvenido al sistema de nomina de Gerentes");
         nombre=JOptionPane.showInputDialog(null, "Porfavor introduzca su nombre completo");
         mesesTrabajados=Integer.parseInt(JOptionPane.showInputDialog(null, "introduzca sus meses trabajados en la empresa"));
         Gerente objGerente=new Gerente(0,nombre,0,seleccion);
         objGerente.CalcularSalario(mesesTrabajados);
         datos=objGerente.Nuevos();
         JOptionPane.showMessageDialog(null, datos);
         }catch(Exception objB){JOptionPane.showMessageDialog(null, "error datos incorrectos");bandera=true;}
         }while(bandera==true);
         };break;
         
         case 2:{
         do{
         try{
         JOptionPane.showMessageDialog(null, "Bienvenido al sistema de nomina de Obreros");
         nombre=JOptionPane.showInputDialog(null, "Porfavor introduzca su nombre completo");
         mesesTrabajados=Integer.parseInt(JOptionPane.showInputDialog(null, "introduzca sus meses trabajados en la empresa"));
         Obrero objObrero=new Obrero(0,nombre,0,seleccion);
         objObrero.CalcularSalario(mesesTrabajados);
         datos=objObrero.Nuevos();
         JOptionPane.showMessageDialog(null, datos);
         }catch(Exception objB){JOptionPane.showMessageDialog(null, "error datos incorrectos");bandera=true;}
         }while(bandera==true);
         };break;
         
         case 3:{
         do{
         try{   
         JOptionPane.showMessageDialog(null, "Bienvenido al sistema de nomina de Empleados nuevos");
         nombre=JOptionPane.showInputDialog(null, "Porfavor introduzca su nombre completo");
         mesesTrabajados=Integer.parseInt(JOptionPane.showInputDialog(null, "introduzca sus meses trabajados en la empresa"));
         Empleado objEmpleado=new Empleado(nombre,0,seleccion);
         objEmpleado.CalcularSalario(mesesTrabajados);
         datos=objEmpleado.Nuevos();
         JOptionPane.showMessageDialog(null, datos);
         }catch(Exception objB){JOptionPane.showMessageDialog(null, "error datos incorrectos");bandera=true;}
         }while(bandera==true);
         };break;
         
         case 4:{
         System.exit(0);
         }
     }
     
       seleccion2=JOptionPane.showConfirmDialog(null, "Desea introducir otro Usuario");
       if(seleccion2==0){bandera=false;}else{bandera=true;};
       
     }while(bandera==false);  
       
    }
       
}

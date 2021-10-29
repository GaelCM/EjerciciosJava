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
public class Gerente extends Empleado {
    private double SalarioG;

    public Gerente(double SalarioG, String nombre, double salario, int nivel) {
        super(nombre, salario, nivel);
        this.SalarioG = SalarioG;
    }

    
    
    public double getSalarioD() {
        return SalarioG;
    }

    public void setSalarioD(double SalarioD) {
        this.SalarioG = SalarioD;
    }
    
    @Override
    
    public void CalcularSalario(int mesesTrabajados){
        objSalario=new Salario(3000,0.0,0.0,0.0,mesesTrabajados,0.0);
        objSalario.CalcularSalarioMensual();
        objSalario.CalcularSalarioAnual();
        objSalario.CalcularBonificacion(super.getNivel());
        objSalario.CalcularImpuesto();
        
        this.SalarioG=objSalario.CalcularSueldoFinal(super.getNivel());
    }
    
    @Override
    
    public String Nuevos(){
        String datosNuevo;
        datosNuevo=" el nombre es: "+super.getNombre()+" \n"+
                   " su nivel es: "+"Gerente"+"\n"+
                   " su salario anual es de: "+super.FormatoPesos(objSalario.getSueldloBA())+"\n"+
                   " obtuvo una bonificación de: "+super.FormatoPesos(objSalario.getTotalBonificacion())+"\n"+
                   " impuestos de 8% al SAT es de: "+super.FormatoPesos(objSalario.getImpuesto())+"\n"+
                   " Su sueldo final es de: "+super.FormatoPesos(this.SalarioG);
        
    return datosNuevo;
    }
}


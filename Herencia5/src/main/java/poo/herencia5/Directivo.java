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
public class Directivo extends Empleado{
    
    private double SalarioD;

    public Directivo(double SalarioD, String nombre, double salario, int nivel) {
        super(nombre, salario, nivel);
        this.SalarioD = SalarioD;
    }
    
    public double getSalarioD() {
        return SalarioD;
    }

    public void setSalarioD(double SalarioD) {
        this.SalarioD = SalarioD;
    }
    
    @Override
    
    public void CalcularSalario(int mesesTrabajados){
        objSalario=new Salario(3000,0.0,0.0,0.0,mesesTrabajados,0.0);
        objSalario.CalcularSalarioMensual();
        objSalario.CalcularSalarioAnual();
        objSalario.CalcularBonificacion(super.getNivel());
        objSalario.CalcularImpuesto();
        
        this.SalarioD=objSalario.CalcularSueldoFinal(super.getNivel());
    }
    
    @Override
    
    public String Nuevos(){
        String datosNuevo;
        datosNuevo=" el nombre es: "+super.getNombre()+" \n"+
                   " su nivel es: "+"Directivo"+"\n"+
                   " su salario anual es de: "+super.FormatoPesos(objSalario.getSueldloBA())+"\n"+
                   " obtuvo una bonificación de: "+super.FormatoPesos(objSalario.getTotalBonificacion())+"\n"+
                   " impuestos de 8% al SAT es de: "+super.FormatoPesos(objSalario.getImpuesto())+"\n"+
                   " Su sueldo final es de: "+super.FormatoPesos(this.SalarioD);
        
    return datosNuevo;
    }
}

import javax.swing.*;

public class Numeros {
    private String decimales[]={"","Diez","Veinte","Treinta","Cuarenta","Cincuenta","Sesenta","Setenta","Ochenta","Noventa"};
    private String unidades[]={"","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
    private String extra[]={"","Once","Doce","Trece","Catorce","Quince"};

    private int numero=0;




    public Numeros() {

    }



    public void calcularNum(int numero){

        if(numero>=11&&numero<=15){
            int resultado2=numero%10;
            JOptionPane.showMessageDialog(null,extra[resultado2]);
        }
        else {
            int resultado = numero / 10;
            int resultado2 = numero % 10;

                if(resultado==0){
                    JOptionPane.showMessageDialog(null,unidades[resultado2]);
                }
                else {
                    JOptionPane.showMessageDialog(null, decimales[resultado] + " y " + " " + unidades[resultado2]);
                }

            }
    }

    public static void main (String[] args) {
        int decision;
        int numero;
        do{
            numero=Integer.parseInt(JOptionPane.showInputDialog(null, "inserte su número a 2 dígitos"));

            Numeros objnum=new Numeros();
            objnum.calcularNum(numero);

            decision=JOptionPane.showConfirmDialog(null,"desea ingresar otro número","numeros",JOptionPane.YES_NO_OPTION);

        }while(decision==0);
    }


}

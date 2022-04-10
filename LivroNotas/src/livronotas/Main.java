/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livronotas;

/**
 *
 * @author Janli Felix
 */
import java.util.ArrayList;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ArrayList<Double> lista = new ArrayList();
        double d = 0.56;
        lista.add(d);
        lista.add(1.44376);        
        double d2 = lista.get(0);
        System.out.println(d2); 
        
        ArrayList<Integer> lista2 = new ArrayList();
        int i = 10;
        lista2.add(i);
        System.out.println(i);        
        int i2 = lista2.get(0);
        System.out.println(i2);
      

    }
}


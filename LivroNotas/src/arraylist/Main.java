/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist;

/**
 *
 * @author Janli Felix
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        LivrosNotasArrayList lista = new LivrosNotasArrayList();
        lista.adiconarNota(5.5);
        lista.adiconarNota(7.5);
        lista.adiconarNota(3.5);
        System.out.println("Media: " + lista.calcularMedia());
                     
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist;
import java.util.ArrayList;
/**
 *
 * @author Janli Felix
 */
public class LivrosNotasArrayList {
        
    private final ArrayList<Double> arrayNotas;
  
    public LivrosNotasArrayList(){
        this.arrayNotas = new ArrayList();
    }
    
    public void adiconarNota(double nota){
        this.arrayNotas.add(nota);
    }
    
    public double calcularMedia(){
        double soma=0.0;
        for (double i:arrayNotas){
            soma += i;
        }
        return soma/arrayNotas.size();
    }
        

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livronotas;

/**
 *
 * @author Janli Felix
 */
public class LivroNotasArray {
    private int indice;
    private double arrayNotas[];
  
    public LivroNotasArray(int tam){
        this.arrayNotas = new double[tam];
        this.indice = 0;
    }
    
    public void adiconarNota(double nota){
        this.arrayNotas[indice] = nota;
        this.indice++;        
    }
    
    public double calcularMedia(){
        double soma=0.0;
        for (double i:arrayNotas){
            soma += i;
        }
        System.out.println(indice);
        return soma/indice;
    }
}

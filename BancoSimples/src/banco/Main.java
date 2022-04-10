/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

/**
 *
 * @author Janli Felix
 */
class Main {  
  public static void main(String[] args) {
   Conta c1 = new Conta("1111");
    System.out.println(c1);
    c1.creditar(10.0);
    System.out.println(c1);
    c1.debitar(5.0);
    System.out.println(c1);

    Poupanca p1=new Poupanca("2222");
    System.out.println(p1);
    p1.creditar(100);
    System.out.println(p1);
    p1.debitar(10);
    System.out.println(p1);
    p1.renderJuros(50);
    System.out.println(p1);

    Conta c2=new Conta("3333");
    System.out.println(c2);
    c2.creditar(150);
    System.out.println(c2);
    c2.transferir(50,p1);
    c2.transferir(50,c1);
    System.out.println(c1);
    System.out.println(p1);
    System.out.println(c2);
  }
}

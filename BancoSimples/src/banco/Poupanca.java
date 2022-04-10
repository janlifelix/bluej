/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Janli Felix
 */
public class Poupanca extends Conta{
  public Poupanca (String conta){
    super(conta);
  }
  public void renderJuros(double juros){
    setSaldo(getSaldo() + getSaldo()*juros/100);
  }
}

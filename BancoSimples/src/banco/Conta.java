/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Janli Felix
 */
public class Conta{
  private String conta;
  private double saldo;
  public Conta(String conta){
    super();
    this.conta=conta;
    this.saldo=0;
  }
  public String getConta(){
    return conta;
    }
  public double getSaldo(){
    return saldo;
    }    
  public void setConta(String conta){
    this.conta=conta;
    }
  public void setSaldo(double saldo){
    this.saldo=saldo;
    }
  public void creditar(double valor){
    this.saldo+=valor;
  }
  public void debitar(double valor){
    if (valor<=this.saldo){
      this.saldo-=valor;
    }
  }
  public void transferir (double valor, Conta conta){
    this.debitar(valor);
    conta.creditar(valor);
  }
  
  @Override
  public String toString(){
    return "Conta: " + this.conta + "\nSaldo: " + this.saldo;
  }
  
    
}

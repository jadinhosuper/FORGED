public class Conta {
 private int numero;
 private String Titular;
 private double Saldo;
  
public double getSaldo(){
 return this.Saldo;
}
public String getTitular(){
 return this.Titular;
} 
public int getNumero(){
 return this.numero;
}  
public void setSaldo(Double Saldo){
 this.Saldo = Saldo;
}
public void setTitular(String Titular){
 this.Titular = Titular;
} 
public void setNumero(int numero){
this.numero = numero;
}
public void sacar(double valor){
 if (valor<=this.Saldo) {
  this.Saldo -=valor;
  System.out.println("saque com Sucesso");
 }
 else {
  System.out.println("Saque invalido");
}
}
public void deposida(double valor){
 this.Saldo +=valor;
}
}

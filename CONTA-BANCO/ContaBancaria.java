import java.util.Scanner;

  public class ContaBancaria {
  public static void main(String[] args) {

Scanner in = new Scanner(System.in);

System.out.println("Por favor, digite o número da Agência:");
int numero1 = in.nextInt();

System.out.println("Por favor, digite a sua Agência:");
String nome1 = in.next();

System.out.println("Por favor, digite o nome do Usuário:");
String nome2 = in.next();

System.out.println("Por favor, digite o saldo do Usuário:");
double numero2 = in.nextDouble();

System.out.println( "Olá " + nome2 + "! Obrigado por criar uma conta em nosso banco, sua agência é: " + nome1 + ", sua conta é: " + numero1 + " e seu saldo " + numero2 + "já está disponível para saque. ");

  }
}
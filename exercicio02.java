import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

 System.out.print("Digite o primeiro número inteiro: ");
 int num1 = scanner.nextInt();

 System.out.print("Digite o segundo número inteiro: ");
 int num2 = scanner.nextInt();

 int subtracao = num1 - num2;
 int multiplicacao = num1 * num2;
 
 if (num2 != 0) {
 double divisao = (double) num1 / num2; 
 System.out.println("A divisão do primeiro pelo segundo: " + divisao);
 } else {
 System.out.println("Não é possível dividir por zero.");
 }

 System.out.println("A subtração do primeiro pelo segundo: " + subtracao);
 System.out.println("A multiplicação do primeiro pelo segundo: " + multiplicacao);

 scanner.close();
 }
}
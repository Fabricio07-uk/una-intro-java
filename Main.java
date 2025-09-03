import java.util.Scanner;

public class Main {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Digite o primeiro número inteiro: ");
int num1 = input.nextInt();

System.out.print("Digite o segundo número inteiro: ");
int num2 = input.nextInt();

int soma = num1 + num2;

System.out.println("A soma dos dois números é: " + soma);

input.close();
}
}
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá cliente! Digite seu nome: ");
        String nome = sc.next();

        System.out.println("Digite os dados de sua agência: ");
        String agencia = sc.next();

        System.out.println("Digite seu número de conta: ");
        int numero = sc.nextInt();
         
        System.out.println("Digite seu saldo: ");
        double saldo = sc.nextDouble();

        

        System.out.println("Ola " + nome + ", obrigado por cria sua conta em nosso banco!");
        System.out.println("Sua agência é a " + agencia + " e sua conta é a " + numero);
        System.out.println("Seu saldo disponível para saque é de R$ " + saldo);
    }
}

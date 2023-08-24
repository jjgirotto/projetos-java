import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        //Exibir as mensagens para o usuário e coletar dados
        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();
        System.out.println("Digite o número da agência: ");
        String agencia = scanner.next();
        System.out.println("Digite o seu nome: ");
        scanner.nextLine();
        String nome = scanner.nextLine();
        System.out.println("Digite o valor do saldo: ");
        double saldo = scanner.nextDouble();

        //Exibir a mensagem final
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        ContaBanco contaBanco = new ContaBanco();

        System.out.print("Por favor, digite o número: ");
        contaBanco.numero = sc.nextInt();

        System.out.print("Por favor, digite a agência: ");
        sc.nextLine();
        contaBanco.agencia = sc.nextLine();

        System.out.print("Por favor, digite o nome: ");
        contaBanco.nomeCliente = sc.nextLine().toUpperCase();

        System.out.print("Por favor, digite o saldo a ser depositado: ");
        contaBanco.saldo = sc.nextDouble();

        System.out.println(contaBanco);

        sc.close();
    }
}

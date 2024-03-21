//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String nomeDoCliente = "Jacob Lin Charles";
        String tipoDeConta = "Corrente";
        double saldoBancario = 2500.00;
        double valoraSaque = 0;
         int valordDepsoito = 0;
        double faturaCaratao = 800;
        int recebeOpcao = 1;



        System.out.println("**************************");
        System.out.println("\nDados iniciais do cliente");
        System.out.println("Nome do cliente: " +  nomeDoCliente);
        System.out.println("Tipo de conta : " + tipoDeConta);
        System.out.println("Saldo atual do cliente: " + saldoBancario);
        System.out.println("\n************************** ");

        System.out.println("OPERAÇÕES\n");

             while (recebeOpcao != 5){
                 Scanner dados = new Scanner(System.in);
                 System.out.println("""
             Digite uma das opcoes : 
             1 - Consultar Saldo
             2 - Deposito Bancario 
             3 - Saque Bancario
             4 - Consultar Valor Da Fatura 
             5 - Sair
             """);

                 recebeOpcao = dados.nextInt();
                switch (recebeOpcao){
                    case 1:
                        System.out.println("Seu saldo atual é :\n" + saldoBancario);
                        break;

                    case 2:
                        System.out.println("Qual valor deseja depositar? \n");
                         valordDepsoito = dados.nextInt();
                         saldoBancario = saldoBancario + valordDepsoito;
                         System.out.println("O valor depositado é : " + valordDepsoito);
                         System.out.println("O saldo atual é\n: " + saldoBancario);
                         break;

                    case 3:
                        System.out.println("Qual o valor que deseja sacar? : ");
                        valoraSaque = dados.nextDouble();
                        saldoBancario = saldoBancario - valoraSaque;
                        if (valoraSaque < saldoBancario ){
                            System.out.println("""
                                    Valor para saque indisponivel!
                                   """);
                            break;

                        }
                            System.out.println("O valor de saque foi : " + valoraSaque);
                            System.out.println("O saldo atual é :\n" + saldoBancario);
                            break;

                    case 4:
                        System.out.println("O valor da fatura do seu cartão é :\n" + faturaCaratao);
                        break;

                    case 5:
                        System.out.println("Operação encerrada!\n");
                        break;

                    default:
                        System.out.println("Opção invalida! Digite um das opcoes seguintes :\n");
                        break;

                }

             }

    }
}
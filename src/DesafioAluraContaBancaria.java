import java.util.Scanner;

public class DesafioAluraContaBancaria{

    public static class DesafioAlura {

        public static void main(String[] args) {
            //nome, tipo de conta, saldo inicial
            //recebeTransferencia(), fazTransferencia(), enviaPix() e recebePix().

            String nome = "Jaqueline Souza";
            String tipoConta = "Poupança";
            double saldoInicial = 2500.00;

            int opcao = 0;
            double valor = 0;

            System.out.println("Conta Digital");
            System.out.println("---------------------------------------------");
            System.out.println( "Usuário: " + nome);
            System.out.println("Tipo de conta: " + tipoConta);
            System.out.println("Saldo Inicial: " + saldoInicial + " reais");
            System.out.println("---------------------------------------------");


            while (opcao != 4){
                System.out.println("Operações");
                System.out.println("1- Consultar saldo");
                System.out.println("2- Transferir valor");
                System.out.println("3- Receber valor");
                System.out.println("4- Sair");
                System.out.println("Digite a operação desejada:");
                Scanner leitura = new Scanner(System.in);
                opcao = leitura.nextInt();

                if(opcao == 1){
                    System.out.println(saldoInicial);

                }else if(opcao == 2){
                    System.out.println("Digite o valor:");
                    valor = leitura.nextDouble();
                    saldoInicial = saldoInicial - valor;

                }else if(opcao == 3){
                    System.out.println("Digite o valor:");
                    valor = leitura.nextDouble();
                    saldoInicial = saldoInicial + valor;
                }
            }

        }

    }


}

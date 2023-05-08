package A5;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> contas = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Divisao divisao = new Divisao();
        Multiplicacao multiplicacao = new Multiplicacao();
        int resposta = 0;
        float num1 = 0;
        float num2 = 0;
        String valor = "";
        int cont = 1;
        System.out.println("Bem-vindo a calculadora!");
        while(true) {
            do {
                System.out.printf("Você está no seu %dº calculo!", cont);
                System.out.println("\n1. Para soma\n2. Para subtração\n3. Para multiplicação\n4. Para divisão" +
                        "\n5. Para historico\n0. Para sair\nDigite: ");
                resposta = scanner.nextInt();
                if(resposta == 1 || resposta == 2 || resposta == 3 || resposta == 4) cont++;
                if (resposta > 0 && resposta < 5) {
                    System.out.print("Digite o primeiro número: "); num1 = scanner.nextFloat();
                    System.out.print("Digite o segundo número: "); num2 = scanner.nextFloat();
                }
                if (resposta < 0 || resposta > 5) System.out.println("Erro, digite novamente!");
            } while (resposta < 0 || resposta > 5);
                if (resposta == 4) {
                    valor = divisao.calcula(num1, num2);
                }
                else if (resposta == 1) {
                    valor = soma.calcula(num1, num2);
                }
                else if (resposta == 2){
                    valor = subtracao.calcula(num1, num2);
                }
                else if (resposta == 3){
                    valor = multiplicacao.calcula(num1, num2);
                }
                else if (resposta == 0){
                    System.out.println("Fim do programa.");
                    break;
                }
                else if (resposta == 5){
                    System.out.println("\nHistorico de calculos: ");
                    for(int i = 0; i < contas.size(); i++){
                        System.out.println(contas.get(i));
                    }
                    System.out.println();
                    }
                if(resposta != 5) {
                    System.out.println("Resultado: "+valor);
                    contas.add(valor);
                }
            }
        System.out.printf("\nO programa fez:\n%d Somas\n%d Subtrações\n%d Multiplicações\n%d Divisões"
                , soma.contSoma, subtracao.contSubtracao, multiplicacao.contMultiplicacao, divisao.contDivisao);
    }
}
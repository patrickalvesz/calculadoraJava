package A5;

public class historico{
    Soma soma = new Soma();
    Subtracao subtracao = new Subtracao();
    Divisao divisao = new Divisao();
    Multiplicacao multiplicacao = new Multiplicacao();
    historico[] historicos = new historico[200];

    public void valores(){
        System.out.printf("\nO programa fez:\n%d Somas\n%d Subtrações\n%d Multiplicações\n%d Divisões"
                , soma.contSoma, subtracao.contSubtracao, multiplicacao.contMultiplicacao, divisao.contDivisao);
    }
}

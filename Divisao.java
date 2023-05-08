package A5;

public class Divisao extends OperacaoMatematica {
    public int contDivisao = 0;

    public String calcula(float num, float num2) {
        contDivisao++;
        float divi = num/num2;
        return num + " / " + num2 + " = " + divi;
    }
}

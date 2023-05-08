package A5;

public class Soma extends OperacaoMatematica{
    public int contSoma = 0;

    public String calcula(float num, float num2) {
        contSoma++;
        float sum = num + num2;
        return num+" + "+num2+" = "+sum;
    }
}

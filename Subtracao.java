package A5;

public class Subtracao extends OperacaoMatematica{
    public int contSubtracao = 0;
    public String calcula(float num, float num2) {
        contSubtracao++;
        float sub = num - num2;
        return num+" - "+num2+" = "+sub;
    }
}

package A5;

public class Multiplicacao extends OperacaoMatematica{
    public int contMultiplicacao = 0;
    public String calcula(float num, float num2) {
        contMultiplicacao++;
        float mult = num * num2;
        return num+" * "+num2+" = "+mult;
    }
}

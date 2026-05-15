package pacote_de_formulas.Calcular_a_área_de_uma_Caixa;
import java.util.Scanner;
public class caixa {
    public static void main(String[] args){
        Scanner oi = new Scanner(System.in);

        System.out.println("qual o comprimento da caixa?: ");
        double comprimento = oi.nextDouble();

        System.out.println("qual a largura da caixa?: ");
        double largura = oi.nextDouble();

        System.out.println("qual a altura da caixa?: ");
        double altura = oi.nextDouble();

        double area = 2*(comprimento*largura+comprimento*altura+largura*altura);

        System.out.println("area: "+area);
    }
}

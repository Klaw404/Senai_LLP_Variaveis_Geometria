package pacote_de_formulas.Calcular_a_área_de_uma_Bola;
import java.util.Scanner;
public class bola {
    public static void main(String[] args){
        Scanner oi = new Scanner(System.in);

        System.out.println("digite o raio da esfera: ");
        double raio = oi.nextDouble();

        double area = 4 * 3.14 * (raio*raio);

        System.out.println("area: "+area);
    }
}

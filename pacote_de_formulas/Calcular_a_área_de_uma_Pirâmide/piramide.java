package pacote_de_formulas.Calcular_a_área_de_uma_Pirâmide;
import java.util.Scanner;
public class piramide {
    public static void main(String[] args){
        Scanner oi = new Scanner(System.in);

        System.out.println("digite o valor do lado da base: ");
        double ladob = oi.nextDouble();
        double areab = ladob*ladob;

        System.out.println("digite o apótema da pirâmide: ");
        double apotema = oi.nextDouble();

        double areatriangulo = (4*(ladob*apotema/2))+areab;

        System.out.println("area: "+areatriangulo);

    }
}

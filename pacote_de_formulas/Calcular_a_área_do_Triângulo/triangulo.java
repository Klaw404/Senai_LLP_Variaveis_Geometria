package pacote_de_formulas.Calcular_a_área_do_Triângulo;
import java.util.Scanner;
public class triangulo {
    public static void main(String[] args){
        Scanner oi = new Scanner(System.in);
        
        System.out.println("digite a base: ");
        double b = oi.nextDouble();
        System.out.println("digite a altura: ");
        double h = oi.nextDouble();

        double area = b*h/2;

        System.out.println("area: "+area);
    }
}

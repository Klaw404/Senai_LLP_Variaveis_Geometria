package pacote_de_formulas.Calcular_a_área_do_Círculo;
import java.util.Scanner;
public class circulo {
    public static void main(String[] args){
        Scanner oi = new Scanner(System.in);

        System.out.println("digite o raio: ");
        double raio = oi.nextDouble();
        
        double areacirculo = 3.14*raio;

        System.out.println("area: "+areacirculo);

    }
    
}

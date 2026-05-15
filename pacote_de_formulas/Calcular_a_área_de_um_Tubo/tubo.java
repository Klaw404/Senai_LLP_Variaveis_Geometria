package pacote_de_formulas.Calcular_a_área_de_um_Tubo;
import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;
public class tubo {
    public static void main(String[] args){
        Scanner oi = new Scanner(System.in);

        System.out.println("qual o raio do tubo?: ");
        double raio = oi.nextDouble();

        System.out.println("qual a altura do tubo?: ");
        double altura = oi.nextDouble();

        double areala = 2*3.14*raio*altura;

        double areabase = 2*(3.14*(raio*raio));

        double area = areala+areabase;

        System.out.println("area: "+area);
    }
}

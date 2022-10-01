import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double raio, area;
        System.out.println("Digite o raio de um círculo: ");
        raio = sc.nextInt();
        sc.close();
        area = Math.PI*Math.pow(raio, 2);
        System.out.println("A área do cícurlo é " + area);
    }
}

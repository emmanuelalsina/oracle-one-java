import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Escribe la nota que le darías a la película");
            nota = teclado.nextDouble();
            mediaEvaluaciones = mediaEvaluaciones + nota;

        }
        //lo dividimos entre 3 porque es numero de evaluaciones que va a hacer el bucle
        System.out.println("El promedio de evaluaciones para Matrix:"+mediaEvaluaciones / 3);
    }
}

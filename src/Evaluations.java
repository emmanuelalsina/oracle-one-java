import java.util.Scanner;

public class Evaluations {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        double totalEvaluaciones =0;

        while ( nota != -1 ){
            System.out.println("Escribe la nota que le darías a la película");
            nota = teclado.nextDouble();

            if( nota != -1){
                mediaEvaluaciones += nota;
                totalEvaluaciones ++;

            }
        }
        //lo dividimos entre 3 porque es numero de evaluaciones que va a hacer el bucle
        System.out.println("El promedio de evaluaciones para Matrix:"+ mediaEvaluaciones / totalEvaluaciones);
    }
}

import java.util.Scanner;

public class Lecture {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe el nombre de tu película favorita");
        String pelicula = teclado.nextLine();

        System.out.println("Ahora escibe la fecha de lanzamiento");
        int fechaDeLanzamiento = teclado.nextInt();

        System.out.println("Por último dinos la nota que le das a la película");
        double nota = teclado.nextDouble();

        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota);

    }
}

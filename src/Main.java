//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Bienvenido a Screen Match");
        System.out.println("Pelicula: Matrix ");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double calificacionDePelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3 ;
        System.out.println(media);

        String sinopsis = """
                Matrix es una paradoja
                La mejor película del fin del milenio
                Fue lanzada en :
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);
        int clasificacion = (int) (media / 2);
        System.out.println(clasificacion);

            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.

        }
    }



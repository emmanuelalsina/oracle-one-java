/*
App bancaria en consola para Tony Stark

-Cuenta corriente con saldo inicial de 1599.99
-Menú que se repite hasta que el usuario elija salir con el número 9
-Opciones: 1 consultar saldo, 2 retirar, 3 depositar, 9 salir
-Al retirar, validar que haya saldo suficiente, si no mostrar mensaje de error
-Al depositar, sumar al saldo y mostrar el nuevo valor
-Al salir, mostrar mensaje de despedida y terminar el programa

 */
//importamos la clase scanner para poder usarla
import java.util.Scanner;


public class Desafio {
    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String tipoDeCuenta= "corriente";
        double saldo = 1599.99;
        System.out.println("Cliente: " + nombre);
        System.out.println("Tipo de Cuenta: " + tipoDeCuenta);
        System.out.println("Saldo disponible:$" + saldo);

        Scanner scanner = new Scanner(System.in);
        //declaro afuera para poder usar dentro del bucle (double para que lea decimales
        double retiro ;
        double deposito;

        //la declaro afuera y se usa adentro
        // de otra forma crearía un nuevo objeto Scanner en cada vuelta
        //
        int opcion = 0;


        String menu = """
                **Escribe el número de la opción deseada**
                1) Consultar
                2) Retirar
                3) Depositar
                9) Salir
                """;

        //mientras la opción no sea nueve sigue ejecutando el código
        while(opcion != 9){
            System.out.println(menu);

            //scanner.nextDouble() para que pueda leer decimales
            switch ( opcion = scanner.nextInt() ){
                case 1:
                    System.out.println("Saldo disponible:" + String.format("%.2f", saldo));
                    break;

                //pedir la cantidad que quiere retirar (mostrar mensaje)
                //leer la cantidad
                //validar que haya saldo suficiente, si no mostrar mensaje de error
                //Si es válido → restar al saldo
                case 2:
                    System.out.println("Ingresa la cantidad deseas retirar: ");
                    //scanner.nextDouble() para que pueda leer decimales
                    retiro = scanner.nextDouble();
                    if(retiro > saldo ){
                        System.out.println("Saldo insuficiente");

                    }else{
                        saldo -= retiro;
                        System.out.println("Su saldo actual es de: " + String.format("%.2f", saldo));

                    }
                    break;


                case 3:
                    // necesito tomar la variable saldo y le sume  la cantidad que depositar
                    // Muestre la cantidad de saldo despues de haber depositado
                    System.out.println("Ingresa la cantidad deseas depositar: ");
                    deposito = scanner.nextDouble();
                    //sumo la cantidad ingresada por el usuario al saldo
                    saldo += deposito;
                    //imprimo saldo actual
                    System.out.println("Su saldo actual es de: " + String.format("%.2f", saldo));
                    break;

                case 9:
                    System.out.println("Finalizando el programa... Muchas gracias por usuar nuestro servicio");
                    break;



            }

        }



    }
}

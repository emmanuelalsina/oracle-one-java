/*
Escribe un programa que convierta una temperatura en grados Celsius a Fahrenheit.
Utiliza variables para representar los valores de las temperaturas e imprime en la consola el valor convertido de Celsius a Fahrenheit.

Consejo: La fórmula para convertir temperaturas de grados Celsius a Fahrenheit es: (temperatura * 1.8) + 32.
*/


// 1. Importar Scanner para leer los datos escritos por el teclado
import java.util.Scanner;



public class Converter { // Creamos la clase. El archivo debe llamarse igual.
    // Punto de entrada del programa. Aquí empieza a ejecutarse Java.
    public static void main(String[] args) {

        // 2. Creamos el objeto Scanner "sc" que permitirá capturar entrada del teclado
        //new Scanner(...)está creando esa herramienta  | System.in → leer desde el teclado
        Scanner sc = new Scanner(System.in);

        // Mensaje para pedir el dato al usuario
        System.out.println("Enter temperature in Celsius:");

        // 3. Guardamos el número decimal que escribe el usuario
        double celsius = sc.nextDouble() ;

        // 4. Aplicamos la fórmula de conversión a Fahrenheit
        double farenheit = (celsius * 1.8) + 32 ;

        // 5. Mostramos el resultado limitando a 2 decimales
        // %.2f → número decimal con solo 2 cifras después del punto
        System.out.println(String.format("The temperature %.2f  Celsius equals %.2f in Farenheit",celsius,farenheit));




    }

}

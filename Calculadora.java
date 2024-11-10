import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
       

        Scanner scanner = new Scanner(System.in);

        // Pedir los dos números al usuario
        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        // Preguntar por la operación a realizar
        System.out.println("Selecciona la operación a realizar:");
        System.out.println("1: Suma");
        System.out.println("2: Resta");
        System.out.println("3: Multiplicación");
        System.out.println("4: División");
        int operacion = scanner.nextInt();

        double resultado;

        // Realizar la operación seleccionada
        switch (operacion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("El resultado de la división es: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("Operación no válida. Por favor, selecciona una opción del 1 al 4.");
                break;
        }

        // Cerrar el escáner
        scanner.close();
    }
}
 

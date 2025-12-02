import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Practica2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        System.out.println("Introduce el primer numero: ");
        while (!sc.hasNextInt()) {
            System.out.println("No es un numero correcto, Introduce un numero: ");
            sc.nextLine();
        }
        num1 = sc.nextInt();

        System.out.println("Introduce el segundo numero");
        while (!sc.hasNextInt()) {
            System.out.println("No es un numero correcto, Introduzca un numero: ");
            sc.nextLine();
        }

        while (!sc.hasNextInt()) {
            System.out.println("No es un numero correcto, Introduzca un numero: ");
        }
        num2=sc.nextInt();

        if (num2 > num1) {
            int contador = 0;
            while (num1 <= num2) {
                System.out.print(num1 + " ");
                num1++;
                contador++;
                if (contador == 3) {
                    System.out.println("");
                    contador = 0;

                }
            }
        } else {
            System.out.println("El segundo numero es menor que el primero: ");


        }
    }
}
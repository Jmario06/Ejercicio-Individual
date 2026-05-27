import java.util.Scanner;

public class Multiplicacion {

    public int multiplicar(int a, int b) {
        return a * b;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Multiplicacion m = new Multiplicacion();


        System.out.print("Ingrese el primer número entero: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = sc.nextInt();

        int resultado = m.multiplicar(num1, num2);
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}

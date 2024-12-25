import java.util.Scanner;

public class Ejercicio2 {
    /*
     * Desarrollar un programa que cargue los lados de un triángulo e implemente los
     * siguientes métodos: inicializar los atributos, imprimir el valor del lado
     * mayor y otro método que muestre si es equilátero o no.
     */
    private Scanner sc = new Scanner(System.in);
    private int lado1;
    private int lado2;
    private int lado3;

    public void inicializar() {
        System.out.println("Ingrese el lado 1 del triangulo");
        lado1 = sc.nextInt();
        System.out.println("Ingrese el lado 2 del triangulo");
        lado2 = sc.nextInt();
        System.out.println("Ingrese el lado 3 del triangulo");
        lado3 = sc.nextInt();
    }

    public void calculoLadoMayor() {
        if (lado1 > lado2 && lado1 > lado3) {
            System.out.println("El lado mayor es: " + lado1);
        } else {
            if (lado2 > lado3) {
                System.out.println("El lado mayor es: " + lado2);
            } else {
                System.out.println("El lado mayor es: " + lado3);
            }
        }
    }
    public void esEquilaptero(){
        if (lado1 == lado2 && lado1 == lado3 ) {
            System.out.println("El triangulo es Equilaptero");
        }else{
            System.out.println("El triangulo no es equilaptero");
        }
    }
    public static void main(String[] args) {
        Ejercicio2 ejercicio2;
        ejercicio2 = new Ejercicio2();
        ejercicio2.inicializar();
        ejercicio2.calculoLadoMayor();
        ejercicio2.esEquilaptero();
    }
}

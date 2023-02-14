/*Modificar el algoritmo anterior para mostrar un mensaje según la temperatura:Temperatura Mensaje t < 2 Riesgo de hielo 2 ≤ t < 15 Hace frío 15 ≤ t < 30 Buena temperatura t ≥ 30 Demasiado calor*/
import java.util.Scanner;
class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la temperatura: ");
        int temp = sc.nextInt();
        if (temp < 2) {
            System.out.println("Riesgo de hielo");
        } else if (temp >= 2 && temp < 15) {
            System.out.println("Hace frío");
        } else if (temp >= 15 && temp < 30) {
            System.out.println("Buena temperatura");
        } else {
            System.out.println("Demasiado calor");
        }
    }
}
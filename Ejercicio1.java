/*Escriba un algoritmo que muestre "riesgo de hielo", si la temperatura introducida es inferior a 2°C.*/

class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la temperatura: ");
        int temp = sc.nextInt();
        if (temp < 2) {
            System.out.println("Riesgo de hielo");
        }
    }
}
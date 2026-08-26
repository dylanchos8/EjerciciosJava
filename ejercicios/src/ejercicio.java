import  java.util.Scanner;

public class ejercicio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("dame un número: ");
        int num1 = scanner.nextInt();

        System.out.print("dame un segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("dame un tercer número: ");
        int num3 = scanner.nextInt();


        int suma = num1 + num2 + num3;
        double promedio = suma / 3.0;

        int numayor;

        if(num1 >= num2 && num1 >= num3){
            numayor = num1;

        } else if (num2 >= num1 && num2 >= num3) {
            numayor = num2;

        } else {
            numayor = num3;
        }

        System.out.println("la suma de los 3 números es :  " + suma);
        System.out.println("El promedio de la suma de los 3 números es: " + promedio);
        System.out.println("El número mayor entre los tres números es: " + numayor);

        scanner.close();
    }
}

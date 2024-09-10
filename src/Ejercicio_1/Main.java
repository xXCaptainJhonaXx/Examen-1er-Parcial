package Ejercicio_1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Empleados[] list = new Empleados[3];

        System.out.println("Inserte los datos del empleado: ");
        for(int i = 0; i < list.length; i++){
            System.out.print("Nombre: ");
            String nombre = sc.next();

            System.out.print("Edad: ");
            int edad = sc.nextInt();

            System.out.print("Salario: ");
            double salario = sc.nextDouble();

            System.out.println("Empleado " + (i+1) + " registrado");

            list[i] = new Empleados(nombre, edad, salario);
        }

        for(int i = 0; i < list.length; i++){
            list[i].aplicarAumento();
        }


    }
}

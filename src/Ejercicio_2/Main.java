package Ejercicio_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vehiculo[] auto = new Vehiculo[3];

        for(int i = 0; i < auto.length; i++){
            System.out.print("Marca: ");
            String marca = sc.next();

            System.out.print("Modelo: ");
            String modelo = sc.next();

            System.out.print("Precio: ");
            int precio = sc.nextInt();

            System.out.println("Vehiculo " + (i+1) + " registrado");

            auto[i] = new Vehiculo(marca, modelo, precio);

        }

        for(int i = 0; i < auto.length; i++){
            if((auto[i].getPrecio() > 2500) && (auto[i].getPrecio() < 4000)){
                auto[0] = auto[i];
                auto[0].mostrarDatos();
            }

        }



    }
}

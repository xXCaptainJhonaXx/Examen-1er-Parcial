package Ejercicio_2;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int precio;

    public Vehiculo(String marca, String modelo, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void mostrarDatos(){
        System.out.println("Auto entre los 2500$ - 4000$: ");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: " + precio);
    }

}

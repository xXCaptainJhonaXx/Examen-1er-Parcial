package Ejercicio_1;

public class Empleados {

    //atributos
    private String nombre;
    private int edad;
    private double salario;


    //constructor
    public Empleados(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    //gets
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public void aplicarAumento(){
        double aumento;
        if(salario < 3000){
            aumento = (salario * 0.10) + salario;
            this.salario = aumento;
            System.out.println(nombre + " recibe un aumento del 10%. Salario actual: " + salario);
        } else {
            System.out.println(nombre + " No aplica para el aumento");
        }
    }
}

package ejercicio_codoacodo_poo;

/*
Crear un programa en java en el cual se pida al usuario ingresar su nombre, apellido, edad, hobbie, editor de código preferido, 
sistema operativo que utiliza, luego deberá mostrarse por consola los datos ingresados.
*/

import java.util.Scanner;


public class Ejercicio_codoacodo_poo {

    public static void main(String[] args) {
        
        
        Scanner inputLinea = new Scanner(System.in);
        
        String nombre;
        String apellido;
        int edad;
        String hobbie;
        String editor_preferido;
        String sistema_operativo;
        
        System.out.println("Por favor, ingrese los siguientes datos: ");
        System.out.println("Ingrese nombre");
        nombre = inputLinea.next();
        System.out.println("Ingrese apellido");
        apellido = inputLinea.next();
        System.out.println("Ingrese edad");
        edad = inputLinea.nextInt();
        System.out.println("Ingrese hobbie");
        hobbie = inputLinea.next();
        System.out.println("Ingrese editor preferido");
        editor_preferido = inputLinea.next();
        System.out.println("Ingrese sistema operativo");
        sistema_operativo = inputLinea.next();
        
        Usuario u1 = new Usuario(nombre, apellido, edad, hobbie, editor_preferido, sistema_operativo);
        
        u1.mostrarDatos(u1);
        
    }
    
}

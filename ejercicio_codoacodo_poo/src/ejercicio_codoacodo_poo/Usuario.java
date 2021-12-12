package ejercicio_codoacodo_poo;

import java.util.Scanner;

public class Usuario {
    
    String nombre;
    String apellido;
    int edad;
    String hobbie;
    String editor_preferido;
    String sistema_operativo;
     
/*--------------- CONSTRUCTOR --------------------*/

    public Usuario (String nuevoNombre, String nuevoApellido, int nuevaEdad,
                    String nuevoHobbie, String nuevoEditor_preferido,
                    String nuevoSistema_operativo) {

        nombre = nuevoNombre;
        apellido = nuevoApellido;
        edad = nuevaEdad;
        hobbie = nuevoHobbie;
        editor_preferido = nuevoEditor_preferido;
        sistema_operativo = nuevoSistema_operativo;
        
    }
    
    
    
    public void mostrarDatos(Usuario usuario){
        
        System.out.println("Los datos del usuario ingresados son:");
        System.out.println("Nombre: "+ usuario.nombre);
        System.out.println("Apellido: "+ usuario.apellido);
        System.out.println("Edad: "+ usuario.edad);
        System.out.println("Hobbie: "+ usuario.hobbie);
        System.out.println("Editor preferido: "+ usuario.editor_preferido);
        System.out.println("Sistema Operativo: "+ usuario.sistema_operativo);
        
    }
}
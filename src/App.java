import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

/// <summary>
///Autor: Juan De Leon
///Fecha: 16/09/2023
///Validacion de usuario usando for
/// </summary>

//Definicion de variables

String user = "Juan De Leon";
String clave = "Nomi20120";

  // Objeto Scanner para leer la entrada del usuario
    Scanner scanner = new Scanner(System.in);

    // Ciclo for que permite 3 intentos
    for (int intentos = 3; intentos > 0; intentos--) {
        System.out.print("Usuario: ");
        String usuarioIngresado = scanner.nextLine();

        System.out.print("Contraseña: ");
        String contrasenaIngresada = scanner.nextLine();


        // Validaciones de espacios en blanco
        if (usuarioIngresado.trim().isEmpty() || contrasenaIngresada.trim().isEmpty()) {
            System.out.println("Por favor, ingresa usuario y contraseña.");
            continue; // Vuelve al inicio del bucle sin restar intentos
        }

        // Validacion de datos correctos
        if (usuarioIngresado.equals(user) && contrasenaIngresada.equals(clave)) {
            System.out.println("Bienvenido " + user);
            break; // Termina el bucle si los datos son correctos
        } else {
            System.out.println("Usuario o contraseña incorrectos. Intentos restantes: " + (intentos - 1));
        }

        // Si es el último intento, muestra un mensaje de acceso denegado
        if (intentos == 1) {
            System.out.println("Ya no hay mas intentos ");
        }
    }

    // Cerramos el scanner al finalizar para liberar recursos del sistema
    scanner.close();
}



    }


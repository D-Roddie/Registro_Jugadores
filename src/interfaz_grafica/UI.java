package interfaz_grafica;

import capa_logica.CL;
import capa_logica.Jugador;
import java.io.*;

public class UI {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    static CL nuevoJugador = new CL();

    public static void main(String[] args) throws java.io.IOException {
        menu_principal();
    }

    
    public static void menu_principal() throws java.io.IOException {
        boolean seguir;
        int opcion;
        seguir = true;
        opcion = -1;
        do {
            out.println("---MENU PRINCIPAL---");
            out.println("1. Registrar jugador");
            out.println("2. Listar jugador");
            out.println("3.Salir");
            out.println("Digite la opcion");
            opcion = Integer.parseInt(in.readLine());
            procesarOpcion(opcion);
            out.println("La opcion ingresada fue" + opcion);
        } while (opcion != 3);
    }

    
    public static void ingresar_datos_jugador() throws IOException {
        String nombre, apellido, username, rol;
        out.println("Ingrese el nombre del jugador");
        nombre = in.readLine();
        out.println("Ingrese el apellido del jugador");
        apellido = in.readLine();
        out.println("Ingrese el username (nombre de usuario) del jugador");
        username = in.readLine();
        out.println("Ingrese el rol del jugador");
        rol = in.readLine();

        nuevoJugador.registar_jugador(nombre, apellido, username, rol);

    }

    
    public static void procesarOpcion(int pOpcion) throws IOException {
        switch (pOpcion) {
            case 1:
                ingresar_datos_jugador();
                break;
            case 2:
              

                break;
            case 3:
                break;
            case 4:
                break;
            default:
                out.println("Opción inválida");
        }
    }

    

}

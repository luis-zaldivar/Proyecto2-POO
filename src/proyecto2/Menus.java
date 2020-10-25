package proyecto2;

import java.io.IOException;
import java.util.*;

public class Menus {

    Acciones accionx = new Acciones();
    Scanner scan = new Scanner(System.in);
    int opcion;
    boolean salir = false;
    boolean salir1 = false;
    boolean salir2 = false;

    public void MenuPrincipal() throws IOException {

        while (!salir) {
            System.out.println("\n\t::::B A S E   D E   D A T O S"
                    + "    D E L    R E G I S T R O   D E   U N A    E S C U E L A::::"
                    + "\n1.- DAR DE ALTA A UN NUEVO INTEGRANTE"
                    + "\n2.- CONSULTAR EL NUMERO DE INTEGRANTES DE CADA TIPO"
                    + "\n3.- CONSULTAR LOS DATOS DE UN INTEGRANTE EN ESPECIFICO POR SU INDICE"
                    + "\n4.- ELIMINAR UN INTEGRANTE MEDIANTE EL INDICE"
                    + "\n5.- ELIMINAR LA COLECCION COMPLETA DE DETERMINADO TIPO DE INTEGRANTE"
                    + "\n6.- SALIR DEL PROGRAMA "
                    + "\nElija una opcion:");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    SubMenu1();
                    break;
                case 2:
                    accionx.tamaños();
                    break;
                case 3:

                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    salir = true;
                    System.out.println("GRACIAS POR UTILIZAR EL PROGRAMA, ¡VUELVA PRONTO!");
                    break;
                default:
                    System.out.println("Opcion Invalida");
            }
        }
    }

    public void SubMenu1() throws IOException {
        while (!salir1) {
            System.out.println("\n1.- Docente" + "\n2.- Alumno"
                    + "\n3.- Personal Administrativo " + "\n4.- Regresar al menu"
                    + "\nSeleccione");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    SubMenu2();
                    return;
                case 2:
                    accionx.AgregarAlumno();
                    return;
                case 3:
                    SubMenu3();
                    return;
                case 4:

                    return;
            }
        }

    }

    public void SubMenu2() throws IOException {

        while (!salir2) {
            System.out.println("\n1. Tiempo completo" + "\n2.- De Asignatura"
                    + "\n3. Regresar al menu anterior" + "\nSeleccione");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    accionx.AgrgarDocente();
                    return;
                case 2:
                    accionx.AgregarDocenteAsignatura();
                    return;
                case 3:
                    return;
            }
        }

    }

    public void SubMenu3() throws IOException {
        while (!salir2) {
            System.out.println("\n1.Sindicalizado" + "\n2.-Confianza"
                    + "3.-Directivos" + "\n4. Regresar al menu anterior" + "\nSeleccione");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    accionx.AgregarSindicato();
                    return;
                case 2:
                    accionx.AgregarConfianza();
                    return;
                case 3:
                    accionx.AgrearDirectivos();
                    return;
                case 4:
                    return;
            }
        }

    }
}

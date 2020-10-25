package proyecto2;

import java.io.*; //Incluye Buffered
import java.util.*;

public class Acciones {

    Scanner scan = new Scanner(System.in);
    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<TiempoCompleto> listaTiempoCompleto = new ArrayList<>();
    ArrayList<DeAsignatura> listaAsignatura = new ArrayList<>();
    ArrayList<Alumno> Alumnos = new ArrayList<>();
    ArrayList<Sindicalizado> Sindicatos = new ArrayList<>();
    ArrayList<DeConfianza> confi = new ArrayList<>();
    ArrayList<Directivos> directivos = new ArrayList<>();
    int opcion;
    boolean salir = false;

    public void AgrgarDocente() throws IOException {
        System.out.print("Docente de tiempo completo ");
        System.out.print("Ingresar nombre completo: ");
        String nombre = entrada.readLine();
        System.out.print("Ingresa domicilio: ");
        String domicilio = entrada.readLine();
        System.out.print("Ingresa telefono: ");
        int tel = scan.nextInt();
        System.out.print("Ingresa los años de experiencia: ");
        int años = scan.nextInt();
        System.out.print("Ingresa la especialidad: ");
        String esp = entrada.readLine();
        //prof1.setEspecialidad(esp);
        System.out.print("Ingresa las horas de trabajo: ");
        int horas = scan.nextInt();
        System.out.print("Ingresa el grado de preparacion: ");
        String grado = entrada.readLine();
        TiempoCompleto datos = new TiempoCompleto(horas, grado, años, esp, nombre, domicilio, tel);
        listaTiempoCompleto.add(datos);
        System.out.print("El registro fue exitoso");
    }

    public void AgregarDocenteAsignatura() throws IOException {
        System.out.print("Docente de Asignatura \n");
        System.out.print("Ingresar nombre completo: ");
        String nombre = entrada.readLine();
        System.out.print("Ingresa domicilio: ");
        String domicilio = entrada.readLine();
        System.out.print("Ingresa telefono: ");
        int tel = scan.nextInt();
        System.out.print("Ingresa los años de experiencia: ");
        int añosExperiencia = scan.nextInt();
        System.out.print("Ingresa la especialidad: ");
        String Especialidad = entrada.readLine();
        System.out.print("Ingresa el numero de materias: ");
        int numMaterias = scan.nextInt();
        System.out.print("Ingresa el turno: ");
        String turno = entrada.readLine();
        DeAsignatura data = new DeAsignatura(turno, numMaterias, añosExperiencia, Especialidad, nombre, domicilio, tel);
        listaAsignatura.add(data);
        System.out.print("El registro fue exitoso");
    }

    public void AgregarAlumno() throws IOException {
        System.out.print("Alta alumnos\n");
        System.out.print("Inserte el nuero de cuenta: ");
        int numero = scan.nextInt();
        System.out.print("Inserte la licenciatura: ");
        String lic = entrada.readLine();
        System.out.print("ingrese el nombre: ");
        String nom = entrada.readLine();
        System.out.print("Ingrese el domicilio: ");
        String domi = entrada.readLine();
        System.out.print("Inserte un numero de telefono: ");
        int num = scan.nextInt();
        Alumno alu = new Alumno(numero, lic, nom, domi, num);
        Alumnos.add(alu);
        System.out.print("El registro fue exitoso");
    }

    public void AgregarSindicato() throws IOException {
        System.out.println("Personal del sindicato");
        System.out.print("Inserte el sindicato afiliado: ");
        String sin = entrada.readLine();
        System.out.print("Inserte el sueldo: ");
        float sueldo = scan.nextFloat();
        System.out.print("Inserte los años de antiguedad: ");
        int ant = scan.nextInt();
        System.out.print("Inerte el cargo: ");
        String cargo = entrada.readLine();
        System.out.print("Insrte e nombre: ");
        String nombre = entrada.readLine();
        System.out.print("Insrte el domicilio: ");
        String dom = entrada.readLine();
        System.out.print("Inserte el numero de telefono: ");
        int num = scan.nextInt();
        Sindicalizado sindicato = new Sindicalizado(sin, sueldo, ant, cargo, nombre, dom, num);
        Sindicatos.add(sindicato);
        System.out.print("El registro fue exitoso");
    }

    public void AgregarConfianza() throws IOException {
        System.out.println("Personal de confianza");
        System.out.print("tiempo de contrato");
        String cont = entrada.readLine();
        System.out.print("Inserte la edad: ");
        int edad = scan.nextInt();
        System.out.print("Inserte la antiguedad: ");
        int ant = scan.nextInt();
        System.out.print("Inserte el cargo: ");
        String car = entrada.readLine();
        System.out.print("Inserte el nombre: ");
        String nom = entrada.readLine();
        System.out.print("Insrte el domicilio: ");
        String dom = entrada.readLine();
        System.out.print("Inserte un numero telefonico: ");
        int num = scan.nextInt();
        DeConfianza confianza = new DeConfianza(cont, edad, ant, car, nom, dom, num);
        confi.add(confianza);
        System.out.print("El registro fue exitoso");
    }

    public void AgrearDirectivos() throws IOException {
        System.out.println("Directivos");
        System.out.print("Inserte el horario: ");
        String hora = entrada.readLine();
        System.out.print("Inserte su labor principal: ");
        String lav = entrada.readLine();
        System.out.print("Inserte los años de antiguedad: ");
        int ant = scan.nextInt();
        System.out.print("Inserte el cargo: ");
        String car = entrada.readLine();
        System.out.print("Insertar el nombre: ");
        String nom = entrada.readLine();
        System.out.print("Inserte el domicilio: ");
        String domi = entrada.readLine();
        System.out.print("Inserte el numero telefonico");
        int numtel = scan.nextInt();
        Directivos dire = new Directivos(hora, lav, ant, car, nom, domi, numtel);
        directivos.add(dire);
        System.out.print("El registro fue exitoso");
    }

    public void tamaños() {
        while (!salir) {
            System.out.println("Indique de quien quiere saber el tamaño\n"
                    + "1.-Docentes de tiempo completo\n2.- Docentes de asignatura\n"
                    + "3.-Alumnos\n4.-Administrativos por sindicato\n"
                    + "5.-Administrativos de confianza\n6.-Directivos\n7.-regresar al menu ");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Los PTC son: " + listaTiempoCompleto.size());
                    return;
                case 2:
                    System.out.println("Los docentes por asignatuira son: " + listaAsignatura.size());
                    return;
                case 3:
                    System.out.println("Alumnos dados de alta: " + Alumnos.size());
                    return;
                case 4:
                    System.out.println("el administrativo con sindicao es un total de: " + Sindicatos.size());
                    return;
                case 5:
                    System.out.println("Los administrativos de confianza son: " + confi.size());
                    return;
                case 6:
                    System.out.println("los directivos que existen son: " + directivos.size());
                    return;
                case 7:
                    return;
            }
        }
    }
}

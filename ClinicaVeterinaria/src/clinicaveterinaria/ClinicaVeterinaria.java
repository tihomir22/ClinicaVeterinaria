/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria;

import java.util.Scanner;

/**
 *
 * @author sportak
 */
public class ClinicaVeterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion, recuerdo, id;
        String nom, raza, fecha, hora;
        double precio;

        Clinica clinica1 = null;
        Vacuna vacuna1 = null;
        Perro perro1 = null;
        ListaVacunas lista1 = new ListaVacunas();
        do {
            mostrarMenu();
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    clinica1 = new Clinica();
                    System.out.println("Introduzca nombre de la clinica");
                    teclado.nextLine();
                    nom = teclado.nextLine();
                    clinica1.setNombre(nom);
                    clinica1.mostrarClinica();

                    break;
                case 2:
                    vacuna1 = new Vacuna();
                    System.out.println("Introduzca id de la vacuna");
                    id = teclado.nextInt();
                    vacuna1.setId(id);
                    System.out.println("Introduzca nombre de la vacuna");
                    teclado.nextLine();
                    nom = teclado.nextLine();
                    vacuna1.setNombreV(nom);
                    System.out.println("Introduzca precio de la vacuna");
                    precio = teclado.nextDouble();
                    vacuna1.setPrecio(precio);
                    lista1.añadirVacuna(vacuna1);
                    lista1.mostrarLista();

                    break;
                case 3:
                    perro1 = new Perro();
                    do {
                        System.out.println("Introduzca nombre del perro");
                        teclado.nextLine();
                        nom = teclado.nextLine();
                    } while (clinica1.nombreRepetido(nom) == true);
                    perro1.setNombre(nom);
                    System.out.println("Introduzca raza del perro");
                    raza = teclado.nextLine();
                    perro1.setRaza(raza);
                    perro1.setFechaProximaVacunacion(null);
                    clinica1.añadirChucho(perro1);
                    break;
                case 4:
                    System.out.println("Introduce nombre del perro");
                    teclado.nextLine();
                    nom = teclado.nextLine();
                    if (clinica1.buscarPerro(nom) != -1) {
                        clinica1.activo = clinica1.getPerros().get(clinica1.buscarPerro(nom));
                        System.out.println("El perro activo es " + clinica1.activo.getNombre());
                        System.out.println("De que vacuna se quiere vacunar al chucho ? ");
                        lista1.mostrarLista();

                        System.out.println("Introduzca su id para seleccionarla");
                        id = teclado.nextInt();
                        System.out.println("Introduzca fecha y hora, formato DD/MM/AA HH:MM ");
                        teclado.nextLine();
                        fecha = teclado.nextLine();

                        clinica1.activo.vacunasPerro.add(lista1.getVacunas().get(lista1.buscarVacunaLista(id)));
                        if (clinica1.activo.vacunasPerro.size() > 0) {
                            System.out.println("Se administró exitosamente");
                            System.out.println(" VACUNA ADIMINISTRADA : " + clinica1.activo.getVacunasPerro().get(0).getNombreV());
                            clinica1.activo.setFechaProximaVacunacion(fecha);
                        }
                        break;

                    } else {
                        System.out.println("Se debe dar de alta al perro primero");
                    }
                    break;

                case 5:
                    System.out.println("El perro activo tiene las siguientes vacunas");
                    clinica1.activo.mostrarVacunasPerro();
                    break;
                case 6:
                    System.out.println("Introduzca nombre del perro");
                    teclado.nextLine();
                    nom = teclado.nextLine();
                    if (clinica1.buscarPerro(nom) != -1) {
                        System.out.println("El perro existe y sus vacunas son");
                        clinica1.getPerros().get(clinica1.buscarPerro(nom)).mostrarVacunasPerro();
                        System.out.println("Su ultima vacunacion fue : ");
                        System.out.println(clinica1.getPerros().get(clinica1.buscarPerro(nom)).getFechaProximaVacunacion());

                    } else {
                        System.out.println("No existe el chuchaso");
                    }
                    break;
            }

        } while (opcion != 0);
    }

    public static void mostrarMenu() {
        System.out.println("1.-Alta de la clinica veterinaria");
        System.out.println("2.-Alta de las vacunas");
        System.out.println("3.-Alta de perro");
        System.out.println("4.-Admninistrar vacuna al perro");
        System.out.println("5.-Listar las vacunas de un perro");

    }

}

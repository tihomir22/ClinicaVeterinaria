/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria;

import java.util.ArrayList;

/**
 *
 * @author sportak
 */
public class Clinica {

    private String nombre;
    private ArrayList<Perro> Perros = new ArrayList<Perro>();
    public Perro activo;

    public Perro getActivo() {
        return activo;
    }

    public void setActivo(Perro activo) {
        this.activo = activo;
    }

    public Clinica(String nombre, Perro activo) {
        this.nombre = nombre;
        this.activo = activo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Perro> getPerros() {
        return Perros;
    }

    public void setPerros(ArrayList<Perro> Perros) {
        this.Perros = Perros;
    }

    public Clinica(String nombre) {
        this.nombre = nombre;
    }

    Clinica() {

    }

    public void mostrarClinica() {
        System.out.println("Nombre | " + " Perros en clinica ");
        System.out.println(this.nombre + " | " + this.Perros.size());
        System.out.println("*****************************");
    }

    public boolean nombreRepetido(String nombre) {
        for (int i = 0; i < this.Perros.size(); i++) {
            if (this.Perros.get(i).getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("El nombre del perro se repite, ya esta en la clinica");
                return true;
            }
        }
        return false;
    }

    public void añadirChucho(Perro p) {
        this.Perros.add(p);
    }

    public int buscarPerro(String nombre) {
        for (int i = 0; i < this.Perros.size(); i++) {
            if (this.Perros.get(i).getNombre().equalsIgnoreCase(nombre)) {
                return i;
            }
        }
        return -1;
    }
}

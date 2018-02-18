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
public class Perro {

    private String nombre;
    private String raza;
    private String fechaProximaVacunacion;
    ArrayList<Vacuna> vacunasPerro = new ArrayList<Vacuna>();

    public Perro(String nombre, String raza, String fechaProximaVacunacion) {
        this.nombre = nombre;
        this.raza = raza;
        this.fechaProximaVacunacion = null;
    }

    Perro() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public ArrayList<Vacuna> getVacunasPerro() {
        return vacunasPerro;
    }

    public void setVacunasPerro(ArrayList<Vacuna> vacunasPerro) {
        this.vacunasPerro = vacunasPerro;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getFechaProximaVacunacion() {
        return fechaProximaVacunacion;
    }

    public void setFechaProximaVacunacion(String fechaProximaVacunacion) {
        this.fechaProximaVacunacion = fechaProximaVacunacion;
    }

    public void mostrarVacunasPerro() {
        for (int i = 0; i < this.vacunasPerro.size(); i++) {
            System.out.println("ID " + this.vacunasPerro.get(i).getId());
            System.out.println("NombreVacuna " + this.vacunasPerro.get(i).getNombreV());
            System.out.println("PRECIO " + this.vacunasPerro.get(i).getPrecio());
            System.out.println("RECUERDO " + this.vacunasPerro.get(i).getRecuerdo());

        }

    }

    

}

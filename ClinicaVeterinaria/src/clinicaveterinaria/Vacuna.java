/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria;



/**
 *
 * @author sportak
 */
public class Vacuna {

    private int id;
    private int recuerdo;
    private String nombreV;
    private double precio;
    

    public Vacuna(int id, int recuerdo, String nombreV, double precio) {
        this.id = id;
        this.recuerdo = 0;
        this.nombreV = nombreV;
        this.precio = precio;
    }

    

    Vacuna() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRecuerdo() {
        return recuerdo;
    }

    public void setRecuerdo(int recuerdo) {
        this.recuerdo = recuerdo;
    }

    public String getNombreV() {
        return nombreV;
    }

    public void setNombreV(String nombreV) {
        this.nombreV = nombreV;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    

    public void mostrarVacuna() {
        System.out.println("**************************************");
        System.out.println("ID : " + this.id);
        System.out.println("RECUERDO : " + this.recuerdo);
        System.out.println("PRECIO : " + this.precio+" €");
        System.out.println("Nombre : " + this.nombreV);
        System.out.println("**************************************");

    }

    
}

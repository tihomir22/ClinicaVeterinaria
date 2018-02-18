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
public class ListaVacunas {

    private ArrayList<Vacuna> vacunas = new ArrayList();

    public ListaVacunas() {
    }

    public ArrayList<Vacuna> getVacunas() {
        return vacunas;
    }

    public void setVacunas(ArrayList<Vacuna> vacunas) {
        this.vacunas = vacunas;
    }

    public void añadirVacuna(Vacuna v) {
        this.vacunas.add(v);
        this.vacunas.get(this.vacunas.size() - 1).setRecuerdo(this.vacunas.size());
    }

    public void mostrarLista() {
        for (int i = 0; i < this.vacunas.size(); i++) {
            this.vacunas.get(i).mostrarVacuna();

        }

    }

    public int buscarVacunaLista(int id) {
        for (int i = 0; i < this.vacunas.size(); i++) {
            if (this.vacunas.get(i).getId() == id) {
                return i;
            }

        }
        return -1;

    }
}

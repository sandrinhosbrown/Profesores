/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profes;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Sandro Gamarra
 */
public class ListaProfesores implements Serializable{
    
    private ArrayList<Profesor> lista;

    public ListaProfesores() {
        lista = new ArrayList<>();
    }
    
    public void altaProfesor(Profesor p){
        lista.add(p);
    }
    
    public boolean existe (Profesor p){
        return lista.contains(p); 
    }
    
    public ArrayList<Profesor> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Profesor> lista) {
        this.lista = lista;
    }

}

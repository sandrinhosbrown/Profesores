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
    
    public void bajaProfesor(Profesor p){
        lista.remove(p);
    }
    
    public boolean existe (Profesor p){
        return lista.contains(p); 
    }
    
    //metodo que devuelve la lista de especialidades 
    public ArrayList<String> especialidades (){
        ArrayList<String> esp = new ArrayList<>();
        
        for (Profesor p : lista){
            if (!esp.contains(p.getEspecialidad())){
                esp.add(p.getEspecialidad());
            }
        }
        
        return esp;
    }
       
    
    //metodo que devuelve los profesores de una especialidad determinada
    public ListaProfesores profesoresPorEspecialidad(String especialidad){
        ListaProfesores profesEsp = new ListaProfesores();
        for (Profesor p : lista){
            if (especialidad.equalsIgnoreCase(p.getEspecialidad())){
                profesEsp.altaProfesor(p);
            }
        }
        return profesEsp;
    }
    
    public ArrayList<Profesor> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Profesor> lista) {
        this.lista = lista;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profes;

import java.io.Serializable;

/**
 *
 * @author Sandro Gamarra
 */
public class Profesor implements Serializable{
    
    private String nif;
    private String nombre;
    private String apellidos;
    private String especialidad;
    private boolean master;
    private boolean autonomo;
    private int edad;       //no se guarda la edad, sino fecha nacimiento

    public Profesor() { //constructor vacio para que no esten nulos/falses
        nif = "";
        nombre="";
        apellidos="";
        especialidad="";
        edad=18;
    }

    public Profesor(String nif, String nombre, String apellidos, String especialidad, boolean master, boolean autonomo, int edad) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.especialidad = especialidad;
        this.master = master;
        this.autonomo = autonomo;
        this.edad = edad;
    }
    
    
    
    

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    public boolean isAutonomo() {
        return autonomo;
    }

    public void setAutonomo(boolean autonomo) {
        this.autonomo = autonomo;
    }


    public boolean isMaster() {
        return master;
    }

    public void setMaster(boolean master) {
        this.master = master;
    }


    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }


    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getnif() {
        return nif;
    }

    public void setnif(String NIF) {
        this.nif = nif;
    }

}

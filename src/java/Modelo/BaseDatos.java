/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author LabingXEON
 */
public class BaseDatos {
    private ArrayList<Persona> personas;

    public BaseDatos(ArrayList<Persona> personas) {
        this.personas = personas;
        this.personas.add(new Persona("Marco", "Castellanos"));
        this.personas.add(new Persona("Marco", "Castellanos1"));  
    }
    public boolean insertar(Persona pe){
        return this.personas.add(pe);
    }
    public ArrayList<Persona> listar(){
        return this.personas;
    }
}

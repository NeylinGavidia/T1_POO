/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.util.ArrayList;

/**
 *
 * @author UCC20417
 */
public class Controladorpaciente {
    
    private ArrayList <Paciente> lista = new ArrayList<>();
    
    public void agregarpaciente(Paciente p){
     lista.add(p);
    }
    public void mostrarpaciente (){
      if (lista.size() == 0) //primeo vacio para llenase qwq 
      {
        System.out.println("No hay pacientes registrados.");
        } 
      else {
        for (int i = 0; i < lista.size(); i++) 
        {
            System.out.println(lista.get(i));
            System.out.println("******************************");
        }
      }
    }
}

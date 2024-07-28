package controlador;

import modelo.Curso;
import modelo.Formulario;
import modelo.Proponente;

//esta clase se encarga de de llenar el formulario para luego pasar 


public class LLenar_Formulario {

     public static void Guardad_Curso(Curso C1, Formulario F1, Proponente P1)    //los elementos del de los cuadros de texto
    {
        C1.setFormulario(F1);
        P1.agregarCurso(C1);
        
    }

    
    
}

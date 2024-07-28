package controlador;

import modelo.Curso;
import modelo.Formulario;
import modelo.Proponente;
import modelo.Usuario;


//Clase encargada del control de los proponente

public class Proponente_Control {
    private static Proponente_Control PC;
    Proponente P1;

    private Proponente_Control()
    {}

    public static Proponente_Control getinstancia()
    {
        if (PC==null) {
            PC=new Proponente_Control();
        }
        return PC;
    }
    
    

    /*public void Nuevo_Curso()
    {

    }

    public void Proponer_Curso(Formulario F1){
        
        LLenar_Formulario.Guardad_Curso(C1, F1, P1);
    }
*/

}

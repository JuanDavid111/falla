package modelo;

import java.lang.reflect.Array;
import java.util.ArrayList;

//clase que representa al proponente y su informacion para su uso
//

public class Proponente extends Usuario
{
    
    private String CI;
    private String RIF;
    private String ISLR;
    private String CV;
    private String Título_Universitario;
    private String Registro_Mercantil;    //revisar
    private ArrayList<Curso> Cursos = new ArrayList<Curso>();


    public Proponente(String User,String Password,String CI,String RIF,String ISLR,String CV,String Título_Universitario,String Registro_Mercantil)
    {
        super(User, Password);

        this.CI=CI;
        this.RIF=RIF;
        this.ISLR=ISLR;
        this.CV=CV;
        this.Título_Universitario=Título_Universitario;
        this.Registro_Mercantil=Registro_Mercantil;

    }

    public void agregarCurso(Curso c)
    {
        Cursos.add(c);
        
    }

    @Override
    public void mostrar() {
        
        System.out.println(CI+" "+RIF+" "+ISLR);
    }


}

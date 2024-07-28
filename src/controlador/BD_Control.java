package controlador;
import java.lang.reflect.Array;
import java.util.ArrayList;

import modelo.Usuario;
import modelo.Administrador;
import modelo.Dato;
import modelo.Proponente;

import java.io.Serializable;


//Esta clase se va a encargar de Controlar de las operaciones que están relacionadas con la gestión básica de la “base de dato” 
//en la lógica 

public class BD_Control implements Serializable {  
    
    private static BD_Control instancia;
    private static BD_Control prueba;

    private Dato D;
    //private ArrayList<administradore> Usuarios= new ArrayList<Object>();

    private static String Ruta = "Datos.txt";
                                                                    
    private BD_Control()
    {
        D=new Dato();
        
    }
    public static BD_Control getinstancia()
    {
        if (instancia==null) {
            instancia=new BD_Control();
        }
        return instancia;
    }

    public void agregarP(Proponente P)
    {
        D.agregarP(P);
    }
    public void agregarA(Administrador A)
    {
        D.agregarA(A);
    }
    

    public void mostrarP()
    {
        D.mostrar();
        
    }
    

    public ArrayList<Proponente> sacarP()
    {
        return D.getProponentes();

    }
/* 
     public void guardarTxt()
    {
        


        Control_Archivo.serializarObjeto(Ruta, instancia);
    }

    public BD_Control cargarTxt()
    {
        prueba=Control_Archivo.deserializarObjeto(Ruta, BD_Control.class);  //esta funcion se encarga de sacar los datos del archivo y guardaros en la lista en la logica
        if (prueba==null) 
        {
            System.out.println("vasio crear nueva carpeta");
            return instancia;
        }
        else
        {
            instancia=prueba;
            prueba=null;
            return instancia;
        }
    }

*/
}

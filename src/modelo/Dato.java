package modelo;

import java.util.ArrayList;

public class Dato {
    private ArrayList<Proponente> Proponentes= new ArrayList<Proponente>();
    private ArrayList<Administrador> Administradores= new ArrayList<Administrador>();


    public void agregarP(Proponente P)
    {
        Proponentes.add(P);
    }
    public void agregarA(Administrador A)
    {
        Administradores.add(A);
    }

    public void mostrar()
    {
        for(Proponente p : Proponentes)
        {
            p.mostrar();
        }
        
    }

    public ArrayList<Proponente> getProponentes() {
        return Proponentes;
    }



    
    
}

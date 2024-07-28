package modelo;
import java.io.Serializable;


public class Curso implements Serializable{
    private boolean estado=false;
    private Formulario formulario;


    public void setFormulario(Formulario formulario) {
        this.formulario = formulario;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


}



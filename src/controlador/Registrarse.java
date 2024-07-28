package controlador;

import modelo.Usuario;

//esta clase se encarga de registrar a los Usuarios en la Base de Datos que esta en la logica   

public class Registrarse {

    public static void Registrar_Proponente(Usuario User)  //El metodo se encarga envial el Usuario 
    {
        BD_Control C=BD_Control.getinstancia(); // llama a la instancia Control Usuario 
        C.agregar(User);                                  // llama al metodo de agregar para Guardar en la BD de la logica
    }

}

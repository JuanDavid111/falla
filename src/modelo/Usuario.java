package modelo;


import java.io.Serializable;
public abstract class Usuario implements Serializable {
    private String User;
    private String Password;

    public Usuario()
    {

    }

    public Usuario(String User, String Password)
    {
        this.User=User;
        this.Password=Password;

    }

    public abstract void mostrar();

    public void getUser() {
        System.out.println(User);
    }

    public String getPassword() {
        return Password;
    }


}

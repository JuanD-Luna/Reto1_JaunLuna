package Principal;

import Vistas.*;
import Modelo.*;

public class Main {

    public static void main(String[] args) {
        Login login = new Login();
        
        // SetVisible deja ver el JFrame ose nuestro (Login)
        login.setVisible(true);
        
        // Vamos a crear una instancia de la clase Conexion
        Conexion conexion = new Conexion();
        conexion.getConnection();
  }
    
}

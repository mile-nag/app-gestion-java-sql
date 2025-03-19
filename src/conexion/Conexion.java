
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = System.getenv("DB_URL");
    private static final String USER = System.getenv("DB_USUARIO");
    private static final String PASS = System.getenv("DB_PASS");
    
    public static Connection conectar(){
        Connection conexion = null;
        
        try {
            conexion = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conexion correcta!");
        } catch (SQLException e) {
            System.out.println("Error de conexion: " + e);
        }
        return conexion;
    }
    
    public static void main(String[] args) {
        Conexion.conectar();
    }
}

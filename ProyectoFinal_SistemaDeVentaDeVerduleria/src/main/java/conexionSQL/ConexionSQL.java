package conexionSQL;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jrg71
 */
public class ConexionSQL {
    private static ConexionSQL conexion;
    private static final String DBURL="jdbc:mysql://localhost:3306/usuarios?serverTimezone=UTC";
    
    private static Connection conn=null;
    
    private ConexionSQL(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            conn = DriverManager.getConnection(DBURL,"proyecto_db","Prueba123_");
                    
        }catch(ClassNotFoundException | SQLException | NoSuchMethodException | SecurityException | InstantiationException 
                | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex){
            Logger.getLogger(ConexionSQL.class.getName()).log(Level.SEVERE,null, ex);
        }
    }
    
    public static synchronized Connection getConexioSQL(){
        if (conexion==null){
            conexion = new ConexionSQL();
        }
        return conn;
    }
}

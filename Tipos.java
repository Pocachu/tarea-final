package sistemahojacostos;
import java.sql.ResultSet;
public class Tipos {
    
    //instanciar un objeto
    Conexion cn = new Conexion();

    public ResultSet llenarTipos() {
        return (cn.getValores("SELECT * FROM tipos"));
    }
    
}

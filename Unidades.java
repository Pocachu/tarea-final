package sistemahojacostos;
import java.sql.ResultSet; //Contiene los datos resultado de una sentencia SQL

public class Unidades {

    //instanciar un objeto
    Conexion cn = new Conexion();

    public void insertar(String codigoUnidad, String unidad) {
        cn.UID("INSERT INTO unidades(unidad,descripcion) VALUES('" + codigoUnidad + "','" + unidad + "')");
    }

    public void modificar(String codigoUnidad, String unidad) {
        //cn.UID("UPDATE unidades SET unidad='" + unidad + "'");
        cn.UID("UPDATE unidades SET unidad='" + unidad + "' WHERE codigoUnidad='" + codigoUnidad + "'");
    }

    public void eliminar(String codigoUnidad) {
        cn.UID("DELETE FROM unidades WHERE codigoUnidad='" + codigoUnidad + "' ");
    }

    public ResultSet buscar(String codigoUnidad) {
        return (cn.getValores("SELECT * FROM unidades WHERE codigoUnidad='" + codigoUnidad + "'"));
    }

    
    
    public ResultSet contarRegistros() {
        return (cn.getValores("SELECT COUNT(codigoUnidad) FROM unidades"));
    }

    public ResultSet mayorRegistro() {
        return (cn.getValores("SELECT MAX(codigoCliente) FROM clientes"));
    }

    public ResultSet llenarTabla() {
        return (cn.getValores("SELECT codigoUnidad,unidad FROM unidades"));
    }
    
    public ResultSet llenarUnidades() {
        return (cn.getValores("SELECT * FROM unidades"));
    }
   
}

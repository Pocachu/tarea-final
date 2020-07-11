package sistemahojacostos;
import java.sql.ResultSet;
public class Hojas {
    //instanciar un objeto
    Conexion cn = new Conexion();

    public void insertar(int codigoHoja, String descripcion, String unidad) {
        cn.UID("INSERT INTO hojas(codigoHoja,descripcion,unidad) VALUES('" + codigoHoja + "','" + descripcion + "','" + unidad + "')");
    }

    public void modificar(String unidad, String descripcion) {
        //cn.UID("UPDATE unidades SET unidad='" + unidad + "'");
        cn.UID("UPDATE unidades SET descripcion='" + descripcion + "' WHERE unidad='" + unidad + "'");
    }

    public ResultSet contarRegistros() {
        return (cn.getValores("SELECT COUNT(codigoHoja) FROM hojas"));
    }

    public ResultSet mayorRegistro() {
        return (cn.getValores("SELECT MAX(codigoHoja) FROM hojas"));
    }

    public ResultSet llenarTabla() {
        return (cn.getValores("SELECT codigoUnidad,unidad FROM unidades"));
    }
    
    public ResultSet llenarUnidades() {
        return (cn.getValores("SELECT * FROM unidades"));
    }

    public void modificar(int codigoHoja, String descripcion, String codigoUnidad) {
        //cn.UID("UPDATE unidades SET unidad='" + unidad + "'");
        cn.UID("UPDATE hojas SET codigoUnidad='" + codigoUnidad + "', descripcion='" + descripcion + "'  WHERE codigoHoja='" + codigoHoja + "'");
    }
public ResultSet Consulta(String codigoHoja) {
        return (cn.getValores("SELECT * FROM hojas WHERE codigoHoja='" + codigoHoja + "'"));
    }

    public void eliminar(String codigoHoja) {
        cn.UID("DELETE FROM hojas WHERE codigoHoja='" + codigoHoja + "' ");
    }


}

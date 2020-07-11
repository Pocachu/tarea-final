/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemahojacostos;

import java.sql.ResultSet;

/**
 *
 * @author Cerrato Jordan
 */
public class Categoria {
    
     Conexion cn = new Conexion();
     
     public ResultSet llenarUnidades() {
        return (cn.getValores("SELECT * FROM categorias"));
    }
}

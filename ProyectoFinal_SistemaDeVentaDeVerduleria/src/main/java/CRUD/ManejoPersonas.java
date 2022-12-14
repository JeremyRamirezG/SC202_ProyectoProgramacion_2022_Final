package CRUD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import javax.swing.JOptionPane;

import sc202.proyectofinal_sistemadeventadeverduleria.Administrador;
import sc202.proyectofinal_sistemadeventadeverduleria.Vendedor;
import sc202.proyectofinal_sistemadeventadeverduleria.Empleado;
import sc202.proyectofinal_sistemadeventadeverduleria.Cliente;
import conexionSQL.ConexionSQL;

/**
 *
 * @author jrg71
 */
public class ManejoPersonas {
    //Atributos de la clase
    private String SQL_INSERT_USUARIO;
    private String seleccionTablas;
    private String idPersonaManejoArchivos;
    private String columnas;
    private String columnasSimbolo;
    private String contraseñaSesion;
    private String nombreTabla;
    
    //Constructores de la clase
    
    public ManejoPersonas(String SQL_INSERT_USUARIO, String seleccionTablas, String idPersonaManejoArchivos, String columnas, String columnasSimbolo, String contraseñaSesion, String nombreTabla) {
        this.SQL_INSERT_USUARIO = SQL_INSERT_USUARIO;
        this.seleccionTablas = seleccionTablas;
        this.idPersonaManejoArchivos = idPersonaManejoArchivos;
        this.columnas = columnas;
        this.columnasSimbolo = columnasSimbolo;
        this.contraseñaSesion = contraseñaSesion;
        this.nombreTabla = nombreTabla;
    }
    public ManejoPersonas() {
        this.SQL_INSERT_USUARIO = "";
        this.seleccionTablas = "";
        this.idPersonaManejoArchivos = "";
        this.columnas = "";
        this.columnasSimbolo = "";
        this.contraseñaSesion = "";
        this.nombreTabla = "";
    }
    
    
    //SETs & GETs

    public String getSQL_INSERT_USUARIO() {
        return SQL_INSERT_USUARIO;
    }

    public void setSQL_INSERT_USUARIO(String SQL_INSERT_USUARIO) {
        this.SQL_INSERT_USUARIO = SQL_INSERT_USUARIO;
    }

    public String getSeleccionTablas() {
        return seleccionTablas;
    }

    public void setSeleccionTablas(String seleccionTablas) {
        this.seleccionTablas = seleccionTablas;
    }

    public String getIdPersonaManejoArchivos() {
        return idPersonaManejoArchivos;
    }

    public void setIdPersonaManejoArchivos(String idPersonaManejoArchivos) {
        this.idPersonaManejoArchivos = idPersonaManejoArchivos;
    }

    public String getColumnas() {
        return columnas;
    }

    public void setColumnas(String columnas) {
        this.columnas = columnas;
    }

    public String getColumnasSimbolo() {
        return columnasSimbolo;
    }

    public void setColumnasSimbolo(String columnasSimbolo) {
        this.columnasSimbolo = columnasSimbolo;
    }

    public String getContraseñaSesion() {
        return contraseñaSesion;
    }

    public void setContraseñaSesion(String contraseñaSesion) {
        this.contraseñaSesion = contraseñaSesion;
    }
    
    public String getNombreTabla() {
        return nombreTabla;
    }

    public void setNombreTabla(String nombreTabla) {
        this.nombreTabla = nombreTabla;
    }
    
    
    
    //CRUD
    
    //Create
    public void agregarAdministrador (Administrador objAdministrador){
        this.columnas = "(idUnicoEmpleados,nombreEmpleados,edadEmpleados,correoEmpleados,cedulaEmpleados,numeroEmpleados,salarioEmpleados,contratadoEmpleados,estadoEmpleados,rolEmpleados,contraseñaEmpleados)";
        this.columnasSimbolo = "(?,?,?,?,?,?,?,?,?,?,?)";
        this.seleccionTablas = "empleados";
        this.SQL_INSERT_USUARIO = "insert into "+this.seleccionTablas+" "+this.columnas+" values "+this.columnasSimbolo;
        
        try{
            PreparedStatement sentencia = ConexionSQL.getConexioSQL().prepareCall(SQL_INSERT_USUARIO);
            
            sentencia.setString(1, objAdministrador.getIdEmpleado());
            sentencia.setString(2, objAdministrador.getNombrePersona());
            sentencia.setInt(3, objAdministrador.getEdadPersona());
            sentencia.setString(4, objAdministrador.getCorreoElectronicoPersona());
            sentencia.setString(5, objAdministrador.getCedulaPersona());
            sentencia.setString(6, objAdministrador.getNumeroTelefonicoPersona());
            sentencia.setDouble(7, objAdministrador.getSalarioBrutoEmpleado());
            sentencia.setInt(8, objAdministrador.getAñosContratadoEmpleado());
            sentencia.setString(9, objAdministrador.getEstadoEmpleado());
            sentencia.setString(10, objAdministrador.getRolAdministrador());
            sentencia.setString(11, this.contraseñaSesion);
            
            if (sentencia.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Usuario agregado!"); 
            }else {
                JOptionPane.showMessageDialog(null, "No se puedo agregar el usuario, intente de nuevo."); 
            }
        }catch(SQLException ex){
            Logger.getLogger(ManejoPersonas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void agregarVendedor (Vendedor objVendedor){
        this.columnas = "(idUnicoEmpleados,nombreEmpleados,edadEmpleados,correoEmpleados,cedulaEmpleados,numeroEmpleados,salarioEmpleados,contratadoEmpleados,estadoEmpleados,rolEmpleados,contraseñaEmpleados)";
        this.columnasSimbolo = "(?,?,?,?,?,?,?,?,?,?,?)";
        this.seleccionTablas = "empleados";
        this.SQL_INSERT_USUARIO = "insert into "+this.seleccionTablas+" "+this.columnas+" values "+this.columnasSimbolo;
        
        try{
            PreparedStatement sentencia = ConexionSQL.getConexioSQL().prepareCall(SQL_INSERT_USUARIO);
            
            sentencia.setString(1, objVendedor.getIdEmpleado());
            sentencia.setString(2, objVendedor.getNombrePersona());
            sentencia.setInt(3, objVendedor.getEdadPersona());
            sentencia.setString(4, objVendedor.getCorreoElectronicoPersona());
            sentencia.setString(5, objVendedor.getCedulaPersona());
            sentencia.setString(6, objVendedor.getNumeroTelefonicoPersona());
            sentencia.setDouble(7, objVendedor.getSalarioBrutoEmpleado());
            sentencia.setInt(8, objVendedor.getAñosContratadoEmpleado());
            sentencia.setString(9, objVendedor.getEstadoEmpleado());
            sentencia.setString(10, objVendedor.getRolVendedor());
            sentencia.setString(11, this.contraseñaSesion);
            
            if (sentencia.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Usuario agregado!"); 
            }else {
                JOptionPane.showMessageDialog(null, "No se puedo agregar el usuario, intente de nuevo."); 
            }
        }catch(SQLException ex){
            Logger.getLogger(ManejoPersonas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void agregarCliente (Cliente objCliente){
        this.columnas = "(idUnicoClientes,nombreClientes,edadClientes,correoClientes,cedulaClientes,numeroClientes,direccionClientes,metodoPagoClientes,contraseñaClientes)";
        this.columnasSimbolo = "(?,?,?,?,?,?,?,?,?)";
        this.seleccionTablas = "clientes";
        this.SQL_INSERT_USUARIO = "insert into "+this.seleccionTablas+" "+this.columnas+" values "+this.columnasSimbolo;
        
        try{
            PreparedStatement sentencia = ConexionSQL.getConexioSQL().prepareCall(SQL_INSERT_USUARIO);
            
            sentencia.setString(1, objCliente.getIdCliente());
            sentencia.setString(2, objCliente.getNombrePersona());
            sentencia.setInt(3, objCliente.getEdadPersona());
            sentencia.setString(4, objCliente.getCorreoElectronicoPersona());
            sentencia.setString(5, objCliente.getCedulaPersona());
            sentencia.setString(6, objCliente.getNumeroTelefonicoPersona());
            sentencia.setString(7, objCliente.getDireccionCliente());
            sentencia.setString(8, objCliente.getMetodoPagoCliente());
            sentencia.setString(9, this.contraseñaSesion);
            
            if (sentencia.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Usuario agregado!"); 
            }else {
                JOptionPane.showMessageDialog(null, "No se puedo agregar el usuario, intente de nuevo."); 
            }
        }catch(SQLException ex){
            Logger.getLogger(ManejoPersonas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Read
    public ArrayList listarEmpleados(){
        this.seleccionTablas = "empleados";
        String SQL_LIST_USUARIO = "select * from "+this.seleccionTablas;
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
        
        try{
            Statement sentencia = ConexionSQL.getConexioSQL().createStatement();
            ResultSet resultado = sentencia.executeQuery(SQL_LIST_USUARIO);
            
            while(resultado.next()){
                Empleado objEmpleado = new Empleado();
                
                objEmpleado.setNombrePersona(resultado.getString("nombreEmpleados"));
                objEmpleado.setIdEmpleado(resultado.getString("idUnicoEmpleados"));
                objEmpleado.setEdadPersona(Integer.parseInt(resultado.getString("edadEmpleados")));
                objEmpleado.setCorreoElectronicoPersona(resultado.getString("correoEmpleados"));
                objEmpleado.setCedulaPersona(resultado.getString("cedulaEmpleados"));
                objEmpleado.setNumeroTelefonicoPersona(resultado.getString("numeroEmpleados"));
                objEmpleado.setSalarioBrutoEmpleado(Double.parseDouble(resultado.getString("salarioEmpleados")));
                objEmpleado.setAñosContratadoEmpleado(Integer.parseInt(resultado.getString("contratadoEmpleados")));
                objEmpleado.setEstadoEmpleado(resultado.getString("estadoEmpleados"));
                
                listaEmpleados.add(objEmpleado);
            }
            
            return listaEmpleados;
        }catch(Exception ex){
            Logger.getLogger(ManejoPersonas.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    public ArrayList listarClientes(){
        this.seleccionTablas = "clientes";
        String SQL_LIST_USUARIO = "select * from "+this.seleccionTablas;
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
        
        try{
            Statement sentencia = ConexionSQL.getConexioSQL().createStatement();
            ResultSet resultado = sentencia.executeQuery(SQL_LIST_USUARIO);
            
            while(resultado.next()){
                Cliente objCliente = new Cliente();
                
                objCliente.setNombrePersona(resultado.getString("nombreClientes"));
                objCliente.setIdCliente(resultado.getString("idUnicoClientes"));
                objCliente.setEdadPersona(Integer.parseInt(resultado.getString("edadClientes")));
                objCliente.setCorreoElectronicoPersona(resultado.getString("correoClientes"));
                objCliente.setCedulaPersona(resultado.getString("cedulaClientes"));
                objCliente.setNumeroTelefonicoPersona(resultado.getString("numeroClientes"));
                objCliente.setDireccionCliente(resultado.getString("direccionClientes"));
                objCliente.setMetodoPagoCliente(resultado.getString("metodoPagoClientes"));
                
                listaClientes.add(objCliente);
            }
            
            return listaClientes;
        }catch(Exception ex){
            Logger.getLogger(ManejoPersonas.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    
    //Update
    public void actualizarEmpleado (Empleado objEmpleado){
        this.columnas = "nombreEmpleados=?,edadEmpleados=?,correoEmpleados=?,contraseñaEmpleados=?";
        this.seleccionTablas = "empleados";
        String SQL_UPDATE_USUARIO = "update "+this.seleccionTablas+" set "+this.columnas+" where cedulaEmpleados=?";
        
        try{
            PreparedStatement sentencia = ConexionSQL.getConexioSQL().prepareCall(SQL_UPDATE_USUARIO);
            
            sentencia.setString(1, objEmpleado.getNombrePersona());
            sentencia.setInt(2, objEmpleado.getEdadPersona());
            sentencia.setString(3, objEmpleado.getCorreoElectronicoPersona());
            sentencia.setString(4, this.contraseñaSesion);
            sentencia.setString(5, this.idPersonaManejoArchivos);
            
            if (sentencia.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Usuario actualizado!"); 
            }else {
                JOptionPane.showMessageDialog(null, "No se puedo agregar el usuario, intente de nuevo."); 
            }
        }catch(SQLException ex){
            Logger.getLogger(ManejoPersonas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void actualizarCliente (Cliente objCliente){
        this.columnas = "nombreClientes=?,edadClientes=?,correoClientes=?,contraseñaClientes=?";
        this.seleccionTablas = "clientes";
        String SQL_UPDATE_USUARIO = "update "+this.seleccionTablas+" set "+this.columnas+" where cedulaClientes=?";
        
        try{
            PreparedStatement sentencia = ConexionSQL.getConexioSQL().prepareCall(SQL_UPDATE_USUARIO);
            
            sentencia.setString(1, objCliente.getNombrePersona());
            sentencia.setInt(2, objCliente.getEdadPersona());
            sentencia.setString(3, objCliente.getCorreoElectronicoPersona());
            sentencia.setString(4, this.contraseñaSesion);
            sentencia.setString(5, this.idPersonaManejoArchivos);
            
            if (sentencia.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Usuario actualizado!"); 
            }else {
                JOptionPane.showMessageDialog(null, "No se puedo agregar el usuario, intente de nuevo."); 
            }
        }catch(SQLException ex){
            Logger.getLogger(ManejoPersonas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Delete
    public void borrarUsuario() {
        String SQL_DELETE_USUARIO = "delete from "+this.seleccionTablas+" where cedula"+this.nombreTabla+"="+this.idPersonaManejoArchivos;
        
        try{
            Statement sentencia = ConexionSQL.getConexioSQL().createStatement();
            int resultado = sentencia.executeUpdate(SQL_DELETE_USUARIO);
            
            if (resultado>0){
                JOptionPane.showMessageDialog(null, "Usuario eliminado!"); 
            }else {
                JOptionPane.showMessageDialog(null, "No se puedo eliminar el usuario, intente de nuevo"); 
            }
        }catch(Exception ex){
            Logger.getLogger(ManejoPersonas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //LOGIN DE USUARIOS
    //Login
    public int loginEmpleado(Empleado objEmpleado) {
        int validacion=0;
        String correoEmpleado =  objEmpleado.getCorreoElectronicoPersona();
        this.seleccionTablas = "empleados";
        String SQL_LOGIN_USUARIO = "SELECT * FROM "+this.seleccionTablas+" WHERE correoEmpleados = ? and contraseñaEmpleados = ?";
        
        try{
            PreparedStatement sentencia = ConexionSQL.getConexioSQL().prepareStatement(SQL_LOGIN_USUARIO);
            sentencia.setString(1, correoEmpleado);
            sentencia.setString(2, this.contraseñaSesion);
            ResultSet resultado = sentencia.executeQuery();
            
            if (resultado.next()){
                validacion = 1;
            }
            
            return validacion;
        }catch(Exception ex){
            Logger.getLogger(ManejoPersonas.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        
    }
    
    public int loginCliente(Cliente objCliente) {
        int validacion=0;
        String correoCliente =  objCliente.getCorreoElectronicoPersona();
        this.seleccionTablas = "clientes";
        String SQL_LOGIN_USUARIO = "SELECT * FROM "+this.seleccionTablas+" WHERE correoClientes = ? and contraseñaClientes = ?";
        
        try{
            PreparedStatement sentencia = ConexionSQL.getConexioSQL().prepareStatement(SQL_LOGIN_USUARIO);
            sentencia.setString(1, correoCliente);
            sentencia.setString(2, this.contraseñaSesion);
            ResultSet resultado = sentencia.executeQuery();
            
            if (resultado.next()){
                validacion = 1;
            }
            
            return validacion;
        }catch(Exception ex){
            Logger.getLogger(ManejoPersonas.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        
    }
}

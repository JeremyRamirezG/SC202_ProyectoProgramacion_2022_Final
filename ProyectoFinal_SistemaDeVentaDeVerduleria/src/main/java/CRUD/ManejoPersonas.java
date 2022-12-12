package CRUD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import sc202.proyectofinal_sistemadeventadeverduleria.Administrador;
import sc202.proyectofinal_sistemadeventadeverduleria.Vendedor;
import sc202.proyectofinal_sistemadeventadeverduleria.Cliente;
import conexionSQL.ConexionSQL;
import javax.swing.JOptionPane;

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
    private String nuevoNombre;
    private String nuevoCorreo;
    private int nuevaEdad;
    private String nuevaCedula;
    
    //Constructores de la clase
    public ManejoPersonas(String SQL_INSERT_USUARIO, String seleccionTablas, String idPersonaManejoArchivos, String columnas, String columnasSimbolo, String contraseñaSesion, String nuevoNombre, String nuevoCorreo, int nuevaEdad, String nuevaCedula) {
        this.SQL_INSERT_USUARIO = SQL_INSERT_USUARIO;
        this.seleccionTablas = seleccionTablas;
        this.idPersonaManejoArchivos = idPersonaManejoArchivos;
        this.columnas = columnas;
        this.columnasSimbolo = columnasSimbolo;
        this.contraseñaSesion = contraseñaSesion;
        this.nuevoNombre = nuevoNombre;
        this.nuevoCorreo = nuevoCorreo;
        this.nuevaEdad = nuevaEdad;
        this.nuevaCedula = nuevaCedula;
    }
    public ManejoPersonas() {
        this.SQL_INSERT_USUARIO = "insert into "+this.seleccionTablas+" "+this.columnas+" values "+this.columnasSimbolo;;
        this.seleccionTablas = "";
        this.idPersonaManejoArchivos = "";
        this.columnas = "";
        this.columnasSimbolo = "";
        this.contraseñaSesion = "";
        this.nuevoNombre = "";
        this.nuevoCorreo = "";
        this.nuevaEdad = 0;
        this.nuevaCedula = "";
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

    public String getNuevoNombre() {
        return nuevoNombre;
    }

    public void setNuevoNombre(String nuevoNombre) {
        this.nuevoNombre = nuevoNombre;
    }

    public String getNuevoCorreo() {
        return nuevoCorreo;
    }

    public void setNuevoCorreo(String nuevoCorreo) {
        this.nuevoCorreo = nuevoCorreo;
    }

    public int getNuevaEdad() {
        return nuevaEdad;
    }

    public void setNuevaEdad(int nuevaEdad) {
        this.nuevaEdad = nuevaEdad;
    }

    public String getNuevaCedula() {
        return nuevaCedula;
    }

    public void setNuevaCedula(String nuevaCedula) {
        this.nuevaCedula = nuevaCedula;
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
    
    
    
    //CRUD
    Administrador objAdministrador = new Administrador();
    Vendedor objVendedor = new Vendedor();
    Cliente objCliente = new Cliente();
    
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
    
    //Update
    
    //Delete
}

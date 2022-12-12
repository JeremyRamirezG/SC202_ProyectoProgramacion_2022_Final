package sc202.proyectofinal_sistemadeventadeverduleria;

public class Administrador extends Empleado {
    //Atributos propios de la clase
    private String rolAdministrador;
    
    //Constructores
    public Administrador(String rolAdministrador, String idEmpleado, int añosContratadoEmpleado, Double salarioBrutoEmpleado, String estadoEmpleado, String nombrePersona, String cedulaPersona, int edadPersona, String correoElectronicoPersona, String numeroTelefonicoPersona) {
        super(idEmpleado, añosContratadoEmpleado, salarioBrutoEmpleado, estadoEmpleado, nombrePersona, cedulaPersona, edadPersona, correoElectronicoPersona, numeroTelefonicoPersona);
        this.rolAdministrador = rolAdministrador;
    }
    public Administrador() {
        super();
        this.rolAdministrador = "";
    }
    
    //GETs y SETs
    public String getRolAdministrador() {
        return rolAdministrador;
    }

    public void setRolAdministrador(String rolAdministrador) {
        this.rolAdministrador = rolAdministrador;
    }
    
}

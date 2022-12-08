package sc202.proyectofinal_sistemadeventadeverduleria;

public class Vendedor extends Empleado {
    //Atributos propios de la clase
    private String rolVendedor;
    
    //Constructores
    public Vendedor(String rolVendedor, String idEmpleado, int añosContratadoEmpleado, Double salarioBrutoEmpleado, boolean estadoEmpleado, String nombrePersona, String cedulaPersona, int edadPersona, String correoElectronicoPersona, String numeroTelefonicoPersona) {
        super(idEmpleado, añosContratadoEmpleado, salarioBrutoEmpleado, estadoEmpleado, nombrePersona, cedulaPersona, edadPersona, correoElectronicoPersona, numeroTelefonicoPersona);
        this.rolVendedor = rolVendedor;
    }
    public Vendedor() {
        super();
        this.rolVendedor = "";
    }
    
    //GETs y SETs
    public String getRolVendedor() {
        return rolVendedor;
    }

    public void setRolVendedor(String rolVendedor) {
        this.rolVendedor = rolVendedor;
    }
    
}

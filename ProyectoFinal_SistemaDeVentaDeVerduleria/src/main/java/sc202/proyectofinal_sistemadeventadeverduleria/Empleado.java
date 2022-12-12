package sc202.proyectofinal_sistemadeventadeverduleria;

public abstract class Empleado extends Persona{
    //Atributos propios de la clase
    protected String idEmpleado;
    protected int añosContratadoEmpleado;
    protected Double salarioBrutoEmpleado;
    protected String estadoEmpleado;
    
    //Constructores
    public Empleado(String idEmpleado, int añosContratadoEmpleado, Double salarioBrutoEmpleado, String estadoEmpleado, String nombrePersona, String cedulaPersona, int edadPersona, String correoElectronicoPersona, String numeroTelefonicoPersona) {
        super(nombrePersona, cedulaPersona, edadPersona, correoElectronicoPersona, numeroTelefonicoPersona);
        this.idEmpleado = idEmpleado;
        this.añosContratadoEmpleado = añosContratadoEmpleado;
        this.salarioBrutoEmpleado = salarioBrutoEmpleado;
        this.estadoEmpleado = estadoEmpleado;
    }
    public Empleado() {
        super();
        this.idEmpleado = "";
        this.añosContratadoEmpleado = 0;
        this.salarioBrutoEmpleado = 0.0;
        this.estadoEmpleado = "";
    }
    
    //GETs y SETs
    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getAñosContratadoEmpleado() {
        return añosContratadoEmpleado;
    }

    public void setAñosContratadoEmpleado(int añosContratadoEmpleado) {
        this.añosContratadoEmpleado = añosContratadoEmpleado;
    }

    public Double getSalarioBrutoEmpleado() {
        return salarioBrutoEmpleado;
    }

    public void setSalarioBrutoEmpleado(Double salarioBrutoEmpleado) {
        this.salarioBrutoEmpleado = salarioBrutoEmpleado;
    }
    public String getEstadoEmpleado() {
        return estadoEmpleado;
    }

    public void setEstadoEmpleado(String estadoEmpleado) {
        this.estadoEmpleado = estadoEmpleado;
    }


    
}

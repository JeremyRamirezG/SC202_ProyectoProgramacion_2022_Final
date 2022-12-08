package sc202.proyectofinal_sistemadeventadeverduleria;

public class Cliente extends Persona {
    //Atributos propios de la clase
    private String idCliente;
    private String direccionCliente;
    private String metodoPagoCliente;
    
    //Constructores
    public Cliente(String idCliente, String direccionCliente, String metodoPagoCliente, String nombrePersona, String cedulaPersona, int edadPersona, String correoElectronicoPersona, String numeroTelefonicoPersona) {
        super(nombrePersona, cedulaPersona, edadPersona, correoElectronicoPersona, numeroTelefonicoPersona);
        this.idCliente = idCliente;
        this.direccionCliente = direccionCliente;
        this.metodoPagoCliente = metodoPagoCliente;
    }
    public Cliente() {
        super();
        this.idCliente = "";
        this.direccionCliente = "";
        this.metodoPagoCliente = "";
    }
    
    //GETs y SETs
    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getMetodoPagoCliente() {
        return metodoPagoCliente;
    }

    public void setMetodoPagoCliente(String metodoPagoCliente) {
        this.metodoPagoCliente = metodoPagoCliente;
    }
    
}

package sc202.proyectofinal_sistemadeventadeverduleria;

/**
 *
 * @author jrg71
 */
public abstract class Persona {
    //Atributos propios de la clase
    protected String nombrePersona;
    protected String cedulaPersona;
    protected int edadPersona;
    protected String correoElectronicoPersona;
    protected String numeroTelefonicoPersona;
    
    //Constructores
    public Persona(String nombrePersona, String cedulaPersona, int edadPersona, String correoElectronicoPersona, String numeroTelefonicoPersona) {
        this.nombrePersona = nombrePersona;
        this.cedulaPersona = cedulaPersona;
        this.edadPersona = edadPersona;
        this.correoElectronicoPersona = correoElectronicoPersona;
        this.numeroTelefonicoPersona = numeroTelefonicoPersona;
    }
    public Persona() {
        this.nombrePersona = "";
        this.cedulaPersona = "";
        this.edadPersona = 0;
        this.correoElectronicoPersona = "";
        this.numeroTelefonicoPersona = "";
    }
    
    //GETs y SETs
    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getCedulaPersona() {
        return cedulaPersona;
    }

    public void setCedulaPersona(String cedulaPersona) {
        this.cedulaPersona = cedulaPersona;
    }

    public int getEdadPersona() {
        return edadPersona;
    }

    public void setEdadPersona(int edadPersona) {
        this.edadPersona = edadPersona;
    }

    public String getCorreoElectronicoPersona() {
        return correoElectronicoPersona;
    }

    public void setCorreoElectronicoPersona(String correoElectronicoPersona) {
        this.correoElectronicoPersona = correoElectronicoPersona;
    }

    public String getNumeroTelefonicoPersona() {
        return numeroTelefonicoPersona;
    }

    public void setNumeroTelefonicoPersona(String numeroTelefonicoPersona) {
        this.numeroTelefonicoPersona = numeroTelefonicoPersona;
    }
}

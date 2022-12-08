package sc202.proyectofinal_sistemadeventadeverduleria;

public class Otros extends Productos {
    //Atributos propios de la clase
    private String tipoProducto;
    private String distribuidorProducto;
    private String marcaProducto;
    
    //Constructores
    public Otros(String tipoProducto, String distribuidorProducto, String marcaProducto, String nombreProducto, Double precioProducto, String fechaIngreso, String idProducto, int cantidadProducto) {
        super(nombreProducto, precioProducto, fechaIngreso, idProducto, cantidadProducto);
        this.tipoProducto = tipoProducto;
        this.distribuidorProducto = distribuidorProducto;
        this.marcaProducto = marcaProducto;
    }

    public Otros() {
        super();
        this.tipoProducto = "";
        this.distribuidorProducto = "";
        this.marcaProducto = "";
    }
    
    //GETs y SETs
    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getDistribuidorProducto() {
        return distribuidorProducto;
    }

    public void setDistribuidorProducto(String distribuidorProducto) {
        this.distribuidorProducto = distribuidorProducto;
    }

    public String getMarcaProducto() {
        return marcaProducto;
    }

    public void setMarcaProducto(String marcaProducto) {
        this.marcaProducto = marcaProducto;
    }
    
}

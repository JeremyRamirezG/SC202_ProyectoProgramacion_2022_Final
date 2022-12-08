package sc202.proyectofinal_sistemadeventadeverduleria;

public class Verduras extends Productos {
    //Atributos propios de la clase
    private String temporadaVerduras;
    
    //Constructores
    public Verduras(String temporadaVerduras, String nombreProducto, Double precioProducto, String fechaIngreso, String idProducto, int cantidadProducto) {
        super(nombreProducto, precioProducto, fechaIngreso, idProducto, cantidadProducto);
        this.temporadaVerduras = temporadaVerduras;
    }
    public Verduras() {
        super();
        this.temporadaVerduras = "";
    }
    
    //GETs y SETs
    public String getTemporadaVerduras() {
        return temporadaVerduras;
    }

    public void setTemporadaVerduras(String temporadaVerduras) {
        this.temporadaVerduras = temporadaVerduras;
    }
    
}

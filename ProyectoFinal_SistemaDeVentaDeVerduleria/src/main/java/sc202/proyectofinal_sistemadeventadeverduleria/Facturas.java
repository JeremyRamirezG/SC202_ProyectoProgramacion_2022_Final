package sc202.proyectofinal_sistemadeventadeverduleria;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Calendar;

/**
 *
 * @author jrg71
 */
public class Facturas {
    //Atributos propios de la clase
    private String nombreFactura;
    private Double precioTotal;
    private String fechaFactura;
    private String horaFactura;
    
    //Constructores de la clase
    public Facturas(String nombreFactura, Double precioTotal, String fechaFactura, String horaFactura) {
        this.nombreFactura = nombreFactura;
        this.precioTotal = precioTotal;
        this.fechaFactura = fechaFactura;
        this.horaFactura = horaFactura;
    }
    public Facturas() {
        this.nombreFactura = "";
        this.precioTotal = 0.0;
        this.fechaFactura = "";
        this.horaFactura = "";
    }
    
    //GETs & SETs
    public String getNombreFactura() {
        return nombreFactura;
    }

    public void setNombreFactura(String nombreFactura) {
        this.nombreFactura = nombreFactura;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public String getHoraFactura() {
        return horaFactura;
    }

    public void setHoraFactura(String horaFactura) {
        this.horaFactura = horaFactura;
    }
    
    //Metodos propios de la clase
    
}

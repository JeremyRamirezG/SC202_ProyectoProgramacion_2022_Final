package CRUD;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import sc202.proyectofinal_sistemadeventadeverduleria.Productos;
import java.util.UUID;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.StringTokenizer;

/**
 *
 * @author jrg71
 */
public class ManejoFacturas {

    //Atributos de la clase
    private String rutaOrdenTemporal;
    private String nombreOrdenTemporal;
    private Double subTotal;
    private String stringUnicoFactura;
    private String rutaFactura;
    private String nombreFactura;
    private String facturaHoraFecha;

    //Constructores de la clase
    public ManejoFacturas(String rutaOrdenTemporal, String nombreOrdenTemporal, Double subTotal, String stringUnicoFactura, String rutaFactura, String nombreFactura, String facturaHoraFecha) {
        this.rutaOrdenTemporal = rutaOrdenTemporal;
        this.nombreOrdenTemporal = nombreOrdenTemporal;
        this.subTotal = subTotal;
        this.stringUnicoFactura = stringUnicoFactura;
        this.rutaFactura = rutaFactura;
        this.nombreFactura = nombreFactura;
        this.facturaHoraFecha = facturaHoraFecha;
    }

    public ManejoFacturas() {
        this.rutaOrdenTemporal = "./Facturas/Temp/";
        this.nombreOrdenTemporal = "OrdenTemporal.txt";
        this.subTotal = 0.0;
        this.stringUnicoFactura = "";
        this.rutaFactura = "./Facturas/";
        this.nombreFactura = "";
        this.facturaHoraFecha = "";
    }

    //SETs & GETs
    public String getRutaOrdenTemporal() {
        return rutaOrdenTemporal;
    }

    public void setRutaOrdenTemporal(String rutaOrdenTemporal) {
        this.rutaOrdenTemporal = rutaOrdenTemporal;
    }

    public String getNombreOrdenTemporal() {
        return nombreOrdenTemporal;
    }

    public void setNombreOrdenTemporal(String nombreOrdenTemporal) {
        this.nombreOrdenTemporal = nombreOrdenTemporal;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public String getStringUnicoFactura() {
        return stringUnicoFactura;
    }

    public void setStringUnicoFactura(String stringUnicoFactura) {
        this.stringUnicoFactura = stringUnicoFactura;
    }

    public String getRutaFactura() {
        return rutaFactura;
    }

    public void setRutaFactura(String rutaFactura) {
        this.rutaFactura = rutaFactura;
    }

    public String getNombreFactura() {
        return nombreFactura;
    }

    public void setNombreFactura(String nombreFactura) {
        this.nombreFactura = nombreFactura;
    }

    public String getFacturaHoraFecha() {
        return facturaHoraFecha;
    }

    public void setFacturaHoraFecha(String facturaHoraFecha) {
        this.facturaHoraFecha = facturaHoraFecha;
    }

    //Métodos propios de la clase
    public void crearOrdenTemporal(Productos objProductos) {
        try {
            String contenido = objProductos.getNombreProducto() + "," + objProductos.getCantidadProducto() + "," + this.subTotal;
            File archivo = new File(this.rutaOrdenTemporal + this.nombreOrdenTemporal);

            //Verificar si el archivo con ese nombre y en esa ruta
            if (!archivo.exists()) {
                //Creamos el archivo
                archivo.createNewFile();
            }

            //Para escribir en el archivo se ocupan dos elementos
            FileWriter fw = new FileWriter(archivo, true);
            BufferedWriter bw = new BufferedWriter(fw);

            //Escribo en el archivo 
            bw.write(contenido);

            //Cierro la conexión con el archivo 
            bw.flush();
            bw.newLine();
            bw.close();

        } catch (Exception error) {
            //Imprime un detalle del error presentado
            error.printStackTrace();
        }
    }

    public void crearFactura() {
        obtenerFechaHora();
        generarIdUnico();

        this.nombreFactura = "Factura-" + this.facturaHoraFecha + "-" + this.stringUnicoFactura + ".txt";
        String nombreProducto, cantidadProducto, subTotal, registro;
        Double total = 0.0;
        File archivoCarrito = new File(this.rutaOrdenTemporal + this.nombreOrdenTemporal);
        File archivoFactura = new File(this.rutaFactura + this.nombreFactura);

        try {
            BufferedReader br = new BufferedReader(new FileReader(archivoCarrito));
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivoFactura));
            bw.write("Sistema de facturación La Finca, factura No." + this.stringUnicoFactura);
            bw.flush();
            bw.newLine();
            bw.newLine();
            bw.newLine();
            bw.write("Gracias por su compra, encuentre el desgloce de la misma en el formato: Producto | Cantidad | SubTotal");
            bw.flush();
            bw.newLine();
            bw.newLine();

            while ((registro = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(registro, ",");
                nombreProducto = st.nextToken();
                cantidadProducto = st.nextToken();
                subTotal = st.nextToken();

                total = total + Double.parseDouble(subTotal);
                bw.write(cantidadProducto + " | " + nombreProducto + " | " + subTotal + "₡");
                bw.flush();
                bw.newLine();
            }

            total = total + (total * 0.13);
            bw.newLine();
            bw.write("Total IVAI.................." + total + "₡");
            bw.close();
            br.close();
            archivoCarrito.delete();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    //Obtener datos factura
    public void generarIdUnico() {
        UUID primerId = UUID.randomUUID();
        String transformarString = "" + primerId;
        int generarNumeros = transformarString.hashCode();
        String cambiarString = ""+generarNumeros;
        String cambiarSignos = cambiarString.replaceAll("-", "");
        this.stringUnicoFactura = cambiarSignos;
    }

    public void obtenerFechaHora() {
        Calendar hora;
        String textoReloj;
        String textoCalendario;
        int mes;

        hora = Calendar.getInstance();
        textoReloj = "H" + hora.get(Calendar.HOUR_OF_DAY) + "M"
                + hora.get(Calendar.MINUTE) + "S"
                + hora.get(Calendar.SECOND);
        mes = hora.get(Calendar.MONTH)+1;
        textoCalendario = "" + hora.get(Calendar.DAY_OF_MONTH) + "_" + mes + "_" + hora.get(Calendar.YEAR);
        this.facturaHoraFecha = textoReloj + "-" + textoCalendario;
    }

}

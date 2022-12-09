package CRUD;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

import sc202.proyectofinal_sistemadeventadeverduleria.Frutas;
import sc202.proyectofinal_sistemadeventadeverduleria.Verduras;
import sc202.proyectofinal_sistemadeventadeverduleria.Otros;

/**
 *
 * @author jrg71
 */
public class ManejoProductos {
    //Atributos de la clase
    private String rutaProductos;
    private String archivoProductos;
    private String idProductoManejoArchivos;
    private String tipoProducto;
    private String nuevoNombre;
    private String nuevaFecha;
    private Double nuevoPrecio;
    private int nuevaCantidad;
    private Frutas objFrutas;
    private Otros objOtros;
    private Verduras objVerduras;
    
    //Constructores de la clase
    
    public ManejoProductos(String rutaProductos, String archivoProductos, String idProductoManejoArchivos, String tipoProducto, String nuevoNombre, String nuevaFecha, Double nuevoPrecio, int nuevaCantidad, Frutas objFrutas, Otros objOtros, Verduras objVerduras) {
        this.rutaProductos = rutaProductos;
        this.archivoProductos = archivoProductos;
        this.idProductoManejoArchivos = idProductoManejoArchivos;
        this.tipoProducto = tipoProducto;
        this.nuevoNombre = nuevoNombre;
        this.nuevaFecha = nuevaFecha;
        this.nuevoPrecio = nuevoPrecio;
        this.nuevaCantidad = nuevaCantidad;
        this.objFrutas = objFrutas;
        this.objOtros = objOtros;
        this.objVerduras = objVerduras;
    }
    public ManejoProductos() {
        this.rutaProductos = "";
        this.archivoProductos = "Productos"+tipoProducto+".txt";
        this.idProductoManejoArchivos = "";
        this.tipoProducto = "";
        this.nuevoNombre = "";
        this.nuevaFecha = "";
        this.nuevoPrecio = 0.0;
        this.nuevaCantidad = 0;
        this.objFrutas = new Frutas();
        this.objOtros = new Otros();
        this.objVerduras = new Verduras();
    }
    
    //GETs & SETs
    public String getRutaProductos() {
        return rutaProductos;
    }

    public void setRutaProductos(String rutaProductos) {
        this.rutaProductos = rutaProductos;
    }

    public String getArchivoProductos() {
        return archivoProductos;
    }

    public void setArchivoProductos(String archivoProductos) {
        this.archivoProductos = archivoProductos;
    }

    public String getIdProductoManejoArchivos() {
        return idProductoManejoArchivos;
    }

    public void setIdProductoManejoArchivos(String idProductoManejoArchivos) {
        this.idProductoManejoArchivos = idProductoManejoArchivos;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getNuevoNombre() {
        return nuevoNombre;
    }

    public void setNuevoNombre(String nuevoNombre) {
        this.nuevoNombre = nuevoNombre;
    }

    public String getNuevaFecha() {
        return nuevaFecha;
    }

    public void setNuevaFecha(String nuevaFecha) {
        this.nuevaFecha = nuevaFecha;
    }

    public Double getNuevoPrecio() {
        return nuevoPrecio;
    }

    public void setNuevoPrecio(Double nuevoPrecio) {
        this.nuevoPrecio = nuevoPrecio;
    }

    public int getNuevaCantidad() {
        return nuevaCantidad;
    }

    public void setNuevaCantidad(int nuevaCantidad) {
        this.nuevaCantidad = nuevaCantidad;
    }

    public Frutas getObjFrutas() {
        return objFrutas;
    }

    public void setObjFrutas(Frutas objFrutas) {
        this.objFrutas = objFrutas;
    }

    public Otros getObjOtros() {
        return objOtros;
    }

    public void setObjOtros(Otros objOtros) {
        this.objOtros = objOtros;
    }

    public Verduras getObjVerduras() {
        return objVerduras;
    }

    public void setObjVerduras(Verduras objVerduras) {
        this.objVerduras = objVerduras;
    }
    
    //Create
    public void addProductoFrutas(Frutas objFrutas){
        try{
            this.archivoProductos = "Productos"+tipoProducto+".txt";
            File archivo = new File (this.rutaProductos+this.archivoProductos);
            
            if (!archivo.exists()){
                archivo.createNewFile();
            }
            
            //true = permite que el archivo vaya recibiendo información de manera incremental
            FileWriter fw= new FileWriter (archivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write(objFrutas.getNombreProducto() +"," + objFrutas.getPrecioProducto()+","+ objFrutas.getFechaIngreso()+","
                    + objFrutas.getIdProducto()+","+ objFrutas.getCantidadProducto()+","+ objFrutas.getTemporadaFrutas() );
            
            //Agregar una línea nueva al final del archivo
            bw.flush();
            bw.newLine();
            bw.close();
            
        }catch (Exception error){
            error.printStackTrace();
        }
    }
    public void addProductoVerduras(Verduras objVerduras){
        try{
            this.archivoProductos = "Productos"+tipoProducto+".txt";
            File archivo = new File (this.rutaProductos+this.archivoProductos);
            
            if (!archivo.exists()){
                archivo.createNewFile();
            }
            
            //true = permite que el archivo vaya recibiendo información de manera incremental
            FileWriter fw= new FileWriter (archivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write(objVerduras.getNombreProducto() +"," + objVerduras.getPrecioProducto()+","+ objVerduras.getFechaIngreso()+","
                    + objVerduras.getIdProducto()+","+ objVerduras.getCantidadProducto()+","+ objVerduras.getTemporadaVerduras() );
            
            //Agregar una línea nueva al final del archivo
            bw.flush();
            bw.newLine();
            bw.close();
            
        }catch (Exception error){
            error.printStackTrace();
        }
    }
    public void addProductoOtros(Otros objOtros){
        try{
            this.archivoProductos = "Productos"+tipoProducto+".txt";
            File archivo = new File (this.rutaProductos+this.archivoProductos);
            
            if (!archivo.exists()){
                archivo.createNewFile();
            }
            
            //true = permite que el archivo vaya recibiendo información de manera incremental
            FileWriter fw= new FileWriter (archivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write(objOtros.getNombreProducto() +"," + objOtros.getPrecioProducto()+","+ objOtros.getFechaIngreso()+","
                    + objOtros.getIdProducto()+","+ objOtros.getCantidadProducto()+","+ objOtros.getTipoProducto()+","+ objOtros.getMarcaProducto()+","+ objOtros.getDistribuidorProducto());
            
            //Agregar una línea nueva al final del archivo
            bw.flush();
            bw.newLine();
            bw.close();
            
        }catch (Exception error){
            error.printStackTrace();
        }
    }
    
    //Read
    public ArrayList obtenerListaFrutas (){
        try{
            String registro;
            ArrayList<Frutas> listaFrutas = new ArrayList <Frutas>();
            
            this.archivoProductos = "Productos"+tipoProducto+".txt";
            File archivo = new File (this.rutaProductos+this.archivoProductos);

            if (!archivo.exists()){
                archivo.createNewFile();
                return null;
            }
            
            //Leer el archivo 
            FileReader fr = new FileReader(archivo);
            BufferedReader br= new BufferedReader(fr);
            
            while ((registro = br.readLine())!=null){
                Frutas objFrutas = new Frutas();
                StringTokenizer st = new StringTokenizer(registro, ",");
                
                objFrutas.setNombreProducto(st.nextToken());
                objFrutas.setPrecioProducto(Double.parseDouble(st.nextToken()));
                objFrutas.setFechaIngreso(st.nextToken());
                objFrutas.setIdProducto(st.nextToken());
                objFrutas.setCantidadProducto(Integer.parseInt(st.nextToken()));
                objFrutas.setTemporadaFrutas(st.nextToken());
                
                listaFrutas.add(objFrutas);
            }
            
            br.close();
            return listaFrutas;
                 
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }  
    }
    public ArrayList obtenerListaVerduras (){
        try{
            String registro;
            ArrayList<Verduras> listaVerduras = new ArrayList <Verduras>();
            
            this.archivoProductos = "Productos"+tipoProducto+".txt";
            File archivo = new File (this.rutaProductos+this.archivoProductos);

            if (!archivo.exists()){
                archivo.createNewFile();
                return null;
            }
            
            //Leer el archivo 
            FileReader fr = new FileReader(archivo);
            BufferedReader br= new BufferedReader(fr);
            
            while ((registro = br.readLine())!=null){
                Verduras objVerduras = new Verduras();
                StringTokenizer st = new StringTokenizer(registro, ",");
                
                objVerduras.setNombreProducto(st.nextToken());
                objVerduras.setPrecioProducto(Double.parseDouble(st.nextToken()));
                objVerduras.setFechaIngreso(st.nextToken());
                objVerduras.setIdProducto(st.nextToken());
                objVerduras.setCantidadProducto(Integer.parseInt(st.nextToken()));
                objVerduras.setTemporadaVerduras(st.nextToken());
                
                listaVerduras.add(objVerduras);
            }
            
            br.close();
            return listaVerduras;
                 
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }  
    }
    public ArrayList obtenerListaOtros (){
        try{
            String registro;
            ArrayList<Otros> listaOtros= new ArrayList <Otros>();
            
            this.archivoProductos = "Productos"+tipoProducto+".txt";
            File archivo = new File (this.rutaProductos+this.archivoProductos);

            if (!archivo.exists()){
                archivo.createNewFile();
                return null;
            }
            
            //Leer el archivo 
            FileReader fr = new FileReader(archivo);
            BufferedReader br= new BufferedReader(fr);
            
            while ((registro = br.readLine())!=null){
                Otros objOtros = new Otros();
                StringTokenizer st = new StringTokenizer(registro, ",");
                
                objOtros.setNombreProducto(st.nextToken());
                objOtros.setPrecioProducto(Double.parseDouble(st.nextToken()));
                objOtros.setFechaIngreso(st.nextToken());
                objOtros.setIdProducto(st.nextToken());
                objOtros.setCantidadProducto(Integer.parseInt(st.nextToken()));
                objOtros.setTipoProducto(st.nextToken());
                objOtros.setMarcaProducto(st.nextToken());
                objOtros.setDistribuidorProducto(st.nextToken());
                
                listaOtros.add(objOtros);
            }
            
            br.close();
            return listaOtros;
                 
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }  
    }
    
    //Update
    public void actualizarInformacionVerdurasYFrutas(){
        try{
            String nombreProducto,precioProducto,fechaProducto, idProducto, cantidad, temporadaProducto, primerRegistro, segundoRegistro;
            
            //Variable bandera 
            int encontroRegistro=0; 
            
            this.archivoProductos = "Productos"+tipoProducto+".txt";
            File archivo = new File (this.rutaProductos+this.archivoProductos);
            
            String archivoProductosTemporal = "Productos"+tipoProducto+"Temporal.txt";
            File archivoTemporal = new File (this.rutaProductos+archivoProductosTemporal);
            
            BufferedReader br = new BufferedReader (new FileReader (archivo));
            BufferedWriter bw = new BufferedWriter (new FileWriter(archivoTemporal));
            
            String informacion = "";
            
            while ((primerRegistro= br.readLine())!=null){
                
                StringTokenizer st = new StringTokenizer (primerRegistro, ",");
                nombreProducto=st.nextToken();
                precioProducto= st.nextToken();
                fechaProducto = st.nextToken();
                idProducto = st.nextToken();
                cantidad = st.nextToken();
                temporadaProducto= st.nextToken();
                
                if (this.idProductoManejoArchivos.equals(idProducto)){
                    informacion= nombreProducto; 
                }
                
            }
            br.close();
            
            if (informacion.length()!=0){

                BufferedReader br2= new BufferedReader (new FileReader (archivo));
                
                while ((segundoRegistro= br2.readLine())!=null){
                    StringTokenizer st = new StringTokenizer(segundoRegistro,",");
                    nombreProducto=st.nextToken();
                    precioProducto= st.nextToken();
                    fechaProducto = st.nextToken();
                    idProducto = st.nextToken();
                    cantidad = st.nextToken();
                    temporadaProducto= st.nextToken();
                    
                    if (this.idProductoManejoArchivos.equals(idProducto)){
                        bw.write(this.nuevoNombre+","+this.nuevoPrecio+","+this.nuevaFecha+","
                                + idProducto+","+this.nuevaCantidad+","+temporadaProducto);
                    }else{
                        bw.write(segundoRegistro);
                    }
                    bw.flush();
                    bw.newLine();
                }
                bw.close();;
                br2.close();
                archivo.delete();
                archivoTemporal.renameTo(archivo);
                JOptionPane.showMessageDialog(null, "La información del producto fue modificada correctamente");
                
                
            }else{
                JOptionPane.showMessageDialog(null, "No fue encontrada la cédula de la persona suministrada, vuelva a intentarlo");
            }
            
        }catch (Exception ex){
            ex.printStackTrace();
        }
        
        
    }
    public void actualizarInformacionOtros(){
        try{
            String nombreProducto,precioProducto,fechaProducto, idProducto, cantidad, tipoOtros, marca, distribuidora, primerRegistro, segundoRegistro;
            
            //Variable bandera 
            int encontroRegistro=0; 
            
            this.archivoProductos = "Productos"+tipoProducto+".txt";
            File archivo = new File (this.rutaProductos+this.archivoProductos);
            
            String archivoProductosTemporal = "Productos"+tipoProducto+"Temporal.txt";
            File archivoTemporal = new File (this.rutaProductos+archivoProductosTemporal);
            
            BufferedReader br = new BufferedReader (new FileReader (archivo));
            BufferedWriter bw = new BufferedWriter (new FileWriter(archivoTemporal));
            
            String informacion = "";
            
            while ((primerRegistro= br.readLine())!=null){
                
                StringTokenizer st = new StringTokenizer (primerRegistro, ",");
                nombreProducto=st.nextToken();
                precioProducto= st.nextToken();
                fechaProducto = st.nextToken();
                idProducto = st.nextToken();
                cantidad = st.nextToken();
                tipoOtros= st.nextToken();
                marca= st.nextToken();
                distribuidora= st.nextToken();
                
                if (this.idProductoManejoArchivos.equals(idProducto)){
                    informacion= nombreProducto; 
                }
                
            }
            br.close();
            
            if (informacion.length()!=0){

                BufferedReader br2= new BufferedReader (new FileReader (archivo));
                
                while ((segundoRegistro= br2.readLine())!=null){
                    StringTokenizer st = new StringTokenizer(segundoRegistro,",");
                    nombreProducto=st.nextToken();
                    precioProducto= st.nextToken();
                    fechaProducto = st.nextToken();
                    idProducto = st.nextToken();
                    cantidad = st.nextToken();
                    tipoOtros= st.nextToken();
                    marca= st.nextToken();
                    distribuidora= st.nextToken();
                    
                    if (this.idProductoManejoArchivos.equals(idProducto)){
                        bw.write(this.nuevoNombre+","+this.nuevoPrecio+","+this.nuevaFecha+","
                                + idProducto+","+this.nuevaCantidad+","+tipoOtros+","+marca+","+distribuidora);
                    }else{
                        bw.write(segundoRegistro);
                    }
                    bw.flush();
                    bw.newLine();
                }
                bw.close();;
                br2.close();
                archivo.delete();
                archivoTemporal.renameTo(archivo);
                JOptionPane.showMessageDialog(null, "La información del producto fue modificada correctamente");
                
                
            }else{
                JOptionPane.showMessageDialog(null, "No fue encontrada la cédula de la persona suministrada, vuelva a intentarlo");
            }
            
        }catch (Exception ex){
            ex.printStackTrace();
        }
        
        
    }
    
    //Delete
    public int borrarPorID (){
        
        try{
            String nombreProducto,precioProducto,fechaProducto, idProducto, temporadaProducto, registro;
            
            //Variable bandera 
            int encontroRegistro=0; 
            
            this.archivoProductos = "Productos"+tipoProducto+".txt";
            File archivo = new File (this.rutaProductos+this.archivoProductos);
            
            String archivoProductosTemporal = "Productos"+tipoProducto+"Temporal.txt";
            File archivoTemporal = new File (this.rutaProductos+archivoProductosTemporal);
            
            BufferedReader br = new BufferedReader (new FileReader (archivo));
            BufferedWriter bw = new BufferedWriter (new FileWriter(archivoTemporal));
            
            while ((registro = br.readLine())!=null){
                
                StringTokenizer st = new StringTokenizer(registro,",");
                nombreProducto=st.nextToken();
                precioProducto= st.nextToken();
                fechaProducto = st.nextToken();
                idProducto = st.nextToken();
                temporadaProducto= st.nextToken();
                
                if (!this.idProductoManejoArchivos.equals(idProducto)){
                    bw.write(registro);
                    bw.flush();
                    bw.newLine();
                }else{
                    encontroRegistro=1;
                }  
            }
            
            br.close();
            bw.close();
            archivo.delete();
            archivoTemporal.renameTo(archivo);
            return encontroRegistro;
            
        }catch  (Exception ex){
            ex.printStackTrace();
            return 0;
        }
    }
}

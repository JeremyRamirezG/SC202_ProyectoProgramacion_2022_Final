package sc202.proyectofinal_sistemadeventadeverduleria;

public class ProyectoFinal_SistemaDeVentaDeVerduleria {

    public static void main(String[] args) {
        iniciarInterfaz();
    }
    public static void iniciarInterfaz(){
        frm_Login_Usuarios formulario = new frm_Login_Usuarios();
        
        //Permite centrar un formulario en pantalla
        formulario.setLocationRelativeTo(null);
        
        //Mostrar el formulario en pantalla
        formulario.setVisible(true);
    }
}

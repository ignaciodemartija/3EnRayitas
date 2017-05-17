package mvc3nraya;

import vista.Vista;
import controlador.Controlador;
import modelo.Modelo;

public class Main {

    public static void main(String[] args) {
        //nuevas instancias de clase
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(vista, modelo);
        controlador.iniciar_vista();
        vista.setVisible(true);
    }
}

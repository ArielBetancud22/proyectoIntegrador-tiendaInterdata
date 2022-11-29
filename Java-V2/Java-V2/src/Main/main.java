package Main;

import Metodos.InicioTienda;
import Metodos.MetodoPago;
import Metodos.Productos;

public class main {

    public static void main(String[] args) {

        InicioTienda inicioTienda = new InicioTienda();
        inicioTienda.inicioTienda();

        Productos productos = new Productos();
        productos.productos();
        
        MetodoPago metodoPago = new MetodoPago();
        metodoPago.metodoPago(0);

    }
}

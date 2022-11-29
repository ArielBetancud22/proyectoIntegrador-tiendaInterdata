
package Metodos;

import java.util.Scanner;


public class MenuRemeras {
    private int modelo, cantidad, compra, agregarOpcion;
    private float precio;
    private String nombreModelo;
    private boolean salida;

    public MenuRemeras() {
    }

    public MenuRemeras(int modelo, int cantidad, int compra, int agregarOpcion, float precio, String nombreModelo, boolean salida) {
        this.modelo = modelo;
        this.cantidad = cantidad;
        this.compra = compra;
        this.agregarOpcion = agregarOpcion;
        this.precio = precio;
        this.nombreModelo = nombreModelo;
        this.salida = salida;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCompra() {
        return compra;
    }

    public void setCompra(int compra) {
        this.compra = compra;
    }

    public int getAgregarOpcion() {
        return agregarOpcion;
    }

    public void setAgregarOpcion(int agregarOpcion) {
        this.agregarOpcion = agregarOpcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public boolean isSalida() {
        return salida;
    }

    public void setSalida(boolean salida) {
        this.salida = salida;
    }
    
    
    
    
    public void menuRemeras(double compraTotal, String compraProductos){
        this.setAgregarOpcion(agregarOpcion);
        this.setCantidad(cantidad);
        this.setCompra(compra);
        this.setModelo(modelo);
        this.setNombreModelo(nombreModelo);
        this.setPrecio(precio);
        this.setSalida(salida);
        
        
        System.out.println("::..............................................................................................::");
        System.out.println("::                                         CATEGORIA REMERAS                                    ::");
        System.out.println("::                                        MODELOS DISPONIBLES                                   ::");
        System.out.println("::..............................................................................................::\n");
        
        System.out.println("1. Remera Alzakaba: $10740");
        System.out.println("2. Remera Adventure: $10950");
        System.out.println("3. Remera Steeze: $10580");
        System.out.println("4. Remera Camber: $10000");
        System.out.println("5. Remera Pocket: $9550");
        System.out.println("6. Remera Sketch: $9200");
        System.out.println("7. Volver.\n");
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese opcion de modelo: ");
        modelo = entrada.nextInt();
        
         switch (modelo){
            case 1 -> {
                nombreModelo = "Remera Alzakaba";
                precio = 10740;
            }
            case 2 -> {
                nombreModelo = "Remera Adventure";
                precio = 10950;
            }
            case 3 -> {
                nombreModelo = "Remera Steeze";
                precio = 10580;
            }
            case 4 -> {
                nombreModelo = "Remera Camber";
                precio = 10000;
            }
            case 5 -> {
                nombreModelo = "Remera Pocket";
                precio = 9550;
            }
            case 6 -> {
                nombreModelo = "Remera Sketch";
                precio = 9200;
            }
            case 7 -> {
                salida = true;
                Productos llamada = new Productos();
                llamada.productos();
            }     
        }
         
        if (salida == false){
            Scanner añadir = new Scanner(System.in);
            System.out.println("Añadir al carrito? [1. Si / 2. No]: ");
            agregarOpcion = añadir.nextInt();
        }
        
        if (agregarOpcion == 1){
            Scanner cant = new Scanner(System.in);
            System.out.println("Cantidad de prendas: ");
            cantidad = cant.nextInt();
            compraProductos = compraProductos + nombreModelo ;
            //Limpiar Pantalla
            System.out.println(".........................................................................................................");
            System.out.println("                                   :: AÑADIDO AL CARRITO ::                           ");
            System.out.println(".........................................................................................................\n");
            System.out.println("Prodcuto añadido al carrito: "+ nombreModelo);
            System.out.println("cantidad: "+ cantidad);
            System.out.println("Precio por curva $: "+ precio);
            compra = (int) (precio * cantidad);
            compraTotal += compra; // Checkear si está bien (Linea 241 - 242 Pseint)
            System.out.println("Precio total de lo añadido $: "+ compra);
            //Esperar 5 segundos
            // Limpiar pantalla
        }
        else{
            System.out.println("Volviendo a la sección productos\n");
            // Esperar 1/2 segundo
            System.out.println("Aguarde unos segundos...");
            // Esperar 2 segundos
            // Limpiar Pantalla
            Productos llamada = new Productos();
            llamada.productos();
        }
    }
}

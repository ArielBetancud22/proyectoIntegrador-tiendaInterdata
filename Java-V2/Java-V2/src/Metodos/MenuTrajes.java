
package Metodos;

import java.util.Scanner;


public class MenuTrajes {
    private int modelo, cantidad;
    private float precio;
    private String nombreModelo;
    private int agregarOpcion;
    private boolean salida;
    private int compra;

    public MenuTrajes() {
    }

    public MenuTrajes(int modelo, int cantidad, float precio, String nombreModelo, int agregarOpcion, boolean salida, int compra) {
        this.modelo = modelo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.nombreModelo = nombreModelo;
        this.agregarOpcion = agregarOpcion;
        this.salida = salida;
        this.compra = compra;
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

    public int getAgregarOpcion() {
        return agregarOpcion;
    }

    public void setAgregarOpcion(int agregarOpcion) {
        this.agregarOpcion = agregarOpcion;
    }

    public boolean isSalida() {
        return salida;
    }

    public void setSalida(boolean salida) {
        this.salida = salida;
    }

    public int getCompra() {
        return compra;
    }

    public void setCompra(int compra) {
        this.compra = compra;
    }
        
      
        
        
    public void menuTrajes(double compraTotal, String compraProductos){
        this.setAgregarOpcion(agregarOpcion);
        this.setCantidad(cantidad);
        this.setCompra(compra);
        this.setModelo(modelo);
        this.setNombreModelo(nombreModelo);
        this.setPrecio(precio);
        this.setSalida(salida);
        
        
        System.out.println("::..............................................................................................::");
        System.out.println("::                                         CATEGORIA TRAJES                                     ::");
        System.out.println("::                                        MODELOS DISPONIBLES                                   ::");
        System.out.println("::..............................................................................................::\n");
        
        System.out.println("1. Traje Pudong: $46740");
        System.out.println("2. Traje Quito: $45950");
        System.out.println("3. Traje Shangai: $49580");
        System.out.println("4. Traje Boston: $51800");
        System.out.println("5. Volver.");
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese opcion de modelo: ");
        modelo = entrada.nextInt();
        
        switch (modelo){
            case 1 -> {
                nombreModelo = "Traje Pudong";
                precio = 46740;
            }
            case 2 -> {
                nombreModelo = "Traje Quito";
                precio = 45950;
            }
            case 3 -> {
                nombreModelo = "Traje Shangai";
                precio = 49580;
            }
            case 4 -> {
                nombreModelo = "Traje Boston";
                precio = 51800;
            }
            case 5 -> {
                salida = true;
                // Limpiar Pantalla
                Productos llamada = new Productos();
                llamada.productos();
            }
        }
        
        if (salida == false){
            Scanner opcion = new Scanner(System.in);
            System.out.println("¿Añadir al carrito? [1. Si / 2. No]: ");
            agregarOpcion = opcion.nextInt();
        }
        
        switch (agregarOpcion){
            case 1 -> {
                Scanner cant = new Scanner(System.in);
                System.out.println("Cantidad de prendas: ");
                cantidad = cant.nextInt();
                compraProductos = compraProductos + nombreModelo;
                System.out.println(".........................................................................................................");
                System.out.println("                                   :: AÑADIDO AL CARRITO ::                           ");
                System.out.println(".........................................................................................................\n");
                System.out.println("Prodcuto añadido al carrito: "+ nombreModelo);
                System.out.println("cantidad: "+ cantidad);
                System.out.println("Precio por curva $: "+ precio);
                compra = (int) (precio * cantidad);
                compraTotal += compra;
                System.out.println("Precio total de lo añadido $: "+ compra);
            }
            case 2 -> {
                System.out.println("Volviendo a la sección productos\n");
                // Esperar 1/2 segundo
                System.out.println("Aguarde unos segundos...");
            }
        }
    }
}

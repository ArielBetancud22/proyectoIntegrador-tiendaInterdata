package Metodos;

import java.util.Scanner;

public class MenuCamperas {

    private int modelo, cantidad;
    private float precio;
    private String nombreModelo;
    private int agregarOpcion;
    private boolean salida;
    private int compra;

    public MenuCamperas() {
    }

    public MenuCamperas(int modelo, int cantidad, float precio, String nombreModelo, int agregarOpcion, boolean salida, int compra) {
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

    public void menuCamperas(double compraTotal, String compraProductos) {
        this.setAgregarOpcion(agregarOpcion);
        this.setCantidad(cantidad);
        this.setCompra(compra);
        this.setModelo(modelo);
        this.setNombreModelo(nombreModelo);
        this.setPrecio(precio);
        this.setSalida(salida);

        System.out.println("::..............................................................................................::");
        System.out.println("::                                        CATEGORIA CAMPERAS                                    ::");
        System.out.println("::                                        MODELOS DISPONIBLES                                   ::");
        System.out.println("::..............................................................................................::\n");

        System.out.println("1. Campera Moscú: $14000");
        System.out.println("2. Campera Morava: $15100");
        System.out.println("3. Campera Cesana: $16780");
        System.out.println("4. Campera Nuremberg: $15900");
        System.out.println("5. Campera Banff: $15320");
        System.out.println("6. Campera Rocker: $16800");
        System.out.println("7. Volver.");

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese opcion de modelo: ");
        modelo = entrada.nextInt();

        switch (modelo) {
            case 1 -> {
                nombreModelo = "Campera Moscú";
                precio = 14000;
            }
            case 2 -> {
                nombreModelo = "Campera Morava";
                precio = 15100;
            }
            case 3 -> {
                nombreModelo = "Campera Cesana";
                precio = 16780;
            }
            case 4 -> {
                nombreModelo = "Campera Nuremberg";
                precio = 15900;
            }
            case 5 -> {
                nombreModelo = "Campera Banff";
                precio = 15320;
            }
            case 6 -> {
                nombreModelo = "Campera Rocker";
                precio = 16800;
            }
            case 7 -> {
                salida = true;
                // Limpiar Pantalla
                Productos llamada = new Productos();
                llamada.productos();
            }
        }

        if (salida == false) {
            Scanner opcion = new Scanner(System.in);
            System.out.print("Aniadir al carrito? [1. Si / 2. No]: ");
            agregarOpcion = opcion.nextInt();
        }

        switch (agregarOpcion) {
            case 1 -> {
                Scanner cant = new Scanner(System.in);
                System.out.print("Cantidad de prendas: ");
                cantidad = cant.nextInt();
                compraProductos += nombreModelo;
                System.out.println(".........................................................................................................");
                System.out.println("                                   :: ANIADIDO AL CARRITO ::                           ");
                System.out.println(".........................................................................................................\n");
                System.out.println("Prodcuto añadido al carrito: " + nombreModelo);
                System.out.println("cantidad: " + cantidad);
                System.out.println("Precio por prenda $: " + precio);
                compra = (int) (precio * cantidad);
                compraTotal += compra;
                System.out.println("Precio total de lo aniadido $: " + compra);
                // Esperar 5 segundos
                // Limpiar pantalla
            }
            case 2 -> {
                System.out.println("Volviendo a la seccion productos\n");
                // Esperar 1/2 segundo
                System.out.println("Aguarde unos segundos...");
                // Esperar 2 segundos
                // Limpiar Pantalla
                Productos llamada = new Productos();
                llamada.productos();
            }
        }
    }
}

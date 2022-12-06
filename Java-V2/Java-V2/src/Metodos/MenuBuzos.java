package Metodos;

import java.util.Scanner;

public class MenuBuzos {

    private int modelo, cantidad;
    private float precio;
    private String nombreModelo;
    private int agregarOpcion;
    private boolean salida;
    private int compra;

    public MenuBuzos() {
    }

    public MenuBuzos(int modelo, int cantidad, float precio, String nombreModelo, int agregarOpcion, boolean salida, int compra) {
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

    public void menuBuzos(double compraTotal, String compraProductos) {
        this.setAgregarOpcion(agregarOpcion);
        this.setCantidad(cantidad);
        this.setCompra(compra);
        this.setModelo(modelo);
        this.setNombreModelo(nombreModelo);
        this.setPrecio(precio);
        this.setSalida(salida);

        System.out.println("::..............................................................................................::");
        System.out.println("::                                         CATEGORIA BUZOS                                      ::");
        System.out.println("::                                        MODELOS DISPONIBLES                                   ::");
        System.out.println("::..............................................................................................::\n");

        System.out.println("1. Buzo Essential: $12740.");
        System.out.println("2. Buzo Hoodie: $11950.");
        System.out.println("3. Buzo Shadow: $12580.");
        System.out.println("4. Buzo Flock: $13000.");
        System.out.println("5. Buzo Saona: $13320.");
        System.out.println("6. Buzo Lorain: $12800.");
        System.out.println("7. Volver.");

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese opcion de modelo: ");
        modelo = entrada.nextInt();

        switch (modelo) {
            case 1 -> {
                nombreModelo = "Buzo Essential";
                precio = 12740;
            }
            case 2 -> {
                nombreModelo = "Buzo Hoodie";
                precio = 11950;
            }
            case 3 -> {
                nombreModelo = "Buzo Shadow";
                precio = 12580;
            }
            case 4 -> {
                nombreModelo = "Buzo Flock";
                precio = 13000;
            }
            case 5 -> {
                nombreModelo = "Buzo Saona";
                precio = 13320;
            }
            case 6 -> {
                nombreModelo = "Buzo Lorain";
                precio = 12800;
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
            System.out.print("Aniadir al carrito? [1. Si / 2.No]: ");
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
                Productos llamada = new Productos();
                llamada.productos();
            }
        }
    }
}

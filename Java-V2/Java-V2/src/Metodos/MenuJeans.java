package Metodos;

import java.util.Scanner;

public class MenuJeans {

    private int modelo, cantidad;
    private float precio;
    private String nombreModelo;
    private int agregarOpcion;
    private boolean salida;
    private int compra;

    public MenuJeans() {
    }

    public MenuJeans(int modelo, int cantidad, float precio, String nombreModelo, int agregarOpcion, boolean salida, int compra) {
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

    public void menuJeans(double compraTotal, String compraProductos) {
        this.setAgregarOpcion(agregarOpcion);
        this.setCantidad(cantidad);
        this.setCompra(compra);
        this.setModelo(modelo);
        this.setNombreModelo(nombreModelo);
        this.setPrecio(precio);
        this.setSalida(salida);

        System.out.println("::..............................................................................................::");
        System.out.println("::                                         CATEGORIA JEANS                                      ::");
        System.out.println("::                                        MODELOS DISPONIBLES                                   ::");
        System.out.println("::..............................................................................................::\n");

        System.out.println("1. Jeans Slim: $14700");
        System.out.println("2. Jeans Relaxed: $15650");
        System.out.println("3. Jeans Skinny: $14900");
        System.out.println("4. Jeans Baggy: $14000");
        System.out.println("5. Jeans Active: $14300");
        System.out.println("6. Jeans Classic: $13800");
        System.out.println("7. Volver.");

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese opcion modelo: ");
        modelo = entrada.nextInt();

        switch (modelo) {
            case 1 -> {
                nombreModelo = "Jeans Modelo Slim";
                precio = 14700;
            }
            case 2 -> {
                nombreModelo = "Jeans Relaxed";
                precio = 15650;
            }
            case 3 -> {
                nombreModelo = "Jeans Skinny";
                precio = 14900;
            }
            case 4 -> {
                nombreModelo = "Jeans Baggy";
                precio = 14000;
            }
            case 5 -> {
                nombreModelo = "Jeans Active";
                precio = 14300;
            }
            case 6 -> {
                nombreModelo = "Jeans Classic";
                precio = 13800;
            }
            case 7 -> {
                salida = true;
                Productos llamada = new Productos();
                llamada.productos();
            }
        }

        if (salida == false) {
            Scanner opcion = new Scanner(System.in);
            System.out.print("¿Desea añadir al carrito? [1. Si / 2. No]: ");
            agregarOpcion = opcion.nextInt();
        }

        switch (agregarOpcion) {
            case 1 -> {
                Scanner cant = new Scanner(System.in);
                System.out.print("Cantidad de curvas: ");
                cantidad = cant.nextInt();
                compraProductos += nombreModelo;
                System.out.println(".........................................................................................................");
                System.out.println("::                                          AÑADIDO AL CARRITO                                        ::");
                System.out.println(".........................................................................................................\n");
                System.out.println("Producto: " + nombreModelo);
                System.out.println("Cantidad: " + cantidad);
                System.out.println("Precio $: " + precio);
                compra = (int) (precio * cantidad);
                compraTotal += compra;
                System.out.println("Precio total $: " + compra);
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
